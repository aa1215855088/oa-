package com.hnguigu.oa.realm;

import com.hnguigu.oa.domain.OaPrivilege;
import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.domain.OaRolePrivilege;
import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.service.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: shiroTest4
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-24 16:42
 **/
@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private OaUserService oaUserService;

    @Autowired
    private OaRolePrivilegeService oaRolePrivilegeService;

    @Autowired
    private OaUserRoleService oaUserRoleService;

    @Autowired
    private OaPrivilegeService oaPrivilegeService;

    /**
     * 为当前登录的Subject授予角色和权限
     *
     * @see :经测试:本例中该方法的调用时机为需授权资源被访问时
     * @see :经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
     * @see :个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache
     * @see :比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
        String username = (String) super.getAvailablePrincipal(principalCollection);
        List<String> roleList = new ArrayList<String>();
        List<String> permissionList = new ArrayList<String>();
        //从数据库中获取当前登录用户的详细信息
        OaUser user = this.oaUserService.getByUsername(username);
        if (null != user) {
            //实体类User中包含有用户角色的实体类信息
            List<OaRole> roles = oaUserRoleService.findRoleByUser(user);
            if (!CollectionUtils.isEmpty(roles)) {
                //获取当前登录用户的角色
                for (OaRole role : roles) {
                    roleList.add(role.getRoleName());
                    List<OaPrivilege> privileges = this.oaPrivilegeService.findPricilegeByRole(role);
                    //实体类Role中包含有角色权限的实体类信息
                    if (!CollectionUtils.isEmpty(privileges)) {
                        //获取权限
                        for (OaPrivilege pmss : privileges) {
                            if (!StringUtils.isEmpty(pmss.getPrivilegeCode())) {
                                permissionList.add(pmss.getPrivilegeCode());
                            }
                        }
                    }
                }
            }
        } else {
            throw new AuthorizationException();
        }
        //为当前用户设置角色和权限
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        simpleAuthorInfo.addRoles(roleList);
        simpleAuthorInfo.addStringPermissions(permissionList);
        return simpleAuthorInfo;

    }

    /**
     * 验证当前登录的Subject
     *
     * @see: 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取基于用户名和密码的令牌
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        //两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        System.out.println(this.oaUserService.getByUsername("123"));
        OaUser user = this.oaUserService.getByUsername(username);
        if (null != user) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getLoginName(), user.getUserPassword(), user.getUserName());
            this.setSession("currentUser", user);
            return authcInfo;
        } else {
            return null;
        }

        //此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息
        //说白了就是第一个参数填登录用户名,第二个参数填合法的登录密码(可以是从数据库中取到的,本例中为了演示就硬编码了)
        //这样一来,在随后的登录页面上就只有这里指定的用户和密码才能通过验证
    }


    /**
     * 将一些数据放到ShiroSession中,以便于其它地方使用
     */
    private void setSession(Object key, Object value) {
        Subject currentUser = SecurityUtils.getSubject();

        if (null != currentUser) {
            Session session = currentUser.getSession();
            System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
            if (null != session) {
                session.setAttribute(key, value);
            }
        }
    }

}

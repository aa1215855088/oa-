package com.hnguigu.oa.web.controller;

import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.service.OaUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-26 18:02
 **/
@Controller
public class LoginController {

    @RequestMapping("loginUI")
    public String loginUI() {
        return "System_User/loginUI";
    }

    @RequestMapping("login")
    public String login(String username, String password, HttpServletRequest request) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            request.setAttribute("message_login", "未知账户");
            return "forward:/error";
        } catch (IncorrectCredentialsException ice) {
            request.setAttribute("message_login", "密码不正确");
            return "forward:/error";
        } catch (LockedAccountException lae) {
            request.setAttribute("message_login", "账户已锁定");
            return "forward:/error";
        } catch (ExcessiveAttemptsException eae) {
            request.setAttribute("message_login", "用户名或密码错误次数过多");
            return "forward:/error";
        } catch (AuthenticationException ae) {
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
            ae.printStackTrace();
            request.setAttribute("message_login", "用户名或密码不正确");
            return "forward:/error";
        }


        if (subject.isAuthenticated()) {
            return "redirect:/index/home";
        } else {
            token.clear();
            return "";
        }
    }

    @RequestMapping("logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:loginUI";
    }
}

package com.hnguigu.oa.web.controller;

import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.service.OaUserService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-28 09:30
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private OaUserService oaUserService;

    @RequiresPermissions(value = {"user:list"}, logical = Logical.OR)
    @RequestMapping("list")
    public String list(Model model) {
        List<OaUser> oaUsers = oaUserService.listAll();
        model.addAttribute("oaUsers", oaUsers);
        return "System_User/list";
    }
}

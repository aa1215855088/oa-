package com.hnguigu.oa.web.controller;

import com.hnguigu.oa.domain.OaDepartment;
import com.hnguigu.oa.service.OaDepartmentService;
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
 * @create: 2018-08-28 15:42
 **/
@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private OaDepartmentService oaDepartmentService;

    @RequestMapping("list")
    @RequiresPermissions(value = "department:list")
    public String list(Model model) {
        List<OaDepartment> departments = this.oaDepartmentService.findAll();
        model.addAttribute("Departments", departments);
        return "System_Department/list";
    }

}

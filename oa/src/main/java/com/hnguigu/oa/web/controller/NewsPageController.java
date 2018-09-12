package com.hnguigu.oa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:16
 **/
@Controller
public class NewsPageController {

    @RequestMapping("/error")
    public String error() {
        return "common/error";
    }

    @RequestMapping("/noPrivilege")
    public String noPrivilege() {
        return "common/noPrivilege";
    }
}

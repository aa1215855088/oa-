package com.hnguigu.oa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-26 22:09
 **/
@Controller
@RequestMapping("index")
public class IndexController {


    @RequestMapping("/home")
    public String index() {
        return "index";
    }

    @RequestMapping("bottom")
    public String bottom() {
        return "bottom";
    }

    @RequestMapping("left")
    public String left() {
        return "left";
    }

    @RequestMapping("top")
    public String top() {
        return "top";
    }

    @RequestMapping("right")
    public String right() {
        return "right";
    }
}

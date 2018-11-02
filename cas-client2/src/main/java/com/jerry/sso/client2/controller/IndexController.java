package com.jerry.sso.client2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/2 15:20
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public String index() {
        return "index";
    }

}

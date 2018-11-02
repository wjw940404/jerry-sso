package com.jerry.sso.client1.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/2 15:18
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/get")
    public Object get(@RequestParam String id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        jsonObject.put("name", "Jerry");
        return jsonObject;
    }

}

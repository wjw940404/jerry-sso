package com.jerry.sso.client2.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/2 15:30
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/get")
    public Object get(@RequestParam String id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        jsonObject.put("name", "双肩包");
        jsonObject.put("fee", "100");
        return jsonObject;

    }

}

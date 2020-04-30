package com.sdty.tokentest.controller;


import cn.hutool.json.JSONObject;
import com.sdty.tokentest.Config.JwtConfig;
import com.sdty.tokentest.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("users")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {
    @Resource
    private JwtConfig jwtConfig;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUserInfo() {

        return "getUser: admin";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result dologin(String username,String password){
        String token =jwtConfig.createToken(username+password);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token",token);
        Result result = new Result(jsonObject);
        result.setCode(1);
        result.setMessage("登录成功！");
        return result;
    }
}

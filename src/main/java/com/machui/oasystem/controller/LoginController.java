package com.machui.oasystem.controller;

import com.machui.oasystem.common.model.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
    private final String TOKEN = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE1NzQ2MDI5MjcwNDEsImV4cCI6MTU3NTIwNzcyN30.fgObAKJZxdEkydT2HPcQAjtJpqT45q1ACUDe6XRMP4h4aMNOJPoiVWMJB0AQUaFqWfrbJgouyKV2DygJd7_4Zw";
    private final String TOKEN_HEAD = "Bearer";

    @RequestMapping("/login")
    public ApiResult login(){
        HashMap<String, String> data = new HashMap<>();
        data.put("token", TOKEN);
        data.put("tokenHead", TOKEN_HEAD);
        ApiResult<Object> apiResult = new ApiResult<>();
        apiResult.setCode(200);
        apiResult.setData(data);
        apiResult.setMessage("success");
        return apiResult;

    }


}
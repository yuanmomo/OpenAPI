package com.fdzang.microservice.data.api.controller;

import com.fdzang.microservice.common.entity.ApiResult;
import com.fdzang.microservice.common.framework.BaseController;
import com.fdzang.microservice.data.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghu
 * @Date: 2019/11/20 16:34
 */
@RestController
@RequestMapping("/api")
public class ApiController extends BaseController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/getApiByUrlAndMethod")
    public ApiResult getApiByUrlAndMethod(@RequestParam String url, @RequestParam String method){

        return ok(apiService.getApiByUrlAndMethod(url, method));
    }
}

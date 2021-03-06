package com.fdzang.microservice.ucenter.client;

import com.fdzang.microservice.common.entity.ApiResult;
import com.fdzang.microservice.ucenter.client.impl.UserModuleClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tanghu
 * @Date: 2019/11/21 10:07
 */
@FeignClient(value = "altair-ucenter-v1",fallbackFactory = UserModuleClientHystrix.class)
public interface UserModuleClient {

    @GetMapping("/user/module/getByModuleIdAndAccessId")
    ApiResult getByModuleIdAndAccessId(@RequestParam Integer moduleId, @RequestParam String accessId);
}

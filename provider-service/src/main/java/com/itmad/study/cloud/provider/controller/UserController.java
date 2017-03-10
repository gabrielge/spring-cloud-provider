package com.itmad.study.cloud.provider.controller;

import com.itmad.study.cloud.provider.api.UserAPI;
import com.itmad.study.cloud.provider.api.response.BaseResponse;
import com.itmad.study.cloud.provider.api.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Gabriel.Ge on 2017-02-28.
 */
@RestController
public class UserController implements UserAPI {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public BaseResponse findById(@PathVariable Long id) {
        LOGGER.info("调用了UserController.findById 方法,id={}", id);
        BaseResponse<Date> baseResponse = new BaseResponse();
        baseResponse.setCode(0);
        baseResponse.setData(new Date());
        return baseResponse;
    }

    /**
     * 本地服务实例的信息
     *
     * @return
     */
    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

    @PostMapping("/add")
    public BaseResponse addUser(@RequestBody UserVo vo) {
        LOGGER.info("调用了UserController.addUser 方法, vo={}", vo.toString());

        BaseResponse<Date> baseResponse = new BaseResponse();
        baseResponse.setCode(0);
        baseResponse.setData(new Date());
        return baseResponse;
    }

}

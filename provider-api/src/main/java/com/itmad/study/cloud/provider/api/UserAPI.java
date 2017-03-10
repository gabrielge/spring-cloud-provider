package com.itmad.study.cloud.provider.api;

import com.itmad.study.cloud.provider.api.response.BaseResponse;
import com.itmad.study.cloud.provider.api.vo.UserVo;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Gabriel.Ge on 2017-02-28.
 */
public interface UserAPI {
    @GetMapping("/{id}")
    BaseResponse findById(@PathVariable Long id);

    @GetMapping("/instance-info")
    ServiceInstance showInfo();

    @PostMapping("/add")
    BaseResponse addUser(@RequestBody UserVo vo);
}

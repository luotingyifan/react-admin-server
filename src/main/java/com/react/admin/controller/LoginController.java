package com.react.admin.controller;

import com.react.admin.entity.User;
import com.react.admin.model.ResultEntity;
import com.react.admin.service.LoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录控制器
 *
 * Created by Luo Ting on 2020-09-17
 */
@Log4j2
@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     *
     * @param accountNo 用户名
     * @param password 密码
     * @return
     */
    @PostMapping(value = "/token")
    public ResultEntity token(String accountNo, String password) {
        log.info("用户登录token, accountNo={}, password={}", accountNo, password);
        User user = loginService.token(accountNo, password);
        return ResultEntity.ok(user);
    }
}

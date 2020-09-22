package com.react.admin.service;

import com.react.admin.entity.User;
import com.react.admin.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户登录服务
 *
 * Created by Luo Ting on 2020-09-17
 */
@Log4j2
@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录认证
     *
     * @param accountNo
     * @param password
     * @return
     */
    public User token(String accountNo, String password) {
        User user = null;
        try {
            user = userMapper.findUserByAccountNoAndPassword(accountNo, password);
        } catch (Exception e) {
            log.error("用户登录认证error: ", e);
        }
        return user;
    }
}

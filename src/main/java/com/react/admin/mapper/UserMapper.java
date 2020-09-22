package com.react.admin.mapper;

import com.react.admin.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Luo Ting on 2020-09-17
 */
public interface UserMapper {

    /**
     * 根据用户名和密码查询用户信息
     *
     * @param accountNo
     * @param password
     * @return
     */
    User findUserByAccountNoAndPassword(@Param("accountNo") String accountNo, @Param("password") String password);
}

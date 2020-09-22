package com.react.admin.entity;

import lombok.Data;

/**
 * 系统用户表
 *
 * Created by Luo Ting on 2020-09-17
 */
@Data
public class User extends BaseEntity {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 登录账号
     */
    private String accountNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态（1、启用；2、禁用）
     */
    private Integer status;

}

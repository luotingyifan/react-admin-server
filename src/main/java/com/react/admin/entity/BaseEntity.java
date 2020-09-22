package com.react.admin.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Luo Ting on 2020-09-17
 */
@Data
public class BaseEntity {

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateUser;

}

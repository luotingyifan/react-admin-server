package com.react.admin.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Luo Ting on 2020-09-22
 */
@Data
public class ResultEntity<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private static final Integer SUCCESS_CODE = 200;
    private static final Integer ERROR_CODE = 400;
    private Integer code;
    private T data;
    private String content;

    public ResultEntity(T data, Integer code, String content) {
        this.data = data;
        this.code = code;
        this.content = content;
    }

    public static <T> ResultEntity<T> ok(T data) {
        return new ResultEntity<>(data, SUCCESS_CODE, null);
    }

    public static <T> ResultEntity<T> ok(String content) {
        return new ResultEntity<>(null, SUCCESS_CODE, content);
    }

    public static <T> ResultEntity<T> error(String content) {
        return new ResultEntity<>(null, ERROR_CODE, content);
    }

}

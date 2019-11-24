package com.machui.oasystem.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResult<T> implements Serializable {
    private int code;
    private Object Data;
    private String message;
}

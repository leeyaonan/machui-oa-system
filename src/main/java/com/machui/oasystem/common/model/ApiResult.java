package com.machui.oasystem.common.model;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {
    private int code;
    private Object Data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

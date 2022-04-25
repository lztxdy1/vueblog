package com.wang.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;


    public static Result success(Object data) {
        return Result.success(200, "操作成功", data);
    }

    public static Result success(int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg) {
        return Result.fail(400, msg, null);
    }

    public static Result fail(int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}

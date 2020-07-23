package com.fx.designpartterns.build;

/**
 * @Author: FangXu
 * @Date: 2020/7/22 16:18
 * @Version 1.0
 */
public class ResultBuild {
    private ResultTypeEnum resultType;
    private String code;
    private String message;
    private Object data;

    private ResultBuild() {
    }

    public static ResultBuild newInstance() {
        return new ResultBuild();
    }

    public ResultBuild type(ResultTypeEnum resultType) {
        this.resultType = resultType;
        return this;
    }

    public ResultBuild code(String code) {
        this.code = code;
        return this;
    }

    public ResultBuild message(String message) {
        this.message = message;
        return this;
    }

    public ResultBuild data(Object data) {
        this.data = data;
        return this;
    }

    public Result build() {
        Result result = new Result();
        result.setResultType(resultType);
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}

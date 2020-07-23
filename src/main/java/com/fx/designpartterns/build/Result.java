package us.codecraft.tinyioc.build;

/**
 * @Author: FangXu
 * @Date: 2020/7/22 16:16
 * @Version 1.0
 */
public class Result {

    private ResultTypeEnum resultType;
    private String code;
    private String message;
    private Object data;

    public ResultTypeEnum getResultType() {
        return resultType;
    }

    public void setResultType(ResultTypeEnum resultType) {
        this.resultType = resultType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultType=" + resultType +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

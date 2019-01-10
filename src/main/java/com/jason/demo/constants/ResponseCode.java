package com.jason.demo.constants;

/**
 * 返回状态码信息
 *
 * @author jason
 */
public enum ResponseCode {

    SUCCESS(0, "成功"),
    FAILURE(1, "未知错误，失败"),
    PARAM_EMPTY(10001, "参数为必填"),
    PARAM_INVALID(10002, "参数无效"),
    OBJECT_EXIST(10003, "对象已存在"),
    OBJECT_NOT_EXIST(10004, "对象不存在"),
    AUTH_FAIL(10005, "未授权操作"),
    PERMISSION_DENIED(10006, "无权限操作"),
    UNKNOWN_ERROR(10007, "系统繁忙，请稍后再试...."),
    NETWORK_ANOMALY(10008, "网络异常，请稍后重试"),
    SERVER_ERROR(10009, "服务器错误"),
    TOKEN_TIMEOUT(10010, "token过期或者无效"),
    CREATE_FAILURE(20001, "创建失败"),
    UPDATE_FAILURE(20002, "更新失败"),
    DELETE_FAILURE(20003, "删除失败"),
    FILE_NOT_FOUND(20004, "你要读取的资源找不到");

    /**
     * 返回码
     */
    private int value;

    /**
     * 返回说明
     */
    private String message;

    ResponseCode(int value, String message) {
        this.value = value;
        this.message = message;
    }

    /**
     * 获取返回码
     *
     * @return value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * 获取信息
     *
     * @return message
     */
    public String getMessage() {
        return this.message;
    }
}

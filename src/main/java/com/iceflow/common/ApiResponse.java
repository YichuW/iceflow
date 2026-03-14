package com.iceflow.common;

/**
 * 这是一个“统一返回结果类”。
 *
 * 作用：
 * 以后你的 Controller 不直接随便返回字符串、对象、数字，
 * 而是尽量统一返回 ApiResponse<T>。
 *
 * 你可以先把它理解成一个固定的响应外壳：
 * - code：状态码
 * - message：提示信息
 * - data：真正的数据
 *
 * 例如：
 * {
 *   "code": 200,
 *   "message": "success",
 *   "data": "iceflow running"
 * }
 *
 * 这里的 <T> 是 Java 泛型。
 * 你现在先不用死磕底层原理，只要知道：
 * T 代表 data 可以是不同类型。
 *
 * 比如：
 * ApiResponse<String>    -> data 是字符串
 * ApiResponse<User>      -> data 是用户对象
 * ApiResponse<List<?>>   -> data 是列表
 */
public class ApiResponse<T> {

    /**
     * 状态码
     * 一般可以约定：
     * 200 表示成功
     * 400 / 500 或自定义数字表示失败
     */
    private Integer code;

    /**
     * 提示信息
     * 比如 success、用户不存在、库存不足 等
     */
    private String message;

    /**
     * 真正返回给前端的数据
     */
    private T data;

    /**
     * 无参构造方法
     *
     * 有时候框架在序列化 / 反序列化对象时会需要它。
     * 先记住：Java 实体类、返回类通常建议保留无参构造。
     */
    public ApiResponse() {
    }

    /**
     * 全参构造方法
     *
     * 方便我们一次性创建完整对象。
     */
    public ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 下面是 getter / setter 方法。
     *
     * 它们的作用是：
     * 让外部代码可以读取和修改对象里的字段。
     *
     * 比如：
     * response.getCode()
     * response.setMessage("success")
     */

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 这是一个静态工具方法：返回“成功结果”。
     *
     * static 的意思你现在可以先理解成：
     * 不需要先 new 一个 ApiResponse 对象，
     * 也能直接通过类名调用这个方法。
     *
     * 比如以后你可以直接写：
     * ApiResponse.success("iceflow running")
     */
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "success", data);
    }

    /**
     * 这是一个静态工具方法：返回“失败结果”。
     *
     * 比如以后可以写：
     * ApiResponse.error(400, "库存不足")
     */
    public static <T> ApiResponse<T> error(Integer code, String message) {
        return new ApiResponse<>(code, message, null);
    }
}
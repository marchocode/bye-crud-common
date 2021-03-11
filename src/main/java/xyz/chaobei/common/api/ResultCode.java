package xyz.chaobei.common.api;

/**
 * 常用code 自定义，参考http code
 * https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Status
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2020-09-30
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(200, "操作成功"),
    FIELD_ERROR(401, "请求参数有误"),
    // 可以理解为。查询一个id的时候这个id不存在。则返回这个错误
    DATA_NOT_FOUND(404, "未查询到相关信息"),
    UN_AUTHORIZED(401, "登录信息过期"),
    UN_PERMISSION(403, "没有操作权限"),
    METHOD_NOT_ALLOWED(405, "请求类型异常"),
    // 异常逻辑、如用户名未找到等等。
    FAILED(500, "操作失败");

    private final long code;
    private final String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
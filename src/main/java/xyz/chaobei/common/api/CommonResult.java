package xyz.chaobei.common.api;

/**
 * 自定义返回类型
 *
 * @param <T> 泛型、指定返回的类型.
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2020-09-30
 */
public class CommonResult<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    private CommonResult() {
    }

    /**
     * <p>基本构造函数
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param code    返回参数
     * @param message 返回信息
     * @param data    返回数据
     * @since 2020/9/30
     **/
    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 返回一个成功的类型
     * author:<a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param data 返回数据
     * @param <T>  返回类型
     * @return xyz.chaobei.common.api.CommonResult
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 返回一个成功的类型，并且附带提示信息.
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param data    返回数据
     * @param message 返回信息
     * @param <T>     返回类型
     * @return xyz.chaobei.common.api.CommonResult
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 通过一个boolean 类型自动确定返回值
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param result 返回布尔
     * @return xyz.chaobei.common.api.CommonResult
     * @since 2020/9/30
     **/
    public static CommonResult result(Boolean result) {
        if (result) {
            return success(true);
        }
        return failed();
    }

    /**
     * 返回一个操作失败类型
     *
     * @param errorCode 自定义code
     * @param <T>       null
     * @return 返回一个操作失败类型
     * @see IErrorCode
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 返回一个自定义操作失败类型。传递操作失败的原因
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param message 自定义返回信息
     * @param <T>     null
     * @return xyz.chaobei.common.api.CommonResult
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 返回一个操作失败
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param <T> null
     * @return xyz.chaobei.common.api.CommonResult
     * @see IErrorCode
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数校验异常
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param <T> null
     * @return xyz.chaobei.common.api.CommonResult
     * @see IErrorCode
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数校验异常，并提示信息
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param message 提示语句
     * @param <T> null
     * @return xyz.chaobei.common.api.CommonResult
     * @see IErrorCode
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 提示前端需要进行认证操作
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param <T> null
     * @param data 指定返回的信息
     * @return xyz.chaobei.common.api.CommonResult
     * @see IErrorCode
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 无相关权限信息
     * <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param <T> null
     * @param data 具体返回信息
     * @return xyz.chaobei.common.api.CommonResult
     * @see IErrorCode
     * @since 2020/9/30
     **/
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
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
}
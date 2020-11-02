package xyz.chaobei.common.exception;

import xyz.chaobei.common.api.IErrorCode;

/**
 * 自定义异常信息
 * https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Status
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2020-09-30
 */
public class ApiException extends RuntimeException {
    // 异常code
    private IErrorCode errorCode;

    public ApiException(IErrorCode iErrorCode) {
        super(iErrorCode.getMessage());
        this.errorCode = iErrorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
package xyz.chaobei.common.exception;

import xyz.chaobei.common.api.IErrorCode;

public class Asserts {
    /**
     * <p>断言抛出一个异常
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param message 提示语
     * @since 2020/10/15
     **/
    public static void fail(String message) {
        throw new ApiException(message);
    }

    /**
     * <p>断言抛出一个异常
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param iErrorCode 异常code与message
     * @since 2020/10/15
     **/
    public static void fail(IErrorCode iErrorCode) {
        throw new ApiException(iErrorCode);
    }
}
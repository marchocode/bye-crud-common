package xyz.chaobei.common.api;

/**
 * 自定义返回类型接口
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @see IErrorCode
 * @since 2020-09-30
 */
public interface IErrorCode {
    /**
     * 接口定义返回一个操作code
     *
     * @return code 具体的返回值
     */
    long getCode();

    /**
     * 接口定义提示的信息
     *
     * @return 提示语
     */
    String getMessage();
}
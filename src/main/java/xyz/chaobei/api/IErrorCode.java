package xyz.chaobei.api;

/**
 *
 * 定义返回字段需要实现的接口
 * 需要code 以及 message
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
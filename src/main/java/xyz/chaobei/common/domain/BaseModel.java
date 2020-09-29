package xyz.chaobei.common.domain;

import java.util.Date;

/**
 * @author MRC
 * @title 一般用于分页的baseModel
 */
public class BaseModel {
    /**
     * 当前页数 默认1
     */
    protected Long current = 1L;
    /**
     * 分页大小
     */
    protected Long size = 10L;
    /**
     * 时间搜索起止
     */
    protected Date startTime;
    /**
     * 时间搜索结束
     */
    protected Date endTime;
}
package xyz.chaobei.common;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.lang.reflect.Field;

/**
 * 构建mybatis plus query
 *
 * @author <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2021/1/21
 */
public class WrapperBuilder {

    public static <T> QueryWrapper<T> simpleQuery(T t) {

        QueryWrapper<T> wrapper = new QueryWrapper<>();
        Field[] fields = t.getClass().getDeclaredFields();

        try {
            for (Field item : fields) {
                if (!item.isAccessible()) {
                    item.setAccessible(true);
                }
                TableField tableField = item.getAnnotation(TableField.class);

                Object value = item.get(t);
                String column = tableField.value();
                wrapper.eq(column, value);

                if (item.isAccessible()) {
                    item.setAccessible(false);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wrapper;
    }
}

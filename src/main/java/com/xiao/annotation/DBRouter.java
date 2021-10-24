package com.xiao.annotation;

import java.lang.annotation.*;

/**
 * @description: 路由注解
 * @author：Carl-Xiao
 * @date: 2021/10/20
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {
    /**
     * 分库分表字段
     * @return
     */
    String key() default "";

}

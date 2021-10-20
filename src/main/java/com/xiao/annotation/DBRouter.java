package com.xiao.annotation;

/**
 * @description: 路由注解
 * @author：Carl-Xiao
 * @date: 2021/10/20
 */
public @interface DBRouter {
    /**
     * 分库分表字段
     * @return
     */
    String key() default "";

}

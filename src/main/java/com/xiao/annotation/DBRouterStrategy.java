package com.xiao.annotation;

import java.lang.annotation.*;

/**
 * @description: 路由策略，分表标记
 * @author：Carl-Xiao
 * @date: 2021/10/20
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {
    boolean splitTable() default false;
}

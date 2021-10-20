package com.xiao.annotation;

/**
 * @description: 路由策略，分表标记
 * @author：Carl-Xiao
 * @date: 2021/10/20
 */
public @interface DBRouterStrategy {
    boolean splitTable() default false;
}

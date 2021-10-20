package com.xiao.router.strategy;

/**
 * @description: 路由策略
 * @author：Carl-Xiao
 * @date: 2021/10/20
 */
public interface IDBRouterStrategy {
    /**
     * 路由
     * @param dbKeyAttr
     */
    void doRouter(String dbKeyAttr);

    /**
     * 清理路由
     */
    void clear();
}

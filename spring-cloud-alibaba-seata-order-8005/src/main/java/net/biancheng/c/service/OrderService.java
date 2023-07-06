package net.biancheng.c.service;

import net.biancheng.c.entity.CommonResult;
import net.biancheng.c.entity.Order;

public interface OrderService {
    /**
     * 创建订单数据
     * @param order
     */
    CommonResult create(Order order);
}
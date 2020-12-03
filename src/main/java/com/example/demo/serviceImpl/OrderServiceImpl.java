package com.example.demo.serviceImpl;

import com.example.demo.pojo.Order;
import com.example.demo.dao.OrderMapper;
import com.example.demo.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihu
 * @since 2020-12-03
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}

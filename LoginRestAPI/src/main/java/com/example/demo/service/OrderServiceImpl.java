package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Order;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getSalesReportByDuration(Date startDate, Date endDate) {
        // Implement logic to retrieve sales report between the specified duration
        return orderRepository.findByOrderDateBetween(startDate, endDate);
    }
}

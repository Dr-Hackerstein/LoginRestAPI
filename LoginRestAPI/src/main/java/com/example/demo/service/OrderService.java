package com.example.demo.service;

import java.util.Date;
import java.util.List;
import com.example.demo.model.Order;

public interface OrderService {
    List<Order> getSalesReportByDuration(Date startDate, Date endDate);
}

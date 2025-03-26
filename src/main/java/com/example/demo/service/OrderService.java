package com.example.demo.service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
    
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
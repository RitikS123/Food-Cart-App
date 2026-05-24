package com.phegon.FoodApp.order.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.phegon.FoodApp.auth_users.dtos.UserDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {

    private Long id;

    private LocalDateTime orderDate;

    private BigDecimal totalAmount;

    private OrderStatus orderStatus;

    private PaymentStatus paymentStatus;

    private UserDTO user; //Customer who made the order

    private List<OrderItemDTO> orderItems;
}

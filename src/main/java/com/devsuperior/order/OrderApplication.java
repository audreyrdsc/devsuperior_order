package com.devsuperior.order;

import com.devsuperior.order.entities.Order;
import com.devsuperior.order.services.OrderService;
import com.devsuperior.order.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	@Autowired
	ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034,150.0, 20.0);
		System.out.println("Pedido " + order1.getCode() + " Valor R$ " + String.format("%.2f", orderService.total(order1)));
		Order order2 = new Order(2282,800.0, 10.0);
		System.out.println("Pedido " + order2.getCode() + " Valor R$ " + String.format("%.2f", orderService.total(order2)));
		Order order3 = new Order(1309,95.90, 0.0);
		System.out.println("Pedido " + order3.getCode() + " Valor R$ " + String.format("%.2f", orderService.total(order3)));
	}
}

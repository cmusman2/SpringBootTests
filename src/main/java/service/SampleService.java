package service;

import obj.Order;

public interface SampleService {

	public String getOrderDescription();
	public String getOrderStringCode();
	public Order getOrder(int id);
	public Order createOrder(Order order);
	
	
}


package application.enun;

import java.util.Date;

import entities.Order;
import entities.Enum.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);

		//Convertendo String para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println(os1);
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os2);
		
		
	
	}
	

}

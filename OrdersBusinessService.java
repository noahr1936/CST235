package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {
	
	List<Order> orders = new ArrayList<Order>();

	@Override
	public void test() {
		System.out.println("Application is running!");

	}
	
	public OrdersBusinessService() {
		orders.add(new Order("FLJ1", "FOOTBALL", (float)15.50, 5));
		orders.add(new Order("FLJ2", "SOCCER BALL", (float)14.20, 50));
		orders.add(new Order("FLJ3", "BASKETBALL", (float)13.30, 7));
		orders.add(new Order("FLJ4", "GOLFBALL", (float)12.24, 6));
		orders.add(new Order("FLJ5", "BIRDIE", (float)11.70, 20));
		orders.add(new Order("FLJ6", "SOFTBALL", (float)10.45,1));
		orders.add(new Order("FLJ7", "BASEBALL", (float)9.78, 60));
		orders.add(new Order("FLJ8", "SPIKEBALL", (float)8.81, 3));
		orders.add(new Order("FLJ9", "FRISBEE", (float)7.99, 15));
		orders.add(new Order("FLJ10", "TENNIS BALL", (float)5.99, 100));
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		// TODO Auto-generated method stub
		this.orders = orders;
	}

}

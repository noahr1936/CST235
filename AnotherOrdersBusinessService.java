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
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {
	
	List<Order> orders = new ArrayList<Order>();

	@Override
	public void test() {
		System.out.println("Application is running but in another class!");

	}
	
	public AnotherOrdersBusinessService() {
		orders.add(new Order("FLJa", "ALTERNATIVE FOOTBALL", (float)15.50, 5));
		orders.add(new Order("FLJb", "ALTERNATIVE SOCCER BALL", (float)14.20, 50));
		orders.add(new Order("FLJc", "ALTERNATIVE BASKETBALL", (float)13.30, 7));
		orders.add(new Order("FLJd", "ALTERNATIVE GOLFBALL", (float)12.24, 6));
		orders.add(new Order("FLJe", "ALTERNATIVE BIRDIE", (float)11.70, 20));
		orders.add(new Order("FLJf", "ALTERNATIVE SOFTBALL", (float)10.45,1));
		orders.add(new Order("FLJg", "ALTERNATIVE BASEBALL", (float)9.78, 60));
		orders.add(new Order("FLJh", "ALTERNATIVE SPIKEBALL", (float)8.81, 3));
		orders.add(new Order("FLJi", "ALTERNATIVE FRISBEE", (float)7.99, 15));
		orders.add(new Order("FLJj", "ALTERNATIVE TENNIS BALL", (float)5.99, 100));
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		this.orders = orders;
		
	}

}

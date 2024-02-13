package practice;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private static OrderList instance;
    private List<Order> orders;
    private Long orderId;

    public OrderList() {
        this.orders = new ArrayList<>();
        this.orderId = 0L;
    }

    public static OrderList getInstance(){
        if (instance == null) instance = new OrderList();
        return instance;
    }

    //Order 추가
    public void addOrder(String name, Long quan, Long price) {
        Order temp = new Order(++orderId, name, quan, price);
        orders.add(temp);
    }

    //orders에 있는 주문들 다 보여주기
    public void printOrders(){
        for(Order temp : orders) System.out.println("id : " + temp.getId() + " name : " + temp.getName()
        + " quantity : " + temp.getQuan() + " price : " + temp.getPrice());
    }
}

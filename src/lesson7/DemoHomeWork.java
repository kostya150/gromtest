package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {
        DemoHomeWork order = new DemoHomeWork();
        order.createOrder();
        order.createOrderAndCallMethods();
    }
    static Order createOrder() {
        Order order = new Order(100, new Date(),false,null,"Dnepr","Ukraine","Buy");
        return order;
    }
    static Order createOrderAndCallMethods(){
        Order order = new Order(100,new Date(),false,new Date(),"Kiev","Ukraine","SomeValue");
        order.confirmOrder();
        order.checkPrice();
        order.isValidType();
        return order;
    }
}

package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        OrderFabric orderFabric = new OrderFabric();
        SaveOrder saveOrder = new SaveOrder();
        orderFabric.inputFromConsole(order);
        saveOrder.saveToJson(order);

    }

}

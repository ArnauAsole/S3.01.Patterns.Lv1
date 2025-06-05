package org.example;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    private final Stack<Order> orders;

    private Undo() {
        orders = new Stack<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.push(order);
    }

    public Order undoOrder() {
        if (!orders.isEmpty()) {
            return orders.pop();
        }
        return null;
    }

    public List<Order> getHistory() {
        List<Order> history = new ArrayList<>();
        for (int i = orders.size() - 1; i >= 0; i--) {
            history.add(orders.get(i));
        }
        return history;
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }
}

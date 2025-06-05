package org.example;

public class Order {
    private final String command;

    public Order(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return command;
    }
}

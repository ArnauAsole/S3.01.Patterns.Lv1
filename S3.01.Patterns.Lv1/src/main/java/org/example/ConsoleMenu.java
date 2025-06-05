package org.example;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private final Scanner scanner;
    private final Undo undoManager;

    public ConsoleMenu() {
        scanner = new Scanner(System.in);
        undoManager = Undo.getInstance();
    }

    public void start() {
        System.out.println("Menú de comandes (afegeix, undo, history, sortir)");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            switch (input.toLowerCase()) {
                case "sortir":
                    System.out.println("Sortint...");
                    return;

                case "undo":
                    Order undone = undoManager.undoOrder();
                    if (undone != null) {
                        System.out.println("Comanda desfeta: " + undone);
                    } else {
                        System.out.println("No hi ha comandes per desfer.");
                    }
                    break;

                case "history":
                    List<Order> history = undoManager.getHistory();
                    if (history.isEmpty()) {
                        System.out.println("Historial buit.");
                    } else {
                        System.out.println("Historial de comandes:");
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println((i + 1) + ". " + history.get(i));
                        }
                    }
                    break;

                default:
                    undoManager.addOrder(new Order(input));
                    System.out.println("Comanda afegida.");
                    break;
            }
        }
    }
}


package task2.Input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int ask(String question, int menuMax) {

        System.out.println(question);
        int menuItem = Integer.parseInt(scanner.nextLine());
        if(menuItem == -1) {
            System.exit(0);
        }
        if(menuItem < 0 || menuItem >= menuMax) {
            throw new MenuOutException("Invalid menu key");
        }
        return menuItem;
    }
}

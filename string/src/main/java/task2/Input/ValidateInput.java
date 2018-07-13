package task2.Input;

public class ValidateInput implements Input {

    private Input input;

    public ValidateInput(Input input){
        this.input = input;
    }

    @Override
    public int ask(String question, int menuMax) {
        int menuItem = -1;
        do {
            try {
                menuItem = input.ask(question, menuMax);
            } catch (MenuOutException moe) {
                System.out.println("Please, enter correct number of menu item");
            } catch (NumberFormatException nfe) {
                System.out.println("Please, enter valid number of menu item");
            }
        } while (menuItem == -1);
        return menuItem;
    }
}

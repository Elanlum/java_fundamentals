package task2;

import task2.AppMenu.LanguageSelect;
import task2.AppMenu.Quiz;
import task2.Input.ConsoleInput;
import task2.Input.Input;
import task2.Input.ValidateInput;

import java.util.Locale;
import java.util.ResourceBundle;

public class StartConsoleApp {

    private Input userInput;
    private Locale locale;

    public StartConsoleApp(Input userInput){
        this.userInput = userInput;
    }

    public void init() {
        System.out.println("### Welcome to the ConsoleApp 1.0 ###");
        System.out.println("Please, select the interface language. Insert -1 to quit.");
        LanguageSelect.showAppMenu();
        locale = LanguageSelect.getLanguageByKey(userInput.ask("Enter Your choice, please: ", LanguageSelect.values().length)).getLocale();
        Quiz quiz = Quiz.newQuiz(locale);
        ResourceBundle menuResourceBundle = ResourceBundle.getBundle("menu", locale);
        do{
            System.out.println(menuResourceBundle.getString("questions"));
            quiz.showQuestions();
            System.out.println(menuResourceBundle.getString("answers") + quiz.getAnswer(userInput.ask(menuResourceBundle.getString("select"), quiz.getQuestionsLength())));
        } while(true);
    }
    public static void main(String[] args) {
        new StartConsoleApp(new ValidateInput(new ConsoleInput())).init();

    }
}

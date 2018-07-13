package task2.AppMenu;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Quiz {
    private String[] questions;
    private String[] answers;

    public Quiz(String[] questions, String[] answers){
        this.questions = questions;
        this.answers = answers;
    }

    public static Quiz newQuiz(Locale locale){
        ResourceBundle qiuzResourceBundle = ResourceBundle.getBundle("quiz", locale);
        Set<String> keys = qiuzResourceBundle.keySet();
        ArrayList<String> questionsList = new ArrayList<>();
        ArrayList<String> answersList = new ArrayList<>();
        for(String key : keys){
            String[] splitedString = qiuzResourceBundle.getString(key).split("/=/");
            questionsList.add(splitedString[0].trim());
            answersList.add(splitedString[1].trim());
        }
        return new Quiz(questionsList.toArray(new String[questionsList.size()]), answersList.toArray(new String[answersList.size()]));
    }

    public void showQuestions(){
        for(int i = 0; i < questions.length; i++){
            System.out.println(String.format("%d. %s", i, questions[i]));
        }
    }

    public int getQuestionsLength(){
        return questions.length;
    }

    public String getAnswer (int questionNumber){
        return answers[questionNumber];
    }
}

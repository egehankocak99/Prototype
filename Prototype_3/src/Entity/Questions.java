package Entity;

import java.util.HashMap;
import java.util.Map;

public class Questions {
    private Map<String, String> questions = new HashMap<>();

    public void addQuestion(String question, String answer) {
        questions.put(question, answer);
    }

    public String getAnswer(String question) {
        return questions.get(question);
    }
}

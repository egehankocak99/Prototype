package Entity;

public class Feedback {
    private int id;
    private String text;

    public Feedback(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}

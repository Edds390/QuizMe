package sample;

/**
 * Created by eds on 8/04/2017.
 */
public class Subject {
    String _desc;
    QuestionList _ql;

    public Subject(String description){
        _desc = description;
        _ql = new QuestionList();
    }

}

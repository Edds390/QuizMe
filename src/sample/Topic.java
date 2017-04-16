package sample;

import java.util.List;

/**
 * Topic abstraction: topics are subtopics within a Subject. It is expected that most
 * subjects can be broken down into distinct subjects, thus students can concentrate
 * specifically on those subjects that they struggle with, rather than having to revise
 * those topics that theyre confident with.
 * Created by eds on 14/04/2017.
 */
public class Topic {
    private String _desc;
    private QuestionList _ql;

    public Topic(String topicTitle, List qList){
        _desc = topicTitle;
        _ql = createQlist(qList);
    }

    private QuestionList createQlist(List qList){
        QuestionList customQlist = new QuestionList(qList);
        return customQlist;
    }
}

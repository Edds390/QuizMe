package sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by eds on 8/04/2017.
 */
public class SubjectDatabase {
    private int _subjectCount= 1;

    HashMap<String, Subject> subjectMap = new LinkedHashMap<String, Subject>();

    public SubjectDatabase(List subjectList){
        subjectMap = new LinkedHashMap<String, Subject>();
    }

    public void addSubject(String subjectName){
        Subject newSubject = new Subject(subjectName);
        subjectMap.put(subjectName, newSubject);
    }

    //takes in name of subject as well as topic to question list
    public void addSubject(String subjectName, Map<String, List> topicMap){
        Subject newSubject = new Subject(subjectName);
        for (String topicKey : topicMap.keySet()) {
            Topic topic = new Topic(topicKey, topicMap.get(topicKey));
        }

        subjectMap.put("Subject "+ _subjectCount, newSubject);
        _subjectCount++;
    }
}

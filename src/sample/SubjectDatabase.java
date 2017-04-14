package sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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
        Subject newSubject = new Subject();
        subjectMap.put(subjectName, newSubject);
    }

    public void addSubject(){
        Subject newSubject = new Subject();

        subjectMap.put("Subject "+ _subjectCount, newSubject);
        _subjectCount++;
    }
}

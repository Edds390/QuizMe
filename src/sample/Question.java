package sample;

/**
 * Created by eds on 8/04/2017.
 */
public class Question {
    private final String _questionString;
    private final String _answerString;
    private int[] statsArray; //shown, focus, total

    public Question(String qString, String aString){
        _questionString = qString;
        _answerString = aString;
    }

    public String showAnswer(){
        return _answerString;
    }

    public String showQuestion() {
        return _questionString;
    }

    public void incrementFocus() {
        statsArray[1]++;
    }

    public double getRejectChance(){
        double rejectProb = statsArray[0]*0.25;
        if (rejectProb>= 1) {
            return 1;
        } else if (statsArray[1] >0){
            return 0;
        } else {
            return rejectProb;
        }
    }

    public double getFocusNum() {
        return statsArray[1];
    }

    public void clearFocus(){
        statsArray[1] = 0;
    }


}

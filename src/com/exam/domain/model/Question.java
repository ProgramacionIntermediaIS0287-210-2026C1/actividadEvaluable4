package domain;

public abstract class Question {

    protected QuestionId id;
    protected String text;
    protected AnswerText correctAnswer;

    public boolean isCorrect(AnswerText studenAnswer){

    }

    public void displayFormat(){
        
    }
}
package main;

public class MultipleChoiceQuestion extends Question {

    // Constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A" or "B"

        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
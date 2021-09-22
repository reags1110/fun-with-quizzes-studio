package main;

public class QuizRunnerClass {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What color are flamingos?\nA: Blue\nB: Yellow\nC: Pink\nPlease just type a single letter as an answer","C");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply, which animals cannot fly?\nA: Penguins\nB: Eagles\nC: Owls\nD: Ostrich", "A, D");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are omnivorous?\n True or False?", "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion("Pandas are from which country?", "China");
        myQuiz.addQuestion(myShortAnswerQuestion);

        LinearScaleQuestion myLinearScaleQuestion = new LinearScaleQuestion("On a scale from 1-10 how hot is Chris Hemsworth?", 10, 5, 10 );
        myQuiz.addQuestion(myLinearScaleQuestion);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why animals are amazing?", "Because they are");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();


    }
}

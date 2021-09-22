package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    // Class variables
    private ArrayList<Question> questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public Quiz() {

    }

    // Methods

    public ArrayList<Question> getQuestions() { return this.questions; }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        // Loop through each question
        for (Question question : questions) {
            // Ask the user the question
            System.out.println(question.getTheQuestion());
            // Get the users answer
            String usersAnswer = this.getUsersAnswer();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            // Increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        // Grede the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswer() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}

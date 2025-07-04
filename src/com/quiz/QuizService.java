package com.quiz;

import java.util.*;

public class QuizService {
    private List<QuizQuestion> questions = new ArrayList<>();
    private int score = 0;

    public QuizService() {
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(new QuizQuestion(
                "1. What are Java loops?",
                new String[]{"a) Methods", "b) Classes", "c) Control structures", "d) Packages"},
                'c'));

        questions.add(new QuizQuestion(
                "2. What is enhanced for-loop?",
                new String[]{"a) While loop", "b) Loop using collections", "c) If-else", "d) Recursion"},
                'b'));

        // Add more questions here following the same format...
    }

    public void startQuiz() {
        Scanner input = new Scanner(System.in);

        for (QuizQuestion q : questions) {
            System.out.println(q.getQuestionText());
            for (String choice : q.getChoices()) {
                System.out.println(choice);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char answer = input.next().toLowerCase().charAt(0);

            if (answer == q.getCorrectOption()) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Quiz complete!");
        System.out.println("Your final score is: " + score + "/" + questions.size());
        input.close();
    }
}


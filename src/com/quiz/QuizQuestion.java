package com.quiz;

public class QuizQuestion {
    private String questionText;
    private String[] choices;
    private char correctOption;

    public QuizQuestion(String questionText, String[] choices, char correctOption) {
        this.questionText = questionText;
        this.choices = choices;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getChoices() {
        return choices;
    }

    public char getCorrectOption() {
        return correctOption;
    }
}
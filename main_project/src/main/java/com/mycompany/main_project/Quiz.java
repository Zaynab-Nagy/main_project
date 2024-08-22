/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_project;

/**
 *
 * @author HP
 */
import java.util.List;
import java.util.Scanner;
class Quiz {
      private String quizName;
    private List<Question> questions;

    public Quiz(String quizName, List<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (question.isCorrect(userAnswer - 1)) {
                score++;
            }
        }

        System.out.println("You scored " + score + " out of " + questions.size());
        scanner.close();
    }
}

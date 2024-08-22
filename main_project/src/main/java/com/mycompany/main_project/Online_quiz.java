/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main_project;

/**
 *
 * @author HP
 */
import java.util.Arrays;
public class Online_quiz {

    public static void main(String[] args) {
        Question q1 = new Question("Which language is primarily used for Android app development?", 
                                   Arrays.asList("Python", "Java", "Swift", "C++"), 1);
        
        Question q2 = new Question("Which programming language is known for its use in web development and is often used with HTML and CSS?", 
                                   Arrays.asList("Java", "JavaScript", "C#", "Ruby"), 1);

        Question q3 = new Question("Which programming language is known for its simplicity and readability, often used in data science?", 
                                   Arrays.asList("Java", "Python", "C", "JavaScript"), 1);

        Question q4 = new Question("Which programming language was developed by Apple for iOS and macOS application development?", 
                                   Arrays.asList("Objective-C", "Swift", "Kotlin", "JavaScript"), 1);

        Question q5 = new Question("Which programming language is commonly used for developing Windows applications and has a strong type system?", 
                                   Arrays.asList("C#", "Java", "Python", "Ruby"), 0);

        // Create a quiz
        Quiz quiz = new Quiz("Programming Languages Quiz", Arrays.asList(q1, q2, q3, q4, q5));

        // Start the quiz
        quiz.startQuiz();
    }
}
    


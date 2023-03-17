package com.le.hellospring.quiz;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@SuppressWarnings("unused")
@Entity
public class QuizQuery {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private String correctAnswer;

    @Enumerated(EnumType.STRING)
    private Level level;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    // getters and setters
}

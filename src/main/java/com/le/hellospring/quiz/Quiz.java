package com.le.hellospring.quiz;

import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "quiz_id")
    private List<QuizQuestion> quiz;

    public List<QuizQuestion> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<QuizQuestion> quiz) {
        this.quiz = quiz;
    }

    @Entity
    @Table(name = "quiz_question")
    public static class QuizQuestion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "level")
        private Level level;

        @Column(name = "question")
        private String question;

        @ElementCollection
        @MapKeyColumn(name = "answer_key")
        @Column(name = "answer_value")
        @CollectionTable(name = "quiz_question_answers", joinColumns = @JoinColumn(name = "question_id"))
        private Map<String, String> answers;

        @Column(name = "correct_answer")
        private String correctAnswer;


        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public Map<String, String> getAnswers() {
            return answers;
        }

        public void setAnswers(Map<String, String> answers) {
            this.answers = answers;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
    }
}


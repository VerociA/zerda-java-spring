package com.greenfox.exams.spring.Domain;

import javax.persistence.*;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
@Entity
@Table(name = "t_feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String feeling;
    private int score;
    private String email;

    public Feedback() {
    }

    public Feedback(String feeling, int score, String email) {
        this.feeling = feeling;
        this.score = score;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

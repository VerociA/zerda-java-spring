package com.greenfox.exams.spring.Service;

import com.greenfox.exams.spring.Domain.Feedback;
import com.greenfox.exams.spring.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
@Service
public class FeedbackService {
    FeedbackRepository repository;

    @Autowired
    public FeedbackService(FeedbackRepository repository) {
        this.repository = repository;
    }

    public void saveFeedback(Feedback feedback) {
        repository.save(feedback);
    }

    public void submit(int id) {
        Feedback feedback = repository.findOne(id);
        repository.save(feedback);
    }
}

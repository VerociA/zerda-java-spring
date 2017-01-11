package com.greenfox.exams.spring.Repository;

import com.greenfox.exams.spring.Domain.Feedback;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
}

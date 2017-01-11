package com.greenfox.exams.spring.Repository;

import com.greenfox.exams.spring.Domain.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
public interface ProjectRepo extends CrudRepository<Project, Integer> {
}

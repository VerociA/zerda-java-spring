package com.greenfox.exams.spring.Service;

import com.greenfox.exams.spring.Domain.Project;
import com.greenfox.exams.spring.Repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
@Service
public class ProjectService {
    ProjectRepo repo;

    @Autowired
    public ProjectService(ProjectRepo repo) {
        this.repo = repo;
    }

    public List<Project> getAllProjects() {
        return (List<Project>) repo.findAll();
    }

}

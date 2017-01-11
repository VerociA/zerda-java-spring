package com.greenfox.exams.spring.Domain;

import javax.persistence.*;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
@Entity
@Table(name = "t_project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;

    private String name;
    private String type;

    public Project() {
    }

    public Project(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anna on 17/01/11.
 */
@Service
public class ProjectService {

    @Autowired
    ProjectRepository repository;

    public Iterable<Project> list() {
        return repository.findAll();
    }
}

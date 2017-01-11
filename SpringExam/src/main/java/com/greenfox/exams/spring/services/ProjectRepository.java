package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anna on 17/01/11.
 */
public interface ProjectRepository extends CrudRepository<Project, Long>{
}

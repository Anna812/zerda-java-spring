package com.greenfox.exams.spring;

import com.greenfox.exams.spring.models.Project;
import com.greenfox.exams.spring.services.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Anna on 17/01/11.
 */
@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    ProjectRepository repo;

    @Override
    public void run(String... strings) throws Exception {
//        repo.save(new Project("Clash of Zerda", "android"));
//        repo.save(new Project("Clash of Zerda", "spring"));
//        repo.save(new Project("Zerda Reader", "android"));
//        repo.save(new Project("Zerda Reader", "spring"));
//        repo.save(new Project("Konnekt Contact Manager", "spring"));
    }
}

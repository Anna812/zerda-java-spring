package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anna on 17/01/11.
 */
@Service
public class AnswerService {

    @Autowired
    AnswerRepository repository;

    public void save(Answer answer) {
        repository.save(answer);
    }

    public Answer find(long id) {
        return repository.findOne(id);
    }
}

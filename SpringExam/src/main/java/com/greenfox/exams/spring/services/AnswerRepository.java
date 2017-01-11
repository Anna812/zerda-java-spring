package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Answer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anna on 17/01/11.
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {
}

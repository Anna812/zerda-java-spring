package com.greenfox.exams.spring.models;

import com.greenfox.exams.spring.validators.CheckEmail;
import com.greenfox.exams.spring.validators.CheckExperience;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by Anna on 17/01/11.
 */
@Entity
@Table(name="answers")
@Getter
@Setter
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue
    private long id;
    @CheckExperience(message = "You must be more enthusiastic and positive.")
    private String experience;
    @NotNull(message = "You can not leave this field empty.")
    @Min(value = 10, message = "Input must be 10 or greater.")
    private int levelOfRecommendation;
    @CheckEmail(message="Please provide a valid email address")
    private String email;
}

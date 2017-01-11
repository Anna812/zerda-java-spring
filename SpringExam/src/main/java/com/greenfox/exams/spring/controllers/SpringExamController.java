package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.models.Answer;
import com.greenfox.exams.spring.services.AnswerService;
import com.greenfox.exams.spring.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Anna on 17/01/11.
 */
@Controller
public class SpringExamController {

    @Autowired
    AnswerService answerService;
    @Autowired
    ProjectService projectService;

    @GetMapping("")
    public String displayForm(Answer answer) {
        return "welcome";
    }

    @PostMapping("")
    public String validate(@Valid Answer answer, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "welcome";
        } else{
            answerService.save(answer);
            return "redirect:/thankyou";
        }
    }

    @RequestMapping("/thankyou")
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.list());
        return "thankyou";
    }
}

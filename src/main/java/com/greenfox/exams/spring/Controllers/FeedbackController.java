package com.greenfox.exams.spring.Controllers;

import com.greenfox.exams.spring.Domain.Feedback;
import com.greenfox.exams.spring.Service.FeedbackService;
import com.greenfox.exams.spring.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Verőci Ádám on 2017.01.11..
 */
@Controller
public class FeedbackController {
    private FeedbackService service;
    private ProjectService serv;

    @Autowired
    public FeedbackController(FeedbackService service, ProjectService serv) {
        this.service = service;
        this.serv = serv;
    }

    @GetMapping(value = "/welcome")
    public String index(){
        return "welcome";
    }

    @GetMapping(value = "/welcome/submit")
    public String submit(Model model){
        model.addAttribute("submit", new Feedback());
        return "";
    }

    @PostMapping(value = "/welcome/submit")
    public String submitFeedback(@ModelAttribute Feedback feedback){
        service.saveFeedback(feedback);
        return "redirect:/thanks";
    }


    @GetMapping(value = "/thanks")
    public String thankYou(Model model){
        model.addAttribute("project", serv.getAllProjects());
        return "thanks";
    }
}

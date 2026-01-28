package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sp.main.entity.Feedback;
import in.sp.main.service.FeedbackService;

@Controller
public class AdminController {

    @Autowired
    private FeedbackService feedbackService;

    //  view all 
    @GetMapping("/admin")
    public String adminDashboard(Model model) {

        List<Feedback> feedbackList = feedbackService.getAllFeedback();
        model.addAttribute("feedbackList", feedbackList);

        return "admin"; // admin.html
    }
}

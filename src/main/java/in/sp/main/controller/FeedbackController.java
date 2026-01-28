package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import in.sp.main.entity.Feedback;
import in.sp.main.service.FeedbackService;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // open feedback page
    @GetMapping("/feedback")
    public String feedbackPage(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";   //feedback.html to create that 
    }

    // save feedback
    @PostMapping("/saveFeedback")
    public String saveFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/feedback";
    }
}

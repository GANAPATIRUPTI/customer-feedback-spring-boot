package in.sp.main.service;

import java.util.List;
import in.sp.main.entity.Feedback;

public interface FeedbackService {

    void saveFeedback(Feedback feedback);

    List<Feedback> getAllFeedback();
}

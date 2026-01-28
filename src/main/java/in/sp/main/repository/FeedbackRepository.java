package in.sp.main.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entity.Feedback;
import in.sp.main.entity.User;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    List<Feedback> findByUser(User user);
}


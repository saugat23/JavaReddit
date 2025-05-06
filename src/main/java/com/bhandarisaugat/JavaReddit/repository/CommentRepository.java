package com.bhandarisaugat.JavaReddit.repository;

import com.bhandarisaugat.JavaReddit.model.Comment;
import com.bhandarisaugat.JavaReddit.model.Post;
import com.bhandarisaugat.JavaReddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}

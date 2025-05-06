package com.bhandarisaugat.JavaReddit.repository;

import com.bhandarisaugat.JavaReddit.model.Post;
import com.bhandarisaugat.JavaReddit.model.Subreddit;
import com.bhandarisaugat.JavaReddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
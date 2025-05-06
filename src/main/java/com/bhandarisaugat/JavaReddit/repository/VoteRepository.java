package com.bhandarisaugat.JavaReddit.repository;

import com.bhandarisaugat.JavaReddit.model.Post;
import com.bhandarisaugat.JavaReddit.model.User;
import com.bhandarisaugat.JavaReddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
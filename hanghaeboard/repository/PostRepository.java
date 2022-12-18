package com.sparta.hanghaeboard.repository;


import com.sparta.hanghaeboard.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();
    Optional<Post> findByIdAndUserId(Long id, Long userId);

}
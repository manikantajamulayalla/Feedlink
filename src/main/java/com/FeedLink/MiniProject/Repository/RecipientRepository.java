package com.FeedLink.MiniProject.Repository;

import com.FeedLink.MiniProject.Entity.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient, Long> {
    List<Recipient> findByLocationContainingIgnoreCase(String location);
}


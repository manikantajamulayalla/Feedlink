package com.FeedLink.MiniProject.Repository;

import com.FeedLink.MiniProject.Entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByExpireDateBefore(LocalDate currentDate);

    List<Donation> findByLocation(String location);
}

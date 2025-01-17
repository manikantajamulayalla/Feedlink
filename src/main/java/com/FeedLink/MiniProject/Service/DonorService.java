package com.FeedLink.MiniProject.Service;



import com.FeedLink.MiniProject.Entity.Donation;
import com.FeedLink.MiniProject.Repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DonorService {

    @Autowired
    private DonationRepository donationRepository;

//    public Donation addDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @Scheduled(cron = "0 0 0 * * ?") // Runs every day at midnight
    public void removeExpiredDonations() {
        List<Donation> expiredDonations = donationRepository.findByExpireDateBefore(LocalDate.now());
        donationRepository.deleteAll(expiredDonations);
    }

    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }



    public List<Donation> getDonationsByLocation(String location) {
        return donationRepository.findByLocation(location); // Get donations filtered by location
    }
}

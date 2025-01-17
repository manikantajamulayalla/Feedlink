package com.FeedLink.MiniProject.Service;

import com.FeedLink.MiniProject.Entity.Recipient;
import com.FeedLink.MiniProject.Repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipientService {

    @Autowired
    private RecipientRepository recipientRepository;

    public void saveRecipient(Recipient recipient) {
        System.out.println("Saving recipient: " + recipient);
        recipientRepository.save(recipient);
    }


    public List<Recipient> getAllRecipients() {
        return recipientRepository.findAll();
    }

    public List<Recipient> getRecipientsByLocation(String location) {
        return recipientRepository.findByLocationContainingIgnoreCase(location);
    }
}


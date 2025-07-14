package com.FeedLink.MiniProject.Controllers;

import com.FeedLink.MiniProject.Entity.Recipient;
import com.FeedLink.MiniProject.Service.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecipientController {

    @Autowired
    private RecipientService recipientService;



    @GetMapping("/recipients/all")
    public ResponseEntity<List<Recipient>> getAllRecipients() {
        List<Recipient> recipients = recipientService.getAllRecipients();
        return ResponseEntity.ok(recipients);
    }

    @GetMapping("/recipients/search")
    public ResponseEntity<List<Recipient>> getRecipientsByLocation(@RequestParam String location) {
        List<Recipient> recipients = recipientService.getRecipientsByLocation(location);
        return ResponseEntity.ok(recipients);
    }

    @PostMapping("/recipients/add")
    public ResponseEntity<String> addRecipient(@RequestBody Recipient recipient) {
        recipientService.saveRecipient(recipient);
        return ResponseEntity.ok("Recipient added successfully");
    }


}

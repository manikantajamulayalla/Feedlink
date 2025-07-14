package com.FeedLink.MiniProject.Controllers;

import com.FeedLink.MiniProject.Entity.Message;
import com.FeedLink.MiniProject.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private MessageRepository messageRepository;



    @PostMapping("/contact")
    public String submitMessage(@RequestParam String fullname, @RequestParam String email,
                                @RequestParam String phone, @RequestParam String messageContent) {
        Message message = new Message();
        message.setFullname(fullname);
        message.setEmail(email);
        message.setPhone(phone);
        message.setMessageContent(messageContent);

        messageRepository.save(message);

        return "contact-success"; // A view name to redirect to a success page
    }
}

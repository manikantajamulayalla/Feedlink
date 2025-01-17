package com.FeedLink.MiniProject.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index"; // Corresponds to src/main/resources/templates/home.html
    }

    @GetMapping("/donor.html")
    public String donor() {
        return "donor"; // Corresponds to src/main/resources/templates/donor.html
    }

    @GetMapping("/viewdonation.html")
    public String viewDonation() {
        return "viewdonation"; // Corresponds to src/main/resources/templates/viewdonation.html
    }

    @GetMapping("/recipient.html")
    public String recipient() {
        return "recipient"; // Corresponds to src/main/resources/templates/recipient.html
    }

    @GetMapping("/viewrecipients.html")
    public String viewRecipients() {
        return "viewrecipients"; // Corresponds to src/main/resources/templates/viewrecipients.html
    }

    @GetMapping("/feedback.html")
    public String feedback() {
        return "feedback"; // Corresponds to src/main/resources/templates/feedback.html
    }

    @GetMapping("/contact.html")
    public String contact() {
        return "contact"; // Corresponds to src/main/resources/templates/contact.html
    }

    @GetMapping("/about.html")
    public String about() {
        return "about"; // Corresponds to src/main/resources/templates/about.html
    }

    @GetMapping("/registration.html")
    public String registration() {
        return "registration"; // Corresponds to src/main/resources/templates/about.html
    }

    @GetMapping("/login.html")
    public String login() {
        return "login"; // Corresponds to src/main/resources/templates/about.html
    }

    @GetMapping("/index.html")
    public String index() {
        return "index"; // Corresponds to src/main/resources/templates/home.html
    }
}

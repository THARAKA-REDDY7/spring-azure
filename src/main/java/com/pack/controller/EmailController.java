package com.pack.controller;

import com.pack.model.BookSlot;
import com.pack.model.Mailpojo;
import com.pack.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    // Sending a simple Email
    @PostMapping("/mail")
    public String
    sendMail(@ModelAttribute Mailpojo mailpojo, @ModelAttribute BookSlot bookSlot)
    {
        String status
                = emailService.sendSimpleMail(mailpojo,bookSlot);

        return "mailsent";
    }


}

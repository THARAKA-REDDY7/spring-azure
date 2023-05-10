package com.pack.service;

import com.pack.model.BookSlot;
import com.pack.model.Mailpojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmailServiceImpl implements EmailService{
    @Autowired
    private JavaMailSender javaMailSender;


    private String sender="springbootdoctor@gmail.com";
    @Override
    public String sendSimpleMail(Mailpojo mailpojo,BookSlot bookSlot) {
        try {

            // Creating a simple mail message
            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();
            String text=mailpojo.getBody()+bookSlot.getDate()+bookSlot.getTime();


            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(mailpojo.getEmail());
            mailMessage.setText(text);
            mailMessage.setSubject(mailpojo.getSub());

            // Sending the mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }
}

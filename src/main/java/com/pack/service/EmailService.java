package com.pack.service;

import com.pack.model.BookSlot;
import com.pack.model.Mailpojo;

public interface EmailService {
    String sendSimpleMail(Mailpojo mailpojo, BookSlot bookSlot);
}

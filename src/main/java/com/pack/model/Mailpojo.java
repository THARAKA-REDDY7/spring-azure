package com.pack.model;

public class Mailpojo {
    private String email;
    private String sub="Slot is booked";
    private String body="doctor appoinment is fixed on";

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

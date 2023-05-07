package com.pack.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="slotbooking")
public class BookSlot {
    @Id
    @GeneratedValue
    private int sid;
    @Column
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;
    @Column
    private String time;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id", nullable = true)
    @Nullable
    private Doctor doctor;

    public int getDoctorId() {
        return doctor != null ? doctor.getId() : null;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

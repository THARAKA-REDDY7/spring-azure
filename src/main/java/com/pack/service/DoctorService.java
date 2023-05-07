package com.pack.service;

import com.pack.model.BookSlot;
import com.pack.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();


    List<Doctor>  findByLocAndSpec(String c, String s);


}
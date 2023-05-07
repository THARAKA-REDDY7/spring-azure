package com.pack.service;

import com.pack.model.BookSlot;
import com.pack.model.Doctor;
import com.pack.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepo doctorRepo;


    @Override
    public List<Doctor> getAllDoctors() {

        return doctorRepo.findAll();
    }

    @Override
    public List<Doctor> findByLocAndSpec(String c, String s) {
        return doctorRepo.findByLocAndSpec(c,s);
    }




}

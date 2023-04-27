package com.pack.service;

import com.pack.model.Doctor;
import com.pack.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepo doctorRepo;


    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }
}

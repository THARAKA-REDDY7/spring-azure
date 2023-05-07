package com.pack.repo;

import com.pack.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor , Integer> {

   List<Doctor> findByLocAndSpec(String loc,String spec);



}

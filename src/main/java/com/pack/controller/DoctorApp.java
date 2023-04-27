package com.pack.controller;

import com.pack.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorApp {
    @Autowired
    private DoctorService doctorService;
    @RequestMapping("/")
    public String welcome(Model m)
    {
        System.out.println("inside welcome");
        return "home";
    }

    @GetMapping("/a")
    public String view(Model m)
    {
        m.addAttribute("doc",doctorService.getAllDoctors());
        return "index";
    }


}

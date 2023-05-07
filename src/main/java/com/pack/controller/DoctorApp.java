package com.pack.controller;

import com.pack.model.BookSlot;
import com.pack.model.Cityandsy;
import com.pack.model.Doctor;
import com.pack.repo.DoctorRepo;
import com.pack.service.DoctorService;
import com.pack.service.SaveSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DoctorApp {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private SaveSlotService saveSlotService;
    @RequestMapping("/")
    public String welcome(Model m)
    {
        System.out.println("inside welcome");
        return "home";
    }

    /*@GetMapping("/a")
    public String view(Model m)
    {
        m.addAttribute("doc",doctorService.getAllDoctors());
        return "index";
    }*/

    @PostMapping("/search")
    public String htmltoco(@ModelAttribute Cityandsy cs,Model m1)
    {
        String c=cs.getCity();
        String s=cs.getSys();
        //m1.addAttribute("doc",doctorRepo.findByLocAndSpec(c,s));
        m1.addAttribute("doc",doctorService.findByLocAndSpec(c,s));
        return "index";
    }
    @GetMapping("/slot")
    public String slotpage()
    {
        return "slot";
    }
    @GetMapping("/bookslot")
    public String slotBook(@ModelAttribute("bookSlot") BookSlot bookSlot)
    {
        saveSlotService.saveSlot(bookSlot);
        System.out.println("save slot");

        return "redirect:/";
    }


}

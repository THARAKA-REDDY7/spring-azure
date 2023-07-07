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

import java.util.Iterator;
import java.util.List;

@Controller
public class DoctorApp {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private SaveSlotService saveSlotService;

    @RequestMapping("/")
    public String Home()
    {
        return "home";
    }
    @RequestMapping("/sta")
    public String welcome(Model m)
    {
        System.out.println("inside welcome2");
        System.out.println("inside welcome3");

        return "first";
    }

    @GetMapping("/list")
    public String view(Model m)
    {
        m.addAttribute("doc1",doctorService.getAllDoctors());
        return "doclist";
    }

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

       // String k=id;
       // m.addAttribute("sol",k);
        return "slot";
    }
    @GetMapping("/bookslot")
    public String slotBook(@ModelAttribute("bookSlot") BookSlot bookSlot)
    {
        int p= bookSlot.getDocid();

        List<BookSlot> li=saveSlotService.findByDocid(p);

        System.out.println(li);

        Iterator i=li.iterator();
        while(i.hasNext())
        {
            BookSlot s1=(BookSlot) i.next();
            System.out.println(s1.getSid()+"  " +s1.getDate()+" "+s1.getTime()+"\n");
        }


        System.out.println(li);

        saveSlotService.saveSlot(bookSlot);
        System.out.println("save slot");

        return "mail";
    }



}

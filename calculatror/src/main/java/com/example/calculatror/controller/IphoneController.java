package com.example.calculatror.controller;

import com.example.calculatror.model.Iphone;
import com.example.calculatror.repo.IphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/Iphone")
public class IphoneController {

    @Autowired
    private IphoneRepository IphoneRepository;

    @GetMapping("/")
    public  String Index(Model model){
        Iterable<Iphone> iphones =  IphoneRepository.findAll();
        model.addAttribute("iphones", iphones);
        return "Iphone/index";
    }

    @GetMapping("/addView")
    public  String addView(Model model){

        return "/Iphone/add";
    }

    @PostMapping("/add")
    public  String add(
            @RequestParam("title") String title,
            @RequestParam("text") String text,
            @RequestParam("price") int price,
            @RequestParam("display") int display,
            @RequestParam("number") int number,
            Model model){

        Iphone iphone = new Iphone(title,text,price,display,number);
        IphoneRepository.save(iphone);
        return "redirect:/Iphone/";
    }

    @GetMapping("/search")
    public  String searchMetrhod(
            @RequestParam("title") String title,
            Model model) {
            List<Iphone> iphoneList = IphoneRepository.findByTitle(title);
            model.addAttribute("iphones", iphoneList);
            return "Iphone/index";
    }
    @GetMapping("/searchContains")
    public  String searchMetrhodContains(
            @RequestParam("title") String title,
            Model model)
    {
        List<Iphone> iphoneList = IphoneRepository.findByTitle(title);
        model.addAttribute("iphones", iphoneList);
        return "Iphone/index";
    }
}

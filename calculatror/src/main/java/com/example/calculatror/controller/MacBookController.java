package com.example.calculatror.controller;

import com.example.calculatror.model.Iphone;
import com.example.calculatror.model.MacBook;
import com.example.calculatror.repo.IphoneRepository;
import com.example.calculatror.repo.MacBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/MacBook")
public class MacBookController {

    @Autowired
    private MacBookRepository MacBookRepository;

    @GetMapping("/")
    public  String Index(Model model){
        Iterable<MacBook> macbooks =  MacBookRepository.findAll();
        model.addAttribute("macbooks", macbooks);
        return "MacBook/index";
    }

    @GetMapping("/addView")
    public  String addView(Model model){

        return "/MacBook/add";
    }

    @PostMapping("/add")
    public  String add(
            @RequestParam("title") String title,
            @RequestParam("text") String text,
            @RequestParam("color") String color,
            @RequestParam("price") int price,
            @RequestParam("size") int size,
            Model model){

        MacBook macbook = new MacBook(title,text,color,price,size);
        MacBookRepository.save(macbook);
        return "redirect:/MacBook/";
    }

    @GetMapping("/search")
    public  String searchMetrhod(
            @RequestParam("title") String title,
            Model model) {
        List<MacBook> macBookList = MacBookRepository.findByTitle(title);
        model.addAttribute("macbooks", macBookList);
        return "MacBook/index";
    }
    @GetMapping("/searchContains")
    public  String searchMetrhodContains(
            @RequestParam("title") String title,
            Model model)
    {
        List<MacBook> macBookList = MacBookRepository.findByTitleContains(title);
        model.addAttribute("macbooks", macBookList);
        return "MacBook/index";
    }
}

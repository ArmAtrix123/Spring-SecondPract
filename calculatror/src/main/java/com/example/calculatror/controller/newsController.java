package com.example.calculatror.controller;

import com.example.calculatror.model.news;
import com.example.calculatror.repo.newsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/news")
public class newsController {
    @Autowired
    private newsRepository newsRepository;
    @GetMapping("/")
    public String index(Model model){
        Iterable<news> news = newsRepository.findAll();
        model.addAttribute("news", news);
        return "news/index";
    }
    @GetMapping("/add")
    public String add_vies(Model model){
        return "news/add-news";
    }
    @PostMapping("/add")
    public String post(@RequestParam("title") String title,
                       @RequestParam("tetx") String tetx,
                       @RequestParam("author") String author,
                       @RequestParam("likes") Integer likes,
                       @RequestParam("view") Integer view,
            Model model){
        news newsOne = new news(title, tetx, author, likes, view);
        newsRepository.save(newsOne);
        return "redirect:/news/";
    }
}

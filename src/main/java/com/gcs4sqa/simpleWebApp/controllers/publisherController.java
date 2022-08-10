package com.gcs4sqa.simpleWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcs4sqa.simpleWebApp.repositories.PublisherRepository;

@Controller
public class publisherController {

    private final PublisherRepository publisherRepository;

    

    public publisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publisher")
    public String getPublisher(Model model){

        model.addAttribute("publisher", publisherRepository.findAll());


        return "publisher/list";

    }
    
}

package com.gcs4sqa.simpleWebApp.controllers;

import com.gcs4sqa.simpleWebApp.repositories.AuthorRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRespository authorRespository;

    public AuthorController(AuthorRespository authorRespository) {
        this.authorRespository = authorRespository;
    }


    @RequestMapping("/author")
    public String getAuthor(Model model){

        model.addAttribute("author", authorRespository.findAll());

        return "author/list";
    }
}

package edu.reptileminers.museumguide.mvc;

import edu.reptileminers.museumguide.db.Article;
import edu.reptileminers.museumguide.db.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    /**
     * Saves the static list of users in model and renders it
     * via freemarker template.
     *
     * @param model
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/article_page", method = RequestMethod.GET)
    public String handleRequest(@ModelAttribute("title") String title,
                                @ModelAttribute("model") ModelMap model) {
        System.out.println("ArticleController.handleRequest");
        System.out.println("title::" + title);
        List<Article> articles = repository.findByTitle(title);

        for (Article article : articles) {
            model.addAttribute("article", article);
        }
        return "article_page";
    }

}
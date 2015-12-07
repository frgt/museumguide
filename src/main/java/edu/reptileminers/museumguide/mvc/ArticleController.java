package edu.reptileminers.museumguide.mvc;

import edu.reptileminers.museumguide.db.Article;
import edu.reptileminers.museumguide.db.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @RequestMapping(value = "/article_page", params = "title")
    public String handleRequest(@RequestParam(value="title", required=true) String title, Model model) {
        System.out.println("ArticleController.handleRequest");
        System.out.println("title::" + title);
        List<Article> articles = repository.findByTitle(title);

        for(Article article: articles) {
            model.addAttribute("article", article);
        }

        return "article";
    }
}

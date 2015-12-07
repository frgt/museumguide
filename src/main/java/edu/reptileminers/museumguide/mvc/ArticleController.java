package edu.reptileminers.museumguide.mvc;

import edu.reptileminers.museumguide.db.Article;
import edu.reptileminers.museumguide.db.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @RequestMapping(value = "/article_page", params = "title")
    public ModelAndView getArticle(ModelAndView mv, @WebParam String title) {
        List<Article> articles = repository.findByTitle(title);

        mv.addObject("article", articles.get(0));
        mv.setViewName("article_page2");

        return mv;
    }
}
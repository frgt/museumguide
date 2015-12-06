package edu.reptileminers.museumguide.mvc;

import edu.reptileminers.museumguide.db.Article;
import edu.reptileminers.museumguide.db.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @RequestMapping(value = "/article_pg_mvc", params = "articleId")
    public @ResponseBody ModelAndView handleRequest(HttpServletRequest request,
                               HttpServletResponse response) {

        // just for testing repo access in controller - don't touch it yet
        Long articleId = Long.valueOf(request.getParameter("articleId"));
        Article article = repository.findOne(articleId);
        // just for testing - don't touch it yet

        ModelAndView renderingArticle = new ModelAndView("/article_pg_mvc.jsp");

        // todo: get real info from db and not this hardcoded crap
        String title = "Oleg Sokolov. Artist, Poet, and Dissident";
        String fragmentOne = "    As early as the beginning of the 50s, and even before the beginning of the Ottepel, O. Sokolov quickly realized the absurdity of Socialist Realism as the only means of cultural development. These views, which subsequently determined O.Sokolov's unique role in Odessian art, were more than likely formed as a result of constant dialogue with professor T.B. Fraerman. A legendary figure, Fraerman belonged to Odessa and French schools of Fine Art, worked with Degas, Rodin, and Matisse, and collaborated with them on a number of exhibitions. Altogether a rarity in the Soviet Odessa, Fraerman appeared to Sokolov as a man from a world completely different. Since Fraerman was banned from lecturing at universities, Sokolov visited him at his house, talked with him, and acquired a profound understanding of freedom and culture.\n" +
                "Oleg Sokolov was a vivid socialite. As early as the beginning of the 60s he surreptitiously founded a club called: Color, Music, Words in the name of M.K. Churlenis. It was one of the first of its kind to be created without (or rather against) the government permission. There club frequenters discussed modern problems of culture without even mentioning politics. But it was still not enough. Soviet authorities nonetheless labeled them as \"not in line with our way of thinking.\"\n" +
                "O. Sokolov was extremely gregarious and loved to get into discussions with people, and as such, he played host to a number of guests, who filled his dilapidated apartment—the Union of Artists refused to provide him with a studio—to the brim every Wednesday. O, who did not visit him there!? Even though many of his artistic contemporaries and colleagues, however, did not accept him, philosophers, scholars, and poets did. They considered him to be an embodiment of the resolution of one of the most pressing orders of the day: the unification of \"physicists and lyricists.\" Philosopher Abner Uyomov and Bulat Okudzhava, Vytautas Landsbergis, social activist and well-known collector George Costakis. Sokolov's work was known far beyond the rods of the Iron Curtain enshrouding Odessa: in Moscow Sokolov's works turned up in Boris Slutsky's and Evgeniy Evtushenko's collections; in Latvia he was famous for the club mentioned early. Finally, the famous theorist of light shows, Bulat Galeev, dedicated a series of articles to the artist.\n" +
                "        ";
        String picOneLink = "http://msio.com.ua/images/stories/halls/1/_iz.jpg";

        renderingArticle.addObject("articleTitle", title);
        renderingArticle.addObject("fragmentOne", fragmentOne);
        renderingArticle.addObject("pictureOneLink", picOneLink);

        // todo: split article text with images. some kind of token?

        return renderingArticle;
    }

}

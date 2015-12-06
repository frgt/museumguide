package edu.reptileminers.museumguide.db;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String audio;

    @ManyToMany(mappedBy = "playlist")
    @Nullable
    private List<Article> articles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Nullable
    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(@Nullable List<Article> articles) {
        this.articles = articles;
    }
}
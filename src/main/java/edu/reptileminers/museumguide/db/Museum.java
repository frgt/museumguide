package edu.reptileminers.museumguide.db;

import javax.persistence.*;
import java.util.List;

@Entity
public class Museum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String logolink;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinTable(name = "exhibits",
            joinColumns =
            @JoinColumn(name = "museum_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "article_id", referencedColumnName = "id"))
    private List<Article> articles;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogolink() {
        return this.logolink;
    }

    public void setLogolink(String logolink) {
        this.logolink = logolink;
    }
}
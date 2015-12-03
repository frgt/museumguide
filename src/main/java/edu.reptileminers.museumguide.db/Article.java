package edu.reptileminers.museumguide.db;

import javax.persistence.*;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String text;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinTable(name = "playlist",
            joinColumns =
            @JoinColumn(name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "audio_id", referencedColumnName = "id"))
    private List<Audio> playlist;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinTable(name = "gallery",
            joinColumns =
            @JoinColumn(name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "picture_id", referencedColumnName = "id"))
    private List<Picture> gallery;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setLogo(String text) {
        this.text = text;
    }

    public List<Audio> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Audio> playlist) {
        this.playlist = playlist;
    }

    public List<Picture> getGallery() {
        return gallery;
    }

    public void setGallery(List<Picture> gallery) {
        this.gallery = gallery;
    }
}
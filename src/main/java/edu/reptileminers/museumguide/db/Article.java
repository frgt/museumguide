package edu.reptileminers.museumguide.db;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String text;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinTable(name = "playlist",
            joinColumns =
            @JoinColumn(name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "audio_id", referencedColumnName = "id"))
    @Nullable
    private List<Audio> playlist;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinTable(name = "gallery",
            joinColumns =
            @JoinColumn(name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "picture_id", referencedColumnName = "id"))
    @Nullable
    private List<Picture> gallery;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Nullable
    public List<Audio> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(@Nullable List<Audio> playlist) {
        this.playlist = playlist;
    }

    @Nullable
    public List<Picture> getGallery() {
        return gallery;
    }

    public void setGallery(@Nullable List<Picture> gallery) {
        this.gallery = gallery;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", playlist=" + playlist +
                ", gallery=" + gallery +
                '}';
    }
}
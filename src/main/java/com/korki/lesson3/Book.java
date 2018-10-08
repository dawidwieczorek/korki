package com.korki.lesson3;

public class Book {

    //variables
    private String title;
    private Integer numberOfPages;
    private String language;
    //variables

    //constructon
    public Book(String title, Integer numberOfPages, String language) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.language = language;
    }
    //constructon

    //methods
    public String getTitle(){
        return title;
    }

    public Integer getNumberOfPages(){
        return numberOfPages;
    }

    public String getLanguage(){
        return language;
    }

    public void read(){

    }

    public void save(){

    }

    public String wezMiwydrukInformacjeOTejksiazce(){
        return "Ta ksiązka wyglada tak: " + title  + "ma tyle stron " + numberOfPages + " i jest w takim jezyku " + language;
    }
    //methods
}

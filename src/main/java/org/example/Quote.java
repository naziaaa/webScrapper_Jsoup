package org.example;

public class Quote {
    private  String text;
    private String author;
    private  String tags;


    public String getText(){
        return  text;
    }

    public void setText(String text){
        this.text=text;
    }
    public  String getAuthor(){
        return  author;
    }
    public  void setAuthor(String author){
        this.author=author;
    }

    public  String getTags(){
        return tags;
    }
    public  void setTags(String tags){
        this.tags=tags;
    }
}
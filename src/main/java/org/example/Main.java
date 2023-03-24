package org.example;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws  IOException {
        System.out.println("Hello world!");
        Document doc=Jsoup.connect("https://quotes.toscrape.com/").userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36").get();
    }
}
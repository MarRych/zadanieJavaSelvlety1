package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.util.ajax.JSON;
import spark.Spark;

import java.util.Map;
import java.util.UUID;


import static jdk.internal.jimage.ImageReaderFactory.get;
import static spark.Spark.*;

public class ArticleController {
    private final ArticleService articleService;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public ArticleController(final ArticleService articleService) {
        this.articleService = articleService;
    }



    public void routesInit(){
        post("/article", (req, res)-> {//
            String article = req.params("article"); // params: key & value w Postmanie
            req.body();// kiedy dostaje zapytanie body wykonuje poniższe operace
//            objectMapper.readValue(req.body(), Article.class); // funkcja zamiany z tekstu jsona na klase

            try {
                ArticleDTO articleDTO = this.articleService.getArticle();
                res.status(200);
                res.body(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(articleDTO));//z klasy jsona
                //writerWithDefaultPrettyPrinter-funkcja układania tekstu
                // writeValueAsString(XX)- zamiana klasy w nawaisie (xx) na tekst

            } catch (final Exception e) {
                e.printStackTrace();
                res.status(500);
                res.body(JSON.toString(Map.of("message", e.getMessage())));
            }

            res.type("application-json");
            return res.body();
        });

    Spark.get("/article/:title", (req, res) -> {
            String title = req.params("title");
            req.body();

            try{
                ArticleDTO articleDTO = this.articleService.getArticleTitle();
                    res.status(200);
                    res.body(objectMapper. writerWithDefaultPrettyPrinter().writeValueAsString(articleDTO));
            } catch (final Exception e) {
                e.printStackTrace();
                res.status(500);
                res.body(JSON.toString(Map.of("message", e.getMessage())));

            }
            res.type("application-json");
            return res.body();
        });

    /* get("/article/:id",(req, res) ->{
         int id = req.params("id");
         req.body();

             }
     );*/

/*
       get("/article", (req, res) ->{
           res.type("application-json");
         //  String deleteArticle = req.params("article");
          // req.body();
           Article.deleteArticle(req.params(":id"));



         /*  try {
               ArticleDTO articleDTO = this.articleService.getArticleDelete();
               res.status(200);
               res.body(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(articleDTO));
           }catch (final Exception e) {
               e.printStackTrace();
               res.status(500);
               res.body(JSON.toString(Map.of("message", e.getMessage())));
           }
           return res.body();

           });*/


       }}





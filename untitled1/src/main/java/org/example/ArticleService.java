package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ArticleService {

  private final ObjectMapper objectMapper;


  public ArticleService(final ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  public ArticleDTO getArticle() {

    String error = "Error";
    String access = "Access";
    String mainArticle = "Main article";

    ArticleDTO articleDTO = new ArticleDTO(access, error, mainArticle);

    return articleDTO;
  }

  public ArticleDTO getArticleTitle() {

    String status = "Error";
    String access = "Access";
    String mainTitle = "Title";

    ArticleDTO articleDTO = new ArticleDTO(access, status, mainTitle);

    return articleDTO;
  }

  public ArticleDTO getArticleDelete() {
    String access = "Accepted";
    String status = "Error";
    String deletedArticle = "Deleted article";
    ArticleDTO articleDTO = new ArticleDTO(access, status, deletedArticle);
    return articleDTO;
  }
}

//metoda statyczne może być użyta do stworzenia instancji klasy




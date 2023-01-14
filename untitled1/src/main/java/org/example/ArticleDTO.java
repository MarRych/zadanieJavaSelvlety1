package org.example;

public class ArticleDTO {

  private String access;
  private String error;
  private String mainArticle;

  public ArticleDTO() {
  }

  public ArticleDTO(String access, String error, String mainArticle) {
    this.access = access;
    this.error = error;
    this.mainArticle = mainArticle;
  }

  public String getAccess() {
    return access;
  }

  private void setAccess(String access) {
    this.access = access;
  }

  public String getError() {
    return error;
  }

  private void setError(String error) {
    this.error = error;
  }

  public String getMainArticle() {
    return mainArticle;
  }

  private void setMainArticle(String mainArticle) {
    this.mainArticle = mainArticle;
  }
}

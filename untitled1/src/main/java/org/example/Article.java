package org.example;

public class Article {

    private String title;
    private String articleBody;
    private int articleId;
  //  private LocalDateTime time;// klasa

public Article(String title,String articleBody, int articleId){
    this.title = title;
    this.articleBody = articleBody;
    this.articleId = articleId;

}

    public static void deleteArticle(String params){}
    public String getTitle(){return title;}
    public String getArticleBody(){return articleBody;}
    public int getArticleId(){return articleId;}
   // public LocalDateTime getTime(){return time;}


}
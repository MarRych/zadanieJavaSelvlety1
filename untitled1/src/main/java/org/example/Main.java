package org.example;

import static spark.Spark.notFound;
import static spark.Spark.path;
import static spark.Spark.port;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import org.eclipse.jetty.util.ajax.JSON;

public class Main {

  // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//  reader
  public static void main(String[] args) {
    port(1212);

    final ArticleService articleService = new ArticleService(new ObjectMapper());
    final ArticleController articleController = new ArticleController(articleService);

    Article article = new Article("title", "body", 00);
    ArticleStore articleStore = new ArticleStore();
         /*   class Article{
            String title = "title";
            String articleBody = "body";
            int articleId = 11;
            Article article = new Article(title,articleBody,articleId);
                public Article(String title, String articleBody, int articleId) {
                }
            }*/

    path("/articleStore", () -> {
      articleController.routesInit();
      System.out.println("You can add your article!");
    });

    notFound((req, res) -> {
      res.type("application/jonson");
      res.body(JSON.toString(Map.of("message",
          String.format("Path s% doesnt exist!", req.uri()))));

      return res.body();
    });

// obiekty innych klas
//path
// notFound
// interceptor- coś jak bramka na lotnisku,
// przeszukuje nasz request, szuka naszych nagłówków
// notFound kiedy kiedy chcemy uzyskać zasób który nie istnieje, inf dla uż.

  }
}
//localhost:1212/articleStore/article
package org.example;

import org.eclipse.jetty.util.ArrayTernaryTrie;

import java.text.AttributedCharacterIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ArticleStore {

    private final HashMap<Integer,Article> articleStore = new HashMap<>();

    // title, articleBody, articleId;
    //  private LocalDateTime time;

    public ArticleStore(){
        articleStore.put(1,new Article("Title","Lorem ipsum dolor sit amet"+
                "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et "+
                "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat "+
                "or sit amet, consectetur, adipisci velit, sed quia non numquam eius modi "
                , 1
                ));
        articleStore.put(2,new Article("Title","Lorem ipsum dolor sit amet"+
                "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et "+
                "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat "+
                "or sit amet, consectetur, adipisci velit, sed quia non numquam eius modi "
                , 2
        ));
        articleStore.put(3,new Article("Title","Lorem ipsum dolor sit amet"+
                "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et "+
                "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat "+
                "or sit amet, consectetur, adipisci velit, sed quia non numquam eius modi "
                , 3
        ));
    }


    public Collection<Article> getAllArticles() {
        return this.articleStore.values();
    }

    public Article getArticleById(int id) {
        return articleStore.get(id);// test czy zwraca nulla
      //  + metoda dodawania arytykułu
    }
}

package ch.samt.BookList;

import lombok.Data;

//@Data
public class Book {
    private long id;
    private String title;
    private String author;

    //getter, setter, toString, costruttore, etc... vengono generati in automaticamente da lombok (annotazione @Data) nel bytecode
//    @Data
//    public class BookList {
//        private long id;
//        private String title;
//        private String author;
//    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

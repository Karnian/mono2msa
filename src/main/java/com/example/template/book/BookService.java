package com.example.template.book;

public interface BookService {
    void decreaseStock(Long bookId, int quantity);
    void increaseStock(Long bookId, int quantity);
    Book getBookById(Long id);
    Book save(String data);
}

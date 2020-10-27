package com.example.template.product;

public interface BookService {
    void decreaseStock(Long bookId, int quantity);
    void increaseStock(Long bookId, int quantity);
    Product getBookById(Long id);
    Product save(String data);
}

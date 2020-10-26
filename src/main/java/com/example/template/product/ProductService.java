package com.example.template.product;

public interface ProductService {
    void decreaseStock(Long productId, int quantity);
    void increaseStock(Long productId, int quantity);
    Product getProductById(Long id);
    Product save(String data);
}

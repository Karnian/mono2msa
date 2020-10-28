<<<<<<< HEAD
package com.example.template.book;
=======
package com.example.template.product;
>>>>>>> main

public interface BookService {
    void decreaseStock(Long bookId, int quantity);
    void increaseStock(Long bookId, int quantity);
<<<<<<< HEAD
    Book getBookById(Long id);
    Book save(String data);
=======
    Product getBookById(Long id);
    Product save(String data);
>>>>>>> main
}

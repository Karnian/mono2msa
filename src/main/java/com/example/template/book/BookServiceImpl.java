<<<<<<< HEAD
package com.example.template.book;
=======
package com.example.template.product;
>>>>>>> main

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> main
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository BookRepository;

<<<<<<< HEAD
    public void decreaseStock(Long bookId, int quantity) {
=======
    public void decreaseStock(Long productId, int quantity) {
>>>>>>> main

        /**
         * 주문이 발생시, 수량을 줄인다.
         */
<<<<<<< HEAD
        Optional<Book> productOptional = BookRepository.findById(bookId);
        Book book = productOptional.get();
        book.setStock(book.getStock() - quantity);
        System.out.println("bookId="+bookId+" , stock="+book.getStock()+" , quantity="+quantity);
        BookRepository.save(book);
    }

    public void increaseStock(Long bookId, int quantity) {
        /**
         * 주문 취소시, 수량을 늘인다
         */
        Optional<Book> productOptional = BookRepository.findById(bookId);
        Book product = productOptional.get();
=======
        Optional<Product> productOptional = BookRepository.findById(productId);
        Product product = productOptional.get();
        product.setStock(product.getStock() - quantity);

        BookRepository.save(product);

    }

    public void increaseStock(Long productId, int quantity) {
        /**
         * 주문 취소시, 수량을 늘인다
         */
        Optional<Product> productOptional = BookRepository.findById(productId);
        Product product = productOptional.get();
>>>>>>> main
        product.setStock(product.getStock() + quantity);

        BookRepository.save(product);
    }

    /**
     * 상품 조회
     */
<<<<<<< HEAD
    public Book getBookById(Long id){

        Optional<Book> productOptional = BookRepository.findById(id);
        Book book = productOptional.get();
        System.out.println(book.getId()+":"+book.getStock());
        return book;
    }

    public Book save(String data){
        ObjectMapper mapper = new ObjectMapper();
        Book book = null;
        try {
            book = mapper.readValue(data, Book.class);
=======
    public Product getProductById(Long id){

        Optional<Product> productOptional = BookRepository.findById(id);
        Product product = productOptional.get();

        return product;
    }

    public Product save(String data){
        ObjectMapper mapper = new ObjectMapper();
        Product product = null;
        try {
            product = mapper.readValue(data, Product.class);
>>>>>>> main
        } catch (IOException e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
        return BookRepository.save(book);
=======
        return BookRepository.save(product);
>>>>>>> main
    }
}

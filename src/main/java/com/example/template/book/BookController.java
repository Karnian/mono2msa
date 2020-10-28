<<<<<<< HEAD
package com.example.template.book;
=======
<<<<<<< HEAD
package com.example.template.book;
=======
package com.example.template.product;
>>>>>>> main
>>>>>>> main

import com.example.template.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
    BookService bookService;

    @GetMapping("/book/{bookId}")
    Book productStockCheck(@PathVariable(value = "bookId") Long bookId) {
        return  this.bookService.getBookById(bookId);
    }

    @PostMapping("/book")
    Book bookInsert(@RequestBody String data) {
<<<<<<< HEAD
        return this.bookService.save(data);
    }

    @RequestMapping(method = RequestMethod.PUT, path="/book/{book}", consumes = "application/json")
    Book bookModify(@PathVariable(value = "book") String book) {
        return this.bookService.save(book);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/book/decreaseStock", consumes = "application/json")
    Book updateBookStock(@RequestBody String data) {
        return this.bookService.save(data);
=======
        System.out.println(data);
        return this.bookService.save(data);
=======
    ProductService productService;

    @GetMapping("/product/{productId}")
    Product productStockCheck(@PathVariable(value = "productId") Long productId) {
        return  this.productService.getProductById(productId);
    }

    @PostMapping("/product")
    Product productInsert(@RequestBody String data) {
        System.out.println(data);
        return this.productService.save(data);
>>>>>>> main
>>>>>>> main
    }

    @Value("${superuser.userId}")
    String superUserId;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
    /*@Autowired
    Environment env;
    *//**
     * env 혹은 설정 값을 가져오는 테스트 코드
     *//*
<<<<<<< HEAD
=======
=======
    @Autowired
    Environment env;
    /**
     * env 혹은 설정 값을 가져오는 테스트 코드
     */
>>>>>>> main
>>>>>>> main
    @GetMapping("/env")
    String getEnvSample() {

        // 1. applicationContext 에서 가져오기
        Environment envContext = Application.applicationContext.getEnvironment();
        System.out.println(" applicationContext = " + envContext.getProperty("superuser.userId"));

        // 2. Autowired Environment
        System.out.println(" Autowired Environment = " + env.getProperty("superuser.userId"));

        // 3. @Value
        System.out.println(" @Value = " + superUserId);

        return superUserId;
<<<<<<< HEAD
    }*/
=======
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> main
>>>>>>> main
}

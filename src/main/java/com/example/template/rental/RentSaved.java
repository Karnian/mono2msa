<<<<<<< HEAD
package com.example.template.rental;

import com.example.template.Application;
import com.example.template.delivery.Delivery;
=======
<<<<<<< HEAD
package com.example.template.rental;

import com.example.template.Application;
>>>>>>> main
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RentSaved extends AbstractEvent {
<<<<<<< HEAD
=======
=======
package delivery.rental;

import delivery.AbstractEvent;

public class BookRentSaved extends AbstractEvent {
>>>>>>> main
>>>>>>> main

    @Override
    public String getEventType() {
        return eventType;
    }
    private Long id;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
    private Long bookId;
    private String bookName;
    private int qty;
    private int price;
    private String customerId;
<<<<<<< HEAD
    private Delivery delivery;

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
=======
>>>>>>> main

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
<<<<<<< HEAD
=======
=======
    private long bookId;
    private String bookName;
>>>>>>> main
>>>>>>> main

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
    public int getQty() {
        return qty;
    }

    public void setQty(int quantity) {
        this.qty = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
<<<<<<< HEAD
=======
=======
    private Long qty;

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
>>>>>>> main
>>>>>>> main
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

<<<<<<< HEAD
    private String customerName;

=======
<<<<<<< HEAD
    private String customerName;

=======
    private long customerId;
    private String customerName;


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public BookRentSaved(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
>>>>>>> main
>>>>>>> main
}

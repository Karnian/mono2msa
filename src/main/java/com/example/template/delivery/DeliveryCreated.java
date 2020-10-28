
<<<<<<< HEAD
package com.example.template.delivery;

public class DeliveryCreated extends AbstractEvent {

    private Long id;
    private Long rentId;

    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }
=======
package delivery.delivery;

import delivery.AbstractEvent;

public class BookDelvCreated extends AbstractEvent {

    private Long id;
>>>>>>> main

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

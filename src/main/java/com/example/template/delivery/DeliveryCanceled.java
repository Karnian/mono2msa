
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
package com.example.template.delivery;


public class DeliveryCanceled extends AbstractEvent {

    private Long id;

    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }

    private Long rentId;

<<<<<<< HEAD
=======
=======
package delivery.delivery;

import delivery.AbstractEvent;

public class BookDelvCanceled extends AbstractEvent {

    private Long id;

>>>>>>> main
>>>>>>> main
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.example.template.book;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaProcessorBook {
    String bookSaved_INPUT = "bookSaved-in";
    String bookSaved_OUTPUT = "bookSaved-out";

<<<<<<< HEAD
    String rentSaved_INPUT = "rentSaved-in";
    String rentSaved_OUTPUT = "rentSaved-out";
=======
<<<<<<< HEAD
    String rentSaved_INPUT = "rentSaved-in";
    String rentSaved_OUTPUT = "rentSaved-out";
=======
    String customerSaved_INPUT = "customerSaved-in";
    String customerSaved_OUTPUT = "customerSaved-out";

    String rentalSaved_INPUT = "rentalSaved-in";
    String rentalSaved_OUTPUT = "rentalSaved-out";
>>>>>>> main
>>>>>>> main

    String deliverySaved_INPUT = "deliverySaved-in";
    String deliverySaved_OUTPUT = "deliverySaved-out";

    @Input(bookSaved_INPUT)
    SubscribableChannel inboundBookSaved();

    @Output(bookSaved_OUTPUT)
    MessageChannel outboundBookSaved();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
    @Input(rentSaved_INPUT)
    SubscribableChannel inboundRentSaved();

    @Output(rentSaved_OUTPUT)
    MessageChannel outboundRentSaved();
<<<<<<< HEAD
=======
=======
    @Input(customerSaved_INPUT)
    SubscribableChannel inboundCustomerSaved();

    @Output(customerSaved_OUTPUT)
    MessageChannel outboundCustomerSaved();

    @Input(rentalSaved_INPUT)
    SubscribableChannel inboundRentalSaved();

    @Output(rentalSaved_OUTPUT)
    MessageChannel outboundRentalSaved();
>>>>>>> main
>>>>>>> main

    @Input(deliverySaved_INPUT)
    SubscribableChannel inboundDeliverySaved();

    @Output(deliverySaved_OUTPUT)
    MessageChannel outboundDeliverySaved();
}

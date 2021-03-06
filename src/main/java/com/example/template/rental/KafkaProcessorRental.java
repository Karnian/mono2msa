package com.example.template.rental;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaProcessorRental {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
    /*String bookSaved_INPUT = "bookSaved-in";
    String bookSaved_OUTPUT = "bookSaved-out";
*/
    String rentSaved_INPUT = "rentSaved-in";
    String rentSaved_OUTPUT = "rentSaved-out";

    String deliveryCreated_INPUT = "deliveryCreated-in";
    String deliveryCreated_OUTPUT = "deliveryCreated-out";

    /*String deliveryCanceled_INPUT = "deliveryCanceled-in";
    String deliveryCanceled_OUTPUT = "deliveryCanceled-out";*/

    /*@Input(bookSaved_INPUT)
    SubscribableChannel inboundBookSaved();

    @Output(bookSaved_OUTPUT)
    MessageChannel outboundBookSaved();*/

    @Input(rentSaved_INPUT)
    SubscribableChannel inboundRentSaved();

    @Output(rentSaved_OUTPUT)
    MessageChannel outboundRentSaved();

    @Input(deliveryCreated_INPUT)
    SubscribableChannel inboundDeliveryCreated();

    @Output(deliveryCreated_OUTPUT)
    MessageChannel outboundDeliveryCreated();

    /*@Input(deliveryCanceled_INPUT)
    SubscribableChannel inboundDeliveryCanceled();

    @Output(deliveryCanceled_OUTPUT)
    MessageChannel outboundDeliveryCanceled();*/
<<<<<<< HEAD
=======
=======
    String bookSaved_INPUT = "bookSaved-in";
    String bookSaved_OUTPUT = "bookSaved-out";

    String customerSaved_INPUT = "customerSaved-in";
    String customerSaved_OUTPUT = "customerSaved-out";

    String rentalSaved_INPUT = "rentalSaved-in";
    String rentalSaved_OUTPUT = "rentalSaved-out";

    String deliverySaved_INPUT = "deliverySaved-in";
    String deliverySaved_OUTPUT = "deliverySaved-out";

    @Input(bookSaved_INPUT)
    SubscribableChannel inboundBookSaved();

    @Output(bookSaved_OUTPUT)
    MessageChannel outboundBookSaved();

    @Input(customerSaved_INPUT)
    SubscribableChannel inboundCustomerSaved();

    @Output(customerSaved_OUTPUT)
    MessageChannel outboundCustomerSaved();

    @Input(rentalSaved_INPUT)
    SubscribableChannel inboundRentalSaved();

    @Output(rentalSaved_OUTPUT)
    MessageChannel outboundRentalSaved();

    @Input(deliverySaved_INPUT)
    SubscribableChannel inboundDeliverySaved();

    @Output(deliverySaved_OUTPUT)
    MessageChannel outboundDeliverySaved();
>>>>>>> main
>>>>>>> main
}

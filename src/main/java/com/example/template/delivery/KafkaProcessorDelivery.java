<<<<<<< HEAD
package com.example.template.delivery;
=======
package com.example.template.book;
>>>>>>> main

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

<<<<<<< HEAD
public interface KafkaProcessorDelivery {
=======
public interface KafkaProcessorBook {
>>>>>>> main
    String bookSaved_INPUT = "bookSaved-in";
    String bookSaved_OUTPUT = "bookSaved-out";

    String rentSaved_INPUT = "rentSaved-in";
    String rentSaved_OUTPUT = "rentSaved-out";

    String deliverySaved_INPUT = "deliverySaved-in";
    String deliverySaved_OUTPUT = "deliverySaved-out";

    @Input(bookSaved_INPUT)
    SubscribableChannel inboundBookSaved();

    @Output(bookSaved_OUTPUT)
    MessageChannel outboundBookSaved();

    @Input(rentSaved_INPUT)
    SubscribableChannel inboundRentSaved();

    @Output(rentSaved_OUTPUT)
    MessageChannel outboundRentSaved();

    @Input(deliverySaved_INPUT)
    SubscribableChannel inboundDeliverySaved();

    @Output(deliverySaved_OUTPUT)
    MessageChannel outboundDeliverySaved();
}

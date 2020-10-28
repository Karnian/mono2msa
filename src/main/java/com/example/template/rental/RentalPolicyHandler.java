package com.example.template.rental;

<<<<<<< HEAD
import com.example.template.delivery.DeliveryCanceled;
=======
>>>>>>> main
import com.example.template.delivery.DeliveryCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
<<<<<<< HEAD
public class RentalPolicyHandler {
=======
public class PolicyHandler {
>>>>>>> main

    @Autowired
    RentalService rentalService;

<<<<<<< HEAD
    @StreamListener(KafkaProcessorRental.deliveryCreated_INPUT)
    public void onEventByDeliveryCreated(@Payload DeliveryCreated delivery){
=======
    @StreamListener(KafkaProcessorRental.deliverySaved_INPUT)
    public void onEventByDelivery(@Payload DeliveryCreated delivery){
>>>>>>> main
        System.out.println("DeliveryCreated");
        if("DeliveryCreated".equals(delivery.getEventType()) ){
            //  상태 업데이트
            Rental rent = rentalService.getRentalById(delivery.getRentId());
            rent.setStatus("배송생성");
            rentalService.save(rent);
<<<<<<< HEAD
        }
    }

    /*@StreamListener(KafkaProcessorRental.deliveryCanceled_INPUT)
    public void onEventByDeliveryCanceled(@Payload DeliveryCanceled delivery){
        System.out.println("DeliveryCanceled");
        if("DeliveryCanceled".equals(delivery.getEventType())){
=======
        }else if("DeliveryCanceled".equals(delivery.getEventType())){
>>>>>>> main
            Rental rent = rentalService.getRentalById(delivery.getRentId());
            rent.setStatus("배송취소");
            rentalService.save(rent);
        }
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> main


}

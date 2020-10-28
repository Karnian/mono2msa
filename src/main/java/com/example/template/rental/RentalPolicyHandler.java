package com.example.template.rental;

import com.example.template.delivery.DeliveryCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {

    @Autowired
    RentalService rentalService;

    @StreamListener(KafkaProcessorRental.deliverySaved_INPUT)
    public void onEventByDelivery(@Payload DeliveryCreated delivery){
        System.out.println("DeliveryCreated");
        if("DeliveryCreated".equals(delivery.getEventType()) ){
            //  상태 업데이트
            Rental rent = rentalService.getRentalById(delivery.getRentId());
            rent.setStatus("배송생성");
            rentalService.save(rent);
        }else if("DeliveryCanceled".equals(delivery.getEventType())){
            Rental rent = rentalService.getRentalById(delivery.getRentId());
            rent.setStatus("배송취소");
            rentalService.save(rent);
        }
    }


}

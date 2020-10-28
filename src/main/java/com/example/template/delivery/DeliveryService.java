package com.example.template.delivery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
//@FeignClient(name ="delivery-api", url="${api.url.delivery}", fallback =DeliveryService.class)
//@FeignClient(name ="delivery-api", url="http://localhost:8088")
=======
//@FeignClient(name ="delivery", url="${api.url.delivery}")
//@FeignClient(name ="delivery", url="http://localhost:8088")
>>>>>>> main
public interface DeliveryService {

    public Delivery getDeliveryById(Long id);
    public Delivery save(Delivery data);
    public Delivery save(String data);

<<<<<<< HEAD
    @GetMapping(value = "/delivery/{id}")
    Delivery get(@PathVariable("id") long id);

    @RequestMapping(method = RequestMethod.POST, value = "/delivery", consumes = "application/json")
    void startDelivery(@RequestParam(name="delivery") String delivery);
=======

//    @RequestMapping(method = RequestMethod.POST, value = "/delivery", consumes = "application/json")
    void startDelivery(Delivery delivery);
>>>>>>> main


//    void updateDelivery(Long deliveryId, Delivery delivery);
}

package com.example.template.delivery;

import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements DeliveryService{

//    @Autowired
//    DeliveryRepository deliveryRepository;

    /**
     * 배송 시작
     */
    public void startDelivery(Delivery delivery){
//        deliveryRepository.save(delivery);
    }

    /**
     * 배송 변경
     */
    public void updateDelivery(Long deliveryId, Delivery delivery){
//        deliveryRepository.save(delivery);
    }

}

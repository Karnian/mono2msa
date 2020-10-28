package com.example.template.config;

<<<<<<< HEAD
import com.example.template.book.Book;
import com.example.template.delivery.Delivery;
=======
import com.example.template.Delivery;
>>>>>>> main
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestMvcConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
<<<<<<< HEAD
        config.exposeIdsFor(Book.class);
=======
        config.exposeIdsFor(Delivery.class);
>>>>>>> main
    }
}

package org.dnyanyog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
@ComponentScan("org.dnyanyog") 
public class CustomerServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceMain.class, args);
    }
}

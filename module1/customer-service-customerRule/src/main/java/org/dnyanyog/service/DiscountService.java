package org.dnyanyog.service;

import org.dnyanyog.dto.DiscountRequest;
import org.dnyanyog.dto.DiscountResponse;
import org.dnyanyog.entity.Discount;
import org.dnyanyog.repo.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    public DiscountResponse calculateDiscount(DiscountRequest request) {
        int discount = 0;

        if (request.getAge() < 30) {
            discount = 10;
        } else if (request.getAge() >= 30 && request.getAge() < 60) {
            discount = 5;
        } else if (request.getAge() >= 60 && request.getGender().equalsIgnoreCase("F")) {
            discount = 15;
        }

        // Return a new DiscountResponse object with the calculated discount
        return new DiscountResponse(discount);
    }

    public Discount saveDiscount(Discount discount) {
        return discountRepository.save(discount);
    }
}

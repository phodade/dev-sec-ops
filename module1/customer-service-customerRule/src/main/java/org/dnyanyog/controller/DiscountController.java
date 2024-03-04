package org.dnyanyog.controller;


import org.dnyanyog.entity.Discount;
import org.dnyanyog.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/v1/getDiscount")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    public ResponseEntity<Discount> createDiscount(@RequestBody Discount discount) {
        Discount savedDiscount = discountService.saveDiscount(discount);
        return ResponseEntity.ok(savedDiscount);
    }
}

package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class DiscountResponse {

    private Integer discount; 

    public DiscountResponse() {
        
    }

    public DiscountResponse(Integer discount) {
        this.discount = discount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}

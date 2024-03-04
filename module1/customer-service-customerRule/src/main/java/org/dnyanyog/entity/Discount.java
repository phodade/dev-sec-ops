package org.dnyanyog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private String gender;
    private int discountPercentage;

    // Default constructor
    public Discount() {
    }

    // Parameterized constructor
    public Discount(int age, String gender, int discountPercentage) {
        this.age = age;
        this.gender = gender;
        this.discountPercentage = discountPercentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    // toString method
    @Override
    public String toString() {
        return "Discount{" +
                "id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}

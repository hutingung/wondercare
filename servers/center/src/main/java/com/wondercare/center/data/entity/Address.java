package com.wondercare.center.data.entity;

import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class Address {

    private String address;
    private Integer postcode;
    private String state;
    private String countryCode;
}

package com.wondercare.center.data.entity;

import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class Location {
    private Double latitude;
    private Double longitude;
}

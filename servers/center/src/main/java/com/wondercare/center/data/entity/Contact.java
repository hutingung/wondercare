package com.wondercare.center.data.entity;

import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class Contact {
    private String email;
    private String telNo;
}

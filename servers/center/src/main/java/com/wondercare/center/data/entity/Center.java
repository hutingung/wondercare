package com.wondercare.center.data.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="center")
public class Center {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String businessId;

    @Embedded
    private Address address;

    @Embedded
    private Location location;

    @Embedded
    private Contact contact;

    @Enumerated(EnumType.STRING)
    private CenterType type;
}

package com.github.setxpro.customer.domain;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String state;
    private String neighborhood;
    private String zipCode;
}

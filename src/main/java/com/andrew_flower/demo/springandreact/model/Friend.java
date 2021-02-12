package com.andrew_flower.demo.springandreact.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Friend {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

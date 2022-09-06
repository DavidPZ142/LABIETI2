package com.edu.eci.ieti.laboratorio.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Document
public class User {
    @Id
    private String id;
    private String name;
    @Indexed (unique = true)
    private String email;
    private String lastname;
    private String createdAt;

    public User(){
        this.createdAt = LocalDate.now().toString();
    }
}

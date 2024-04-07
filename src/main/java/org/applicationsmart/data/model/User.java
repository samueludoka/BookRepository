package org.applicationsmart.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy =  IDENTITY)
    private String id;
    private String username;
    private String email;
    private String password;
}

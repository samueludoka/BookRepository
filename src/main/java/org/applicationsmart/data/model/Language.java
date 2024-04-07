package org.applicationsmart.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private Long id;
    private String English;
    private String Espanol;
    private String French;

}

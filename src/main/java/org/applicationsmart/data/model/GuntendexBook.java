package org.applicationsmart.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@ToString
@Getter
@Setter
public class GuntendexBook {
    private String title;
    private List<Author> authors;
    private String copyright;
    private List<String> languages;
    private List<String> subjects;
}

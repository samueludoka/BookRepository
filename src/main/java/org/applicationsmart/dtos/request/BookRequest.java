package org.applicationsmart.dtos.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookRequest {
    private String bookTitle;
    private String urlAddress;
}

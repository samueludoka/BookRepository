package org.applicationsmart.dtos.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.applicationsmart.data.model.GuntendexBook;

import java.util.List;

@ToString
@Getter
@Setter
public class BookSearchResponse {
    private int count;
    private String next;
    private String previous;
//    private List<GuntendexBook> results;
}

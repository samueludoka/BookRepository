package org.applicationsmart.exceptions;

public class BookDoesNotExistException extends RuntimeException{
    public  BookDoesNotExistException(String message){
        super(message);
    }
}

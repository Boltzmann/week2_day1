package model;

public class NoKeyPresentException extends NoSuchFieldException{
    NoKeyPresentException(String message){
        super(message);
    }
}

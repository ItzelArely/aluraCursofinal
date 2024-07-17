package com.aluracurso.foroHub.exceptions;
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super();
    }
    public ResourceNotFoundException(String s) {
        super(s);
    }
}

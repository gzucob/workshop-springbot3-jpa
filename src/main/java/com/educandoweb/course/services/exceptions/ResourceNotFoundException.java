package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Could not find resource with id " + id);
    }
}

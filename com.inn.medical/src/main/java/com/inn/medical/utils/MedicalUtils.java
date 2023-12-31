package com.inn.medical.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class MedicalUtils {

    private MedicalUtils() {

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
        return new ResponseEntity<String>("{\"messag\":\""+responseMessage+"\"}", httpStatus);
    }
}

package com.techreturners.encapsulation.gradetracker;

public class InvalidStudentDataException extends RuntimeException{

    public InvalidStudentDataException(String errorMsg) {
        super(errorMsg);
    }
}

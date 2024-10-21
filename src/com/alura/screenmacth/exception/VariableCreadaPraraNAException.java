package com.alura.screenmacth.exception;

public class VariableCreadaPraraNAException extends RuntimeException     {
    private String Message;

    public VariableCreadaPraraNAException(String Message) {
        this.Message = Message;
    }

    @Override
    public String getMessage() {
        return this.Message;
    }
}

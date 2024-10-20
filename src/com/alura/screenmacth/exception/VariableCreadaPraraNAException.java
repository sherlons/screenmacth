package com.alura.screenmacth.exception;

public class VariableCreadaPraraNAException extends RuntimeException {
    private String mensaje;

    public VariableCreadaPraraNAException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}

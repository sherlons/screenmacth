package com.alura.screenmacth.modelos;

public record TituloOmdb(String title, String year, String runtime, String genre) {


    public String runtime(String s) {
        return this.runtime;
    }
}

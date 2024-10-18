package com.alura.screenmacth.principal;

import com.alura.screenmacth.modelos.TituloOmdb;
import com.alura.screenmacth.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("escribe el nombre de la pelicula: ");
        var busqueda = lectura.nextLine();
        String direccionWed ="https://www.omdbapi.com/?t=" + busqueda +"&apikey=71aa852a";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccionWed))
                .build();
        HttpResponse <String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy
                        .UPPER_CAMEL_CASE).create();
        TituloOmdb miTituloOmdb = gson.fromJson(json,TituloOmdb.class);
        System.out.println(miTituloOmdb);

        Titulos miTitulo = new Titulos(miTituloOmdb);
        System.out.println(miTitulo);
    }
}

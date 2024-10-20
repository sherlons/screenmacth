package com.alura.screenmacth.principal;

import com.alura.screenmacth.exception.VariableCreadaPraraNAException;
import com.alura.screenmacth.modelos.TituloOmdb;
import com.alura.screenmacth.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("escribe el nombre de la pelicula: ");
        var busqueda = lectura.nextLine();
        String busquedaCodificada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8.toString());
        String direccionWed ="https://www.omdbapi.com/?t=" + busquedaCodificada
                +"&apikey=71aa852a";
        try{
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
            System.out.println("cartelera de Precentacion: *******" + miTitulo + "********");
        } catch (NumberFormatException e ){
            System.out.println("ocurrio un error : ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("A ocurrido un error en la URI");
        }catch (VariableCreadaPraraNAException e){
            System.out.println("Error inesperado");
        }
        System.out.println("termino la cesion");

    }
}

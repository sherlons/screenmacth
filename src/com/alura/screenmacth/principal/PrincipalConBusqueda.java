package com.alura.screenmacth.principal;

import com.alura.screenmacth.exception.VariableCreadaPraraNAException;
import com.alura.screenmacth.modelos.TituloOmdb;
import com.alura.screenmacth.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        var lectura = new Scanner(System.in);
        List<Titulos>titulos= new ArrayList<>();

        var gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy
                        .UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();

        while(true){
            System.out.println("escribe el nombre de la pelicula: ");
            var busqueda = lectura.nextLine();
            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String busquedaCodificada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8.toString());
            String direccionWed ="https://www.omdbapi.com/?t=" + busquedaCodificada
                    +"&apikey=71aa852a";

            try{
                var client = HttpClient.newHttpClient();
                var request = HttpRequest.newBuilder()
                        .uri(URI.create(direccionWed))
                        .build();
                HttpResponse <String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TituloOmdb miTituloOmdb = gson.fromJson(json,TituloOmdb.class);
                System.out.println(miTituloOmdb);

                var miTitulo = new Titulos(miTituloOmdb);
                System.out.println("cartelera de Precentacion: ******* " + miTitulo + " ********");

                titulos.add(miTitulo);

            } catch (NumberFormatException e ){
                System.out.println("ocurrio un error : ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("A ocurrido un error en la URI");
            }catch (VariableCreadaPraraNAException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        var escritura = new FileWriter("titulo.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Cerrando Programa");

    }
}

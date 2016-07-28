package com.example;

import org.springframework.data.annotation.Id;

/**
 * Created by mauriff on 28/07/16.
 */
public class Birra {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Id
    private String id;
    private String temperatura;
    private String nombre;
}

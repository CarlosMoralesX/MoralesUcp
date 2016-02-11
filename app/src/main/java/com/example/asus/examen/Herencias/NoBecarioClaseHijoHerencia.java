package com.example.asus.examen.Herencias;

/**
 * Created by Asus on 10/11/2015.
 */
public class NoBecarioClaseHijoHerencia extends EstudianteClasePadreHerencia  {
    public NoBecarioClaseHijoHerencia() {
    }
    public String PagarSuMatricula(){
        return "Estoy pagando mi matricula..";
    }
    public String PagarMensualidad(){
        return "Estoy pagando mi mensualidad..";
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }


}

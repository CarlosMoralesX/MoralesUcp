package com.example.asus.examen.Interfaces;

/**
 * Created by Asus on 10/11/2015.
 */
public class NoBecarioClaseHijoInterface implements InterfaceEstudianteClasePadre {
    @Override
    public String LlenarAsistencia() {
        return "Yo no lleno asistencia";
    }

    @Override
    public String RendirCuentaAlEstado() {
        return "Yo no rindo cuentas al estado..";
    }

    @Override
    public String Asistir() {
        return "Estoy asistiendo a clases..";
    }

    @Override
    public String DarExamen() {
        return "Estoy dando examen..";
    }

    @Override
    public String AtenderClases() {
        return "Estoy atendiendo a la clase..";
    }

    @Override
    public String PagarSuMatricula() {
        return "Estoy pagando mi matricula..";
    }

    @Override
    public String PagarMensualidad() {
        return "Estoy pagando mi mensualidad..";
    }
}

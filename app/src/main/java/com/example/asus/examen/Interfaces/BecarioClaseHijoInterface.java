package com.example.asus.examen.Interfaces;

/**
 * Created by Asus on 10/11/2015.
 */
public class BecarioClaseHijoInterface implements InterfaceEstudianteClasePadre {
    @Override
    public String LlenarAsistencia() {
        return "Estoy llenando mi asistencia..";
    }

    @Override
    public String RendirCuentaAlEstado() {
        return "Estoy rindiendo cuentas al estado..";
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
        return "Yo no pago matricula..";
    }

    @Override
    public String PagarMensualidad() {
        return "Yo no pago mi mensualidad..";
    }
}


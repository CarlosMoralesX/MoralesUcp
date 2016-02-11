package com.example.asus.examen.Abstracta;

/**
 * Created by Asus on 10/11/2015.
 */
public class NoBecarioClaseHijoAbstracta extends EstudianteClasePadre {

    public String DefineObligacion;

    public NoBecarioClaseHijoAbstracta(String DefineObligacion) {
        this.DefineObligacion = DefineObligacion;
    }

    @Override
    public String Obligacion() {
        return this.DefineObligacion;
    }


}



package com.example.asus.examen.Abstracta;

/**
 * Created by Asus on 10/11/2015.
 */
public class BecarioClaseHijoAbstracta extends  EstudianteClasePadre {

    public String DefineObligacion;

    public BecarioClaseHijoAbstracta(String DefineObligacion) {
        this.DefineObligacion = DefineObligacion;
    }

    @Override
    public String Obligacion() {
        return this.DefineObligacion;
    }

}

package com.example.asus.examen.Abstracta;

/**
 * Created by Asus on 10/11/2015.
 */
public abstract class EstudianteClasePadre {
    public String NombreEstudiante;


    public String Asistir(){
        return "Estoy Asistiendo.";
    }
    public String DarExamen(){
        return "Estoy Asistiendo.";
    }
    public String AtenderClases(){
        return "Estoy Asistiendo.";
    }

    public abstract String Obligacion();

    public String TipoOblicacion(){
        String DefineObligacion = this.Obligacion();
        String TipoOblicacion = DefineObligacion;
        return TipoOblicacion;
    }
}

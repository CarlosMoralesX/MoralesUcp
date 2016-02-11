package com.example.asus.examen.Herencias;

import com.example.asus.examen.Interfaces.EstudianteClasePadreInterface;

/**
 * Created by Asus on 10/11/2015.
 */
public class BecarioClaseHijoHerencia extends EstudianteClasePadreHerencia {
    public String LlenarAsistencia(){
        return "Estoy llenando mi asistencia..";
    }

    public String RendirCuentaAlEstado(){
        return "Estoy rindiendo cuentas al estado..";
    }
}



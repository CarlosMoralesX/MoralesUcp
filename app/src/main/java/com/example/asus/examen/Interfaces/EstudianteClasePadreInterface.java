package com.example.asus.examen.Interfaces;

/**
 * Created by Asus on 10/11/2015.
 */
public class EstudianteClasePadreInterface {
private InterfaceEstudianteClasePadre interfaceEstudianteClasePadreInterface;


public EstudianteClasePadreInterface(BecarioClaseHijoInterface interfaceEstudianteClasePadreInterface) {
        this.interfaceEstudianteClasePadreInterface = interfaceEstudianteClasePadreInterface;
        }

public String LlenarAsistencia() {
        return this.interfaceEstudianteClasePadreInterface.LlenarAsistencia();
        }

public String RendirCuentaAlEstado() {
        return this.interfaceEstudianteClasePadreInterface.RendirCuentaAlEstado();
        }

protected String Asistir() {
        return this.interfaceEstudianteClasePadreInterface.Asistir();
        }

public String DarExamen() {
        return this.interfaceEstudianteClasePadreInterface.DarExamen();
        }
public String AtenderClases(){
        return this.interfaceEstudianteClasePadreInterface.AtenderClases();
        }
public String PagarSuMatricula(){
        return this.interfaceEstudianteClasePadreInterface.PagarSuMatricula();
        }
public String PagarMensualidad(){
        return this.interfaceEstudianteClasePadreInterface.PagarMensualidad();
        }


        }


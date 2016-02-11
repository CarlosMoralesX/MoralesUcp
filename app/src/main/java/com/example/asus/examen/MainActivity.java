package com.example.asus.examen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.asus.examen.Abstracta.NoBecarioClaseHijoAbstracta;
import com.example.asus.examen.Herencias.NoBecarioClaseHijoHerencia;
import com.example.asus.examen.Interfaces.BecarioClaseHijoInterface;
import com.example.asus.examen.Interfaces.EstudianteClasePadreInterface;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("onCreate", "onCreate");


        //Ejemplo INTERFACE
        EstudianteClasePadreInterface estudianteClasePadreInterface = new EstudianteClasePadreInterface(new BecarioClaseHijoInterface());
        Log.v("- Interface - El estudiante becario ", estudianteClasePadreInterface.RendirCuentaAlEstado());

        Toast.makeText(this, "Hello Word", Toast.LENGTH_LONG).show();

        // Ejemplo ABSTRACTA
        NoBecarioClaseHijoAbstracta noBecarioClaseHijoAbstracta = new NoBecarioClaseHijoAbstracta ("Rendir cuentas y llenar asistencia");
        Log.v("- Abstracta -El estudiante no becario no tiene la obligacion de ", noBecarioClaseHijoAbstracta.TipoOblicacion() + " ");

    }

    protected void onStart() {
        super.onStart();
        Log.v("onStart","onStart");
        NoBecarioClaseHijoHerencia noBecarioClaseHijoHerencia = new NoBecarioClaseHijoHerencia();
        noBecarioClaseHijoHerencia.setNombre("Carlos");
        String message = noBecarioClaseHijoHerencia.PagarMensualidad();
        Log.v("onStart", "onStart");
        Log.v("El estudiante No Becario ", message);
        Log.v("El estudiante No Becario - Nombre ", noBecarioClaseHijoHerencia.getNombre());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("onResume", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("onPause", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop", "onStop");
    }
}






package Observador.Concreto;

import Helper.Alert_Helper;
import Observador.Interfaces.iObservador;

import java.io.Serializable;

public class Observador implements iObservador {
    private String nombre;
    private Alert_Helper aHelper;

    public Observador(String nombre){
        setNombre(nombre);
        aHelper = new Alert_Helper();
    }

    @Override
    public void notificar(Serializable fecha) {
        aHelper.showAlert(fecha.toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
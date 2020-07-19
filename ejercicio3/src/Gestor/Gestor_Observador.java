package Gestor;

import Observador.Concreto.*;

import java.util.Date;

public class Gestor_Observador {
    private Reloj reloj;

    public Gestor_Observador(){
        reloj = new Reloj();
    }

    public void nuevoObservador(String nombre){
        reloj.agregarObservador( new Observador(nombre) );
    }

    public String agregarNumero(int numero){
        nuevoObservador("Numero");
        reloj.setNumero(numero);

        return "** Numero guardado";
    }

    public String agregarSegundos(int segundos){
        nuevoObservador("Secuencia");
        reloj.setSegundosSecuencia(segundos);

        return "** Secuencia guardada";
    }

    public boolean actualizarFecha(Date fecha){
        if(reloj.getNumero() == 0 || reloj.getSegundosSecuencia() == 0){
            return false;
        }else{
            reloj.setFecha(fecha);

            return true;
        }
    }
}
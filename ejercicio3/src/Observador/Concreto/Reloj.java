package Observador.Concreto;

import Observador.Interfaces.iObservador;
import Observador.Interfaces.iReloj;

import java.util.Date;

public class Reloj implements iReloj {
    private int numero;
    private int segundosSecuencia;
    private Date fecha;
    private iObservador obs;

    public Reloj(){
    }

    @Override
    public void agregarObservador(iObservador obs) {
        this.obs = obs;
    }

    @Override
    public void removerObservador(iObservador obs) {

    }

    @Override
    public void notificar() {
        if (getFecha().getSeconds() % 7 == 0) {
            obs.notificar(getFecha());
        }

        if(String.valueOf(getFecha().getMinutes() ).contains( String.valueOf( getNumero() ) ) ){
            obs.notificar( getFecha() );
        }

        try{
            Thread.sleep((getSegundosSecuencia()-1) * 1000);
            obs.notificar( getFecha() );
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSegundosSecuencia() {
        return segundosSecuencia;
    }

    public void setSegundosSecuencia(int segundosSecuencia) {
        this.segundosSecuencia = segundosSecuencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
        notificar();
    }
}
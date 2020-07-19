package Observador.Concreto;

import Observador.Interfaces.iObservador;
import Observador.Interfaces.iReloj;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

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
        if(getFecha().getMinutes() % numero == 0){
            obs.notificar( getFecha() );
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                obs.notificar(getFecha());
            }
        }, getSegundosSecuencia() * 1000);
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
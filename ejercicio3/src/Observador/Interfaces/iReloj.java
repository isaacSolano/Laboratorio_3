package Observador.Interfaces;

public interface iReloj {
    void agregarObservador(iObservador obs);
    void removerObservador(iObservador obs);
    void notificar();
}
package Comando_Concreto;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

import java.util.ArrayList;

public class Super_Comandos implements Comandos_Dispositivos {
    private ArrayList<Comandos_Dispositivos> comandos = new ArrayList<>();

    public void agregarComando(Comandos_Dispositivos comando){
        comandos.add(comando);
    }
    public Comandos_Dispositivos obtenerComando(int indice){
        return comandos.get(indice);
    }

    @Override
    public String ejecutar_comando(Producto producto) {
        return null;
    }
}
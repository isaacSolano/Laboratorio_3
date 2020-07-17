package Comando_Concreto.Comandos_TV;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Cambiar_SRC implements Comandos_Dispositivos {

    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Cambiando recurso");
        return "Cambiando recurso en " + producto.getNombre();
    }
}
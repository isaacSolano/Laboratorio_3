package Comando_Concreto.Comandos_TV;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Cambiar_Canales implements Comandos_Dispositivos {
    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Cambiando canales...");
        return "Cambiando canales en " + producto.getNombre();
    }
}

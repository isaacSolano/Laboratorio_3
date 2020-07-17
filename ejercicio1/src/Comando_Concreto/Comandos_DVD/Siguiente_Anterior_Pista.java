package Comando_Concreto.Comandos_DVD;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Siguiente_Anterior_Pista implements Comandos_Dispositivos {
    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Cambiando pista...");

        return "Cambiando pista en el " + producto.getNombre();
    }
}
package Comando_Concreto.Comandos_TV;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Subir_Bajar_Volumen implements Comandos_Dispositivos {

    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Cambiando nivel de volumen...");
        return "Cambiando volumen del " + producto.getNombre();
    }
}

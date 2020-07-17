package Comando_Concreto;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Reproducir_Detener_Video implements Comandos_Dispositivos {
    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Reproduciendo/Deteniendo video...");
        return "Reproduciendo/Deteniendo en " + producto.getNombre();
    }
}

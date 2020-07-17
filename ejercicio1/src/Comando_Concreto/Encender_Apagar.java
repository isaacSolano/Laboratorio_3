package Comando_Concreto;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Encender_Apagar implements Comandos_Dispositivos {

    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Enciendo.../Apagando...");
        return "Enciendo/Apagando " + producto.getNombre();
    }
}
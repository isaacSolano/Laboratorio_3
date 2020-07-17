package Comando_Concreto.Comandos_TBOX;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Navegar_Inicio implements Comandos_Dispositivos {
    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Navegando a inicio...");
        return "Navegando a inicio en " + producto.getNombre();
    }
}

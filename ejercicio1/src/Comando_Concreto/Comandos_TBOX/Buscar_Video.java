package Comando_Concreto.Comandos_TBOX;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Buscar_Video implements Comandos_Dispositivos {

    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Buscando video...");
        return "Buscando video en " + producto.getNombre();
    }
}
package Comando_Concreto.Comandos_TBOX;

import Comando_Abstracto.Comandos_Dispositivos;
import Productos.Producto;

public class Abrir_Aplicacion implements Comandos_Dispositivos {
    @Override
    public String ejecutar_comando(Producto producto) {
        producto.setEstado("Abriendo aplicacion...");
        return "Abriendo " + producto.getNombre();
    }
}

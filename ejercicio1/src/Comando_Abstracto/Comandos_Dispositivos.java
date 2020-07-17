package Comando_Abstracto;

import Productos.Producto;

public interface Comandos_Dispositivos {
    public String ejecutar_comando(Producto producto);
}
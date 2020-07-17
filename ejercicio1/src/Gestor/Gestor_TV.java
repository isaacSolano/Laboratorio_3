package Gestor;

import Comando_Concreto.Comandos_TV.Cambiar_Canales;
import Comando_Concreto.Comandos_TV.Cambiar_SRC;
import Comando_Concreto.Comandos_TV.Subir_Bajar_Volumen;
import Comando_Concreto.Encender_Apagar;
import Comando_Concreto.Super_Comandos;
import Productos.Producto;

public class Gestor_TV {
    private Producto TV = new Producto("TV");
    private Super_Comandos sComandos = new Super_Comandos();

    public Gestor_TV(){
        sComandos.agregarComando(new Encender_Apagar());
        sComandos.agregarComando(new Subir_Bajar_Volumen());
        sComandos.agregarComando(new Cambiar_Canales());
        sComandos.agregarComando(new Cambiar_SRC());
    }

    public String getComandos_TV(){
        return "<-- Bienvenido[MENU TV] -->\n"+
                "[0]. Encender/Apagar\n"+
                "[1]. Subir/Bajar volumen\n"+
                "[2]. Cambiar canales\n"+
                "[3]. Cambiar recurso\n"+
                "[4]. Salir\n";
    }

    public String ejecutarComando(int comando_seleccionado){
        return sComandos.obtenerComando(comando_seleccionado).ejecutar_comando(TV);
    }
}

package Gestor;

import Comando_Concreto.Comandos_DVD.Siguiente_Anterior_Pista;
import Comando_Concreto.Encender_Apagar;
import Comando_Concreto.Reproducir_Detener_Video;
import Comando_Concreto.Super_Comandos;
import Productos.Producto;

public class Gestor_DVD {
    private Gestor_TV gTV = new Gestor_TV();
    private Producto dvd = new Producto("DVD");
    private Super_Comandos sComandos = new Super_Comandos();

    public Gestor_DVD(){
        sComandos.agregarComando( new Encender_Apagar() );
        sComandos.agregarComando( new Reproducir_Detener_Video() );
        sComandos.agregarComando( new Siguiente_Anterior_Pista() );
    }

    public String getComandosDVD(){
        return "<-- Bienvenido[MENU DVD] -->\n"+
                "[0]. Encender/Apagar\n"+
                "[1]. Reproducir/Detener video\n"+
                "[2]. Siguiente/Anterior pista\n"+
                "[3]. Subir/Bajar volumen\n";
    }

    public String ejecutarComando(int comando){
        if(comando > 3){
            return "Opcion invalida";
        }else if(comando == 3){
            return gTV.ejecutarComando(1);
        }else{
            return sComandos.obtenerComando(comando).ejecutar_comando(dvd);
        }
    }
}

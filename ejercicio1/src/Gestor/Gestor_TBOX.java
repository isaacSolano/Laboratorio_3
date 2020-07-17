package Gestor;

import Comando_Concreto.Comandos_TBOX.Abrir_Aplicacion;
import Comando_Concreto.Comandos_TBOX.Buscar_Video;
import Comando_Concreto.Comandos_TBOX.Navegar_Inicio;
import Comando_Concreto.Encender_Apagar;
import Comando_Concreto.Reproducir_Detener_Video;
import Comando_Concreto.Super_Comandos;
import Productos.Producto;

public class Gestor_TBOX {
    private Gestor_TV gTV = new Gestor_TV();
    private Producto t_box = new Producto("T-Box");
    private Super_Comandos sComandos = new Super_Comandos();

    public Gestor_TBOX(){
        sComandos.agregarComando( new Encender_Apagar() );
        sComandos.agregarComando( new Abrir_Aplicacion() );
        sComandos.agregarComando( new Buscar_Video() );
        sComandos.agregarComando( new Reproducir_Detener_Video() );
        sComandos.agregarComando( new Navegar_Inicio() );
    }

    public String getComandosTBOX(){
        return "<-- Bienvenido[MENU TBOX] -->\n"+
                "[0]. Encender/Apagar\n"+
                "[1]. Abrir aplicacion\n"+
                "[2]. Buscar video\n"+
                "[3]. Reproducir/Detener video\n"+
                "[4]. Subir/Bajar volumen\n"+
                "[5]. Volver Inicio\n";
    }

    public String ejecutarComando(int comando){
        if(comando > 5){
            return "Opcion invalida";
        }else if(comando == 4){
            return gTV.ejecutarComando(1);
        }else{
            return sComandos.obtenerComando(comando).ejecutar_comando(t_box);
        }
    }
}

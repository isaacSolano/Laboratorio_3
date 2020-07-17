package Gestor;

public class Gestor_Main {
    private Gestor_TV gTV = new Gestor_TV();
    private Gestor_DVD gDVD = new Gestor_DVD();
    private Gestor_TBOX gTBOX = new Gestor_TBOX();

    public String getComandos_TV(){
        return gTV.getComandos_TV();
    }

    public String getComandosDVD(){
        return gDVD.getComandosDVD();
    }

    public String getComandosTBOX(){
        return gTBOX.getComandosTBOX();
    }

    public String procesarOpcionTV(int opcion){
        return gTV.ejecutarComando(opcion);
    }

    public String procesarOpcionDispositivo(int dispositivo, int comando){
        String respuesta = "";

        if(dispositivo == 1){
            respuesta = gDVD.ejecutarComando(comando);
        }
        if(dispositivo == 2){
            respuesta = gTBOX.ejecutarComando(comando);
        }

        return respuesta;
    }
}

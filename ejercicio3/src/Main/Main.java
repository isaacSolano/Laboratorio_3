package Main;

import Gestor.Gestor_Observador;

import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Gestor_Observador gObservador = new Gestor_Observador();

    public static void main(String[] args) {
        procesarOpcion();
    }

    public static void procesarOpcion(){
        int opcion = menu();
        String mensaje;

        while(opcion != 4){
            switch (opcion){
                case 1:
                    System.out.println( gObservador.agregarNumero( solicitarDatos("** Ingrese el numero que desea observar") ) );
                    opcion = menu();
                    break;

                case 2:
                    System.out.println( gObservador.agregarSegundos( solicitarDatos("** Ingrese la cantidad de segundos que desea observar") ) );
                    opcion = menu();
                    break;

                case 3:
                    comenzarSecuencia();
                    break;

                default:
                    System.out.println("Opcion invalida, intente de nuevo");
                    break;
            }
        }
    }

    public static int menu(){
        String menu = "[1]. Ingrese un numero para observar\n"+
                        "[2]. Ingrese una cantidad de segundos\n"+
                        "[3]. Comenzar reloj\n"+
                        "[4]. Salir\n";

        System.out.println(menu);
        return in.nextInt();
    }

    public static int solicitarDatos(String mensaje){
        System.out.println(mensaje);

        return in.nextInt();
    }

    public static void comenzarSecuencia(){
        try {
            Thread.sleep(1000);
            if(!gObservador.actualizarFecha( new Date() )){
                Thread.currentThread().interrupt();
                System.err.println("Necesita ingresar informacion antes de poder utilizar el Observador, y verifique que los valores no sean 0");
            }

        } catch (InterruptedException e) {
            System.err.println("Secuencia detenida");
            procesarOpcion();
        }
    }
}
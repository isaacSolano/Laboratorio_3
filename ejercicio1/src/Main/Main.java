package Main;

import Gestor.Gestor_Main;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Gestor_Main gMain = new Gestor_Main();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int opcion = 0;
        String mensaje;

        while(opcion != 4){
            System.out.println( gMain.getComandos_TV() );
            opcion = in.nextInt();

            switch (opcion){
                case 0: case 1: case 2:
                    mensaje = gMain.procesarOpcionTV(opcion);
                    break;

                case 3:
                    mensaje = procesarSubOpcion();
                    break;

                case 4:
                    mensaje = "Adios";
                    break;

                default:
                    mensaje = "Opcion invalida";
                    break;
            }
            System.out.println(mensaje);
        }
    }

    public static String solicitarRecurso(){
        return "[1]. DVD\n" +
                "[2]. T-Box";
    }

    public static String procesarSubOpcion(){
        System.out.println( solicitarRecurso() );
        int subOpcion = in.nextInt(), comando;
        String subMenu;

        switch (subOpcion){
            case 1:
                subMenu = gMain.getComandosDVD();
                break;

            case 2:
                subMenu = gMain.getComandosTBOX();
                break;

            default:
                subMenu = "Opcion invalida";
                break;
        }

        System.out.println(subMenu);
        comando = in.nextInt();

        return gMain.procesarOpcionDispositivo(subOpcion, comando);
    }
}
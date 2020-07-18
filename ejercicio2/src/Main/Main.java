package Main;

import Gestor.Gestor_Visitante;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Gestor_Visitante gVisitante = new Gestor_Visitante();

    public static void main(String[] args) {
        String mensaje = crearEspecialistas();
        int opcion = menu();

        while(opcion != 0){
            switch (opcion){
                case 1:
                    mensaje = asignarMedicamentos();
                    break;

                case 2:
                    mensaje = imprimirInforme();
                    break;

                default:
                    mensaje = "Opcion invalida, intente de nuevo";
                    break;
            }

            System.out.println(mensaje);
            opcion = menu();
        }
    }

    public static int menu(){
        String menu = "==================================\n"+
                        "[0]. Salir\n" +
                        "[1]. Asignar medicamentos\n"+
                        "[2]. Imprimir reporte medicamentos\n"+
                        "==================================";

        System.out.println(menu);

        return in.nextInt();
    }

    public static String crearEspecialistas(){
        return "==================================\n" +
                "Crear Especialistas\n" +
                gVisitante.crearEspecialistas();
    }

    public static String asignarMedicamentos(){
        gVisitante.crearVisitantes();

        return "==================================\n" +
                "Asignando Mediamentos\n" +
                gVisitante.visitarConcretos();
    }

    public static String imprimirInforme(){
        return "==================================\n" +
                "Crear Especialistas\n" +
                gVisitante.imprimirInforme();
    }
}
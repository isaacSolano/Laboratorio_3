package Main;

import Gestor.Gestor_Visitante;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Gestor_Visitante gVisitante = new Gestor_Visitante();

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Crear Especialistas");
        System.out.println( crearEspecialistas() );

        System.out.println("==================================");
        System.out.println("Mostrando cantidad de medicamentos por especialista");
        System.out.println( imprimirInforme() );

        System.out.println("==================================");
        System.out.println("Crear Visitantes");
        System.out.println( crearVisitantes() );

        System.out.println("==================================");
        System.out.println("Visitar especialistas y equipar medicamentos");
        System.out.println( visitarConcretos() );

        System.out.println("==================================");
        System.out.println("Mostrando cantidad de medicamentos por especialista");
        System.out.println( imprimirInforme() );
    }
    public static String crearEspecialistas(){
        return gVisitante.crearEspecialistas();
    }

    public static String crearVisitantes(){
        return gVisitante.crearVisitantes();
    }

    public static String visitarConcretos(){
        return gVisitante.visitarConcretos();
    }

    public static String imprimirInforme(){
        return gVisitante.imprimirInforme();
    }
}
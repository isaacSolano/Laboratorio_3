package Gestor;

import Concretos.Especialistas.Dentista;
import Concretos.Especialistas.Medico_General;
import Concretos.Especialistas.Psiquiatra;
import Concretos.Visitantes.Equipar_Dental_Care;
import Concretos.Visitantes.Equipar_Paliperidona;
import Concretos.Visitantes.Equipar_Paracetamol;
import Concretos.Visitantes.Equipar_Pomada;
import Helper.Helper;
import Interfaces.Especialistas;
import Interfaces.Visitante;

import java.util.ArrayList;
import java.util.HashMap;

public class Gestor_Visitante {
    private Helper helper = new Helper();
    private ArrayList<Especialistas> arrEspeciaistas;
    private HashMap<String, Visitante> objVisitantes;

    public Gestor_Visitante(){
        arrEspeciaistas = new ArrayList<>();
        objVisitantes = new HashMap<>();
    }

    public String crearEspecialistas(){
        String respuesta = "----------------------------------\n";

        arrEspeciaistas.add( new Dentista("Dentista") );
        respuesta += "Dentista creado\n";

        arrEspeciaistas.add( new Psiquiatra("Psiquiatra") );
        respuesta += "Psiquiatra creado\n";

        arrEspeciaistas.add( new Medico_General("Medico General") );
        respuesta += "Medico general creado\n";

        respuesta += "==================================\n";
        return respuesta;
    }

    public void crearVisitantes(){
        objVisitantes.put("DentalCare", new Equipar_Dental_Care() );
        objVisitantes.put("Paliperidona", new Equipar_Paliperidona() );
        objVisitantes.put("Pomada", new Equipar_Pomada() );
        objVisitantes.put("Paracetamol", new Equipar_Paracetamol() );
    }

    public String visitarConcretos(){
        String respuesta = "----------------------------------\n";

        if(arrEspeciaistas.size() == 0){
            respuesta += "** No hay especialistas creados **\n";
        }else {
            for (int i = 0; i < helper.getRandom(3); i++) {
                objVisitantes.forEach((key, val) -> {
                    val.visit(arrEspeciaistas);
                });

                respuesta += "Visitando medicos y brindando medicamentos...\n";
            }
        }
        respuesta += "==================================\n";
        return respuesta;
    }

    public String imprimirInforme(){
        String respuesta = "----------------------------------\n";

        for(Especialistas especialista : arrEspeciaistas){
            respuesta += especialista.getNombre() + "\n";
            respuesta += especialista.imprimirMedicamentos() + "\n";
        }

        respuesta += "==================================\n";
        return respuesta;
    }
}
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

    public String crearVisitantes(){
        String respuesta = "----------------------------------\n";

        objVisitantes.put("DentalCare", new Equipar_Dental_Care() );
        respuesta += "Visitante dental care creado\n";

        objVisitantes.put("Paliperidona", new Equipar_Paliperidona() );
        respuesta += "Visitante paliperidona creado\n";

        objVisitantes.put("Pomada", new Equipar_Pomada() );
        respuesta += "Visitante pomada creado\n";

        objVisitantes.put("Paracetamol", new Equipar_Paracetamol() );
        respuesta += "Visitante paracetamol creado\n";

        respuesta += "==================================\n";
        return respuesta;
    }

    public String visitarConcretos(){
        String respuesta = "----------------------------------\n";

        for(int i=0; i<helper.getRandom(3); i++){
            objVisitantes.forEach( (key, val) -> {
                val.visit(arrEspeciaistas);
            });

            respuesta += "Visitando medicos y brindando medicamentos...\n";
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
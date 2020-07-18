package Concretos.Visitantes;

import Concretos.Especialistas.Dentista;
import Concretos.Especialistas.Medico_General;
import Concretos.Especialistas.Psiquiatra;
import Concretos.Medicamentos.Dental_Care;
import Interfaces.Especialistas;
import Interfaces.Visitante;

import java.util.ArrayList;

public class Equipar_Dental_Care implements Visitante {
    @Override
    public void visit(Dentista dentista) {
        dentista.agregarMedicamentos( new Dental_Care() );
    }

    @Override
    public void visit(Medico_General medico_general) {

    }

    @Override
    public void visit(Psiquiatra psiquiatra) {

    }

    @Override
    public void visit(ArrayList<Especialistas> arrEspecialistas) {
        for(Especialistas especialistas : arrEspecialistas){
            especialistas.accept(this);
        }
    }
}

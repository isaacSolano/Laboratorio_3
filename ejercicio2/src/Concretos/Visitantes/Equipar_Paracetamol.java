package Concretos.Visitantes;

import Concretos.Especialistas.Dentista;
import Concretos.Especialistas.Medico_General;
import Concretos.Especialistas.Psiquiatra;
import Concretos.Medicamentos.Paracetamol;
import Interfaces.Especialistas;
import Interfaces.Visitante;

import java.util.ArrayList;

public class Equipar_Paracetamol implements Visitante {
    @Override
    public void visit(Dentista dentista) {
        dentista.agregarMedicamentos( new Paracetamol() );
    }

    @Override
    public void visit(Medico_General medico_general) {
        medico_general.agregarMedicamentos( new Paracetamol() );
    }

    @Override
    public void visit(Psiquiatra psiquiatra) {
        psiquiatra.agregarMedicamentos( new Paracetamol() );
    }

    @Override
    public void visit(ArrayList<Especialistas> arrEspecialistas) {
        for(Especialistas especialistas : arrEspecialistas){
            especialistas.accept(this);
        }
    }
}

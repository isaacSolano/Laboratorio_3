package Concretos.Visitantes;

import Concretos.Especialistas.Dentista;
import Concretos.Especialistas.Medico_General;
import Concretos.Especialistas.Psiquiatra;
import Concretos.Medicamentos.Pomada;
import Interfaces.Especialistas;
import Interfaces.Visitante;

import java.util.ArrayList;

public class Equipar_Pomada implements Visitante {
    @Override
    public void visit(Dentista dentista) {

    }

    @Override
    public void visit(Medico_General medico_general) {
        medico_general.agregarMedicamentos( new Pomada() );
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

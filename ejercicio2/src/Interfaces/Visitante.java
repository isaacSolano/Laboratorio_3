package Interfaces;

import Concretos.Especialistas.Dentista;
import Concretos.Especialistas.Medico_General;
import Concretos.Especialistas.Psiquiatra;

import java.util.ArrayList;

public interface Visitante {
    void visit(Dentista dentista);
    void visit(Medico_General medico_general);
    void visit(Psiquiatra psiquiatra);
    void visit(ArrayList<Especialistas> arrEspecialistas);
}
package Interfaces;

import Concretos.Medicamentos.Medicamento;

public interface Especialistas {
    void agregarMedicamentos(Medicamento medicamento);
    void accept(Visitante visitante);
    String imprimirMedicamentos();
    String getNombre();
}
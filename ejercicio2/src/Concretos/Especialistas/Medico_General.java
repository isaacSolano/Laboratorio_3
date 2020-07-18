package Concretos.Especialistas;

import Concretos.Medicamentos.Medicamento;
import Concretos.Medicamentos.Paracetamol;
import Concretos.Visitantes.Equipar_Paracetamol;
import Concretos.Visitantes.Equipar_Pomada;
import Interfaces.Especialistas;
import Interfaces.Visitante;

import java.util.ArrayList;

public class Medico_General implements Especialistas {
    ArrayList<Medicamento> arrMedicamentos;
    String nombre;

    public Medico_General(String nombre){
        arrMedicamentos = new ArrayList<>();
        setNombre(nombre);
    }

    public ArrayList<Medicamento> getArrMedicamentos() {
        return arrMedicamentos;
    }

    public void setArrMedicamentos(ArrayList<Medicamento> arrMedicamentos) {
        this.arrMedicamentos = arrMedicamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregarMedicamentos(Medicamento medicamento) {
        arrMedicamentos.add(medicamento);
    }

    @Override
    public void accept(Visitante visitante) {
        if(visitante.getClass().equals(Equipar_Pomada.class) || visitante.getClass().equals(Equipar_Paracetamol.class)){
            visitante.visit(this);
        }
    }

    @Override
    public String imprimirMedicamentos() {
        int cantParacetamol = 0;
        int cantPomada = 0;

        for(Medicamento med : arrMedicamentos){
            if(med.getClass().equals(Paracetamol.class)){
                cantParacetamol += med.getDosis();
            }else{
                cantPomada += med.getDosis();
            }
        }


        return "Total de pomada: " + cantPomada + "\n"+
                "Total de paracetamol: " + cantParacetamol;
    }
}

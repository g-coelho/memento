package org.example;

public class AtletaEstadoTreinadoTecnico implements AtletaEstado{

    private AtletaEstadoTreinadoTecnico() {};
    private static AtletaEstadoTreinadoTecnico instance = new AtletaEstadoTreinadoTecnico();
    public static AtletaEstadoTreinadoTecnico getInstance() {
        return instance;
    }


    @Override
    public String getNomeEstado() {
        return "Treinado técnico";
    }
}

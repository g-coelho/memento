package org.example;

public class AtletaEstadoTreinadoFisico implements AtletaEstado{

    private AtletaEstadoTreinadoFisico() {};
    private static AtletaEstadoTreinadoFisico instance = new AtletaEstadoTreinadoFisico();
    public static AtletaEstadoTreinadoFisico getInstance() {
        return instance;
    }


    @Override
    public String getNomeEstado() {
        return "Treinado físico";
    }
}

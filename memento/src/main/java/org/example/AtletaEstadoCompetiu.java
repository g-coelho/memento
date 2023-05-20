package org.example;

public class AtletaEstadoCompetiu implements AtletaEstado{

    private AtletaEstadoCompetiu() {};
    private static AtletaEstadoCompetiu instance = new AtletaEstadoCompetiu();
    public static AtletaEstadoCompetiu getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Competiu";
    }
}

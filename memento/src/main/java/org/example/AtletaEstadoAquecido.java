package org.example;

public class AtletaEstadoAquecido implements  AtletaEstado{

    private AtletaEstadoAquecido() {};
    private static AtletaEstadoAquecido instance = new AtletaEstadoAquecido();
    public static AtletaEstadoAquecido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Aquecido";
    }
}

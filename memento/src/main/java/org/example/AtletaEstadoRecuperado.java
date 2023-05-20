package org.example;

public class AtletaEstadoRecuperado implements AtletaEstado{

    private AtletaEstadoRecuperado() {};
    private static AtletaEstadoRecuperado instance = new AtletaEstadoRecuperado();
    public static AtletaEstadoRecuperado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Recuperado";
    }
}

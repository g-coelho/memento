package org.example;

public class AtletaEstadoContratado implements AtletaEstado{

    private AtletaEstadoContratado() {};
    private static AtletaEstadoContratado instance = new AtletaEstadoContratado();
    public static AtletaEstadoContratado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Contratado";
    }
}

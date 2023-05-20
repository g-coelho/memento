package org.example;

public class AtletaEstadoRepousado implements AtletaEstado{

    private AtletaEstadoRepousado() {};
    private static AtletaEstadoRepousado instance = new AtletaEstadoRepousado();
    public static AtletaEstadoRepousado getInstance() {
        return instance;
    }


    @Override
    public String getNomeEstado() {
        return "Repousado";
    }
}

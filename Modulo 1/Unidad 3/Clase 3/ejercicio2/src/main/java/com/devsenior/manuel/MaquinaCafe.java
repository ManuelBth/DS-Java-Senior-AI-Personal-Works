package com.devsenior.manuel;


public class MaquinaCafe {

    private boolean tieneAgua;
    private boolean tieneCafe;

    public MaquinaCafe(boolean tieneAgua, boolean tieneCafe) {
        this.tieneAgua = tieneAgua;
        this.tieneCafe = tieneCafe;
    }

    public String prepararCafe(){
        if(!tieneAgua && !tieneCafe) return "Falta agua y cafe";
        if(!tieneAgua) return "Falta agua";
        if(!tieneCafe) return "Falta cafe";
        return "Cafe preparado";
    }
}

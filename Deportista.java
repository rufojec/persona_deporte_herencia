package com.herencia.ejemplo01;

public class Deportista extends Persona {

    private String deporte;

    public Deportista(String nombre) {
        super(nombre);

    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void andar(){
        super.iniciaMovimiento();
        System.out.println(" a 4 KM/H");
    }

}
package com.herencia.ejemplo01;

public class Notario extends Persona {

    public Notario(String nombre){
        super(nombre);
    }

    @Override
    public void andar(){
        super.iniciaMovimiento();
        System.out.println(" 1 KM/H ");
    }

}

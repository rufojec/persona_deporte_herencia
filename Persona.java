package com.herencia.ejemplo01;

public class Persona {

    private String nombre;

    public Persona(String nombre){
        super(); // usando el constructor del padre
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void iniciaMovimiento(){
        System.out.println(getNombre() + " camina a ");
    }

    public void andar(){
        iniciaMovimiento();
        System.out.println(" 2 KM/H");
    }

}
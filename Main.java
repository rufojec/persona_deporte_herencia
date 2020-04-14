package com.herencia.ejemplo01;

public class Main {

    public static void main(String[]args){
        // TODO Auto-generated method stub
        Persona p1 = new Persona("Adolfo");
        Persona d1 = new Deportista("Vidal");
        Persona p3 = new Notario("Aristides");

        iniciaMovimiento(d1);
        iniciaMovimiento(p3);
        iniciaMovimiento(p1);
    }

    static void iniciaMovimiento(Persona persona){
        persona.andar();
    }
}

package org.example;

import Procesadores.Procesadores;
import Procesadores.Procesadores_moviles;
import Procesadores.Procesadores_AMD;

import java.security.KeyStore;

public class Main {
    public static void main(String[] args) {

        //PaulCabrera
        Procesadores pi = new Procesadores();

        //TADIO
        Procesadores p = new Procesadores_moviles();
        Procesadores p1 = new Procesadores_moviles(125,"SnapDragon 888",8, 18.7,true);
        p1.imprimir_datos();
        Procesadores q = new Procesadores_AMD();





    }

}
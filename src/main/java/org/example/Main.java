package org.example;

import Procesadores.Procesadores;
import Procesadores.Procesadores_moviles;
import Procesadores.Procesadores_AMD;

import java.security.KeyStore;

public class Main {
    public static void main(String[] args) {

        //PaulCabrera
        Procesadores pi1 = new Procesadores_AMD();
        Procesadores pi2 = new Procesadores_AMD(57600, "Ryzen 5",6,3.3,false);

        //TADIO
        Procesadores p = new Procesadores_moviles();
        Procesadores p1 = new Procesadores_moviles(5,"SnapDragon 888",8, 18.7,true);
        p1.imprimir_datos();
        Procesadores q = new Procesadores_AMD();
        Procesadores q1 = new Procesadores_AMD(65,"Ryzen 5 5500",4,3.6,true);






    }

}
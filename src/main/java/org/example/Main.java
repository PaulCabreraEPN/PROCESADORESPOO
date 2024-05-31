package org.example;

import Procesadores.Procesadores;
import Procesadores.Procesadores_moviles;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;

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

        //Tadio haz 2 istancias de procesadores intel
        Procesadores q = new Procesadores_Intel();
        Procesadores q1 = new Procesadores_Intel(65,"Intel I7",4,3.6,false);


        Procesadores proc1= new Procesadores();
        proc1.imprimir_datos();

        Procesadores proc2 = new Procesadores_moviles();
        proc2.imprimir_datos();

        Procesadores proc3 = new Procesadores_AMD();
        proc3.imprimir_datos();

        Procesadores proc4 = new Procesadores_Intel();
        proc4.imprimir_datos();

    }

}
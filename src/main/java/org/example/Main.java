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

        //Pail haz 2 instanciasde procesadores de escritorio






    }

}
package Procesadores;

public class Procesadores {
    int nucleos;
    int consumo;
    double velocidad;
    String nombre;

    public Procesadores(int consumo, String nombre, int nucleos, double velocidad) {
        this.consumo = consumo;
        this.nombre = nombre;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public Procesadores() {}

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //metodos personalizads

    public void imprimir_datos() {
        System.out.println("Consumo: " + consumo +"W");
        System.out.println("Nombre: " + nombre);
        System.out.println("Velocidad: " + velocidad + "GHz");
        System.out.println("Nucleos: " + nucleos);
    }
}

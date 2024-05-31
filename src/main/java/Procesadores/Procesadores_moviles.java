package Procesadores;

public class Procesadores_moviles extends Procesadores {
    boolean optimizacion_energia;

    public Procesadores_moviles() {
    }

    public Procesadores_moviles(int consumo, String nombre, int nucleos, double velocidad, boolean optimizacion_energia) {
        super(consumo, nombre, nucleos, velocidad);
        this.optimizacion_energia = optimizacion_energia;
    }

    public boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    @Override
    public void imprimir_datos(){
        System.out.println("Clase hija: moviles");
    }
}

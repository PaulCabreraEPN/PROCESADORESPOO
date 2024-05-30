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

    public void imprmir_datos_escritrio() {
        System.out.println("El nombre del procesador es: " + getNombre());
        System.out.println("Los nucleos del procesador son: " + getNucleos());
        System.out.println("La velocidad del procesador es: " + getVelocidad() + "GHz");
        System.out.println("El consumo del procesador es: " + getConsumo() + "% menos que la media");
        System.out.println("La optimizacion de energia  es: " + getOptimizacion_energia());

    }
}

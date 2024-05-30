package Procesadores;

public class Procesadores_escritorio extends Procesadores {
    String socket;

    public Procesadores_escritorio() {}

    public Procesadores_escritorio(int consumo, String nombre, int nucleos, double velocidad) {
        super(consumo, nombre, nucleos, velocidad);
    }


    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void imprmir_datos_escritrio() {
        System.out.println("El nombre del procesador es: " + getNombre());
        System.out.println("Los nucleos del procesador son: " + getNucleos());
        System.out.println("La velocidad del procesador es: " + getVelocidad());
        System.out.println("El consumo del procesador es: " + getConsumo());
        System.out.println("El socket del procesador es: " + getSocket());

    }
}

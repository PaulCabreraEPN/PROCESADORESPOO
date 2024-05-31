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

    @Override
    public void imprimir_datos(){
        System.out.println("Clase hija: escritorio");
    }
}

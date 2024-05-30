package Procesadores;

public class Procesadores_Intel extends Procesadores_escritorio{
    boolean tarjeta_video;

    public Procesadores_Intel() {
    }

    public Procesadores_Intel(boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    public Procesadores_Intel(int consumo, String nombre, int nucleos, double velocidad, boolean tarjeta_video) {
        super(consumo, nombre, nucleos, velocidad);
        this.tarjeta_video = tarjeta_video;
    }

    public boolean isTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }


    public void imprmir_datos_escritrio_intel() {
        super.imprmir_datos_escritrio();
        System.out.println("Tarjeta de video: " + tarjeta_video);
    }
}

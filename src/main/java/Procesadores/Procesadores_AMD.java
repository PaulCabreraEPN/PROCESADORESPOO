package Procesadores;

public class Procesadores_AMD extends Procesadores_escritorio{
    boolean GraficosIntegrados;

    public Procesadores_AMD() {
    }

    public Procesadores_AMD(int consumo, String nombre, int nucleos, double velocidad, boolean graficosIntegrados) {
        super(consumo, nombre, nucleos, velocidad);
        GraficosIntegrados = graficosIntegrados;
    }

    public boolean getGraficosIntegrados() {
        return GraficosIntegrados;
    }

    public void setGraficosIntegrados(boolean graficosIntegrados) {
        GraficosIntegrados = graficosIntegrados;
    }

    //subrescribir metodo de impresion

     @Override
    public void imprimir_datos(){
        System.out.println("Clase hija: AMD");
     }



}

package edu.pingpong.cotxox.carrera;

public class Carrera {
    
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0d;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal = 0d;
    private int propina;


    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }


    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public int getPropina() {
        return propina;
    }

    public double getCosteEsperado() {
        // Por ahora el valor que retorna está mockeado, debido a que aún
        // no está implementada la Clase Tarifa
        return 10.2d;
    }


}

package edu.pingpong.cotxox.carrera;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {
    
    private Carrera carrera = null;
    // Datos sobre la Carrera de la Historia de Usuario
    private String tarjetaCredito = "4916119711304546";
    private String origen = "Aeroport Son Sant Joan";
	private String destino = "Magaluf";
	private double distancia = 7.75;
	private int tiempoEsperadoMinutos = 10;

    @Before
    public void setupCarrera() {

        this.carrera =  new Carrera(tarjetaCredito);
    }

    @Test
    public void constructor() {

        assertNotNull(this.carrera);
    }

    @Test
    public void getTarjetaCredito() {

        assertEquals(this.tarjetaCredito, this.carrera.getTarjetaCredito());

        System.out.println("Visa: " + carrera.getTarjetaCredito());
    }
}

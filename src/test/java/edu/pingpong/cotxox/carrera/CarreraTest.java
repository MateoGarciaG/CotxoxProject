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
    public void getDatosCarreraTest() {

        /** Comprobar si los getters funcionan con los datos actuales de
        esta clase Test */
        assertEquals(this.tarjetaCredito, this.carrera.getTarjetaCredito());
        assertEquals(this.origen, this.carrera.getOrigen());
        assertEquals(this.destino, this.carrera.getDestino());
        assertEquals(this.distancia, this.carrera.getDistancia(), 0);
        assertEquals(10.2d, this.carrera.getCosteEsperado(), 0);
        

        System.out.println("Visa: " + carrera.getTarjetaCredito());
        System.out.println("From: " + carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());
        // Este método es responsabilidad de Tarifa por lo cual lo MOCKEARé por ahora
        System.out.println("Total: " + carrera.getCosteEsperado() + "€");
    }

    
}

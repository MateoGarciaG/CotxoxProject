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
        assertEquals(10.2, this.carrera.getCosteEsperado(), 0);
        

        System.out.println("Visa: " + this.carrera.getTarjetaCredito());
        System.out.println("From: " + this.carrera.getOrigen());
		System.out.println("To: " + this.carrera.getDestino());
		System.out.println("Distance: " + this.carrera.getDistancia());
        // Este método es responsabilidad de Tarifa por lo cual lo MOCKEARé por ahora
        System.out.println("Total: " + this.carrera.getCosteEsperado() + "€");
    }

    @Test
    public void setDatosCarreraTest() {



        this.carrera.setOrigen("Manacor");
		this.carrera.setDestino("Magaluf");
		this.carrera.setDistancia(11.52);
		this.carrera.setTiempoEsperado(40);

        assertEquals("Manacor", this.carrera.getOrigen());
        assertEquals("Magaluf", this.carrera.getDestino());
        assertEquals(11.52, this.carrera.getDistancia(), 0);
        assertEquals(10.2, this.carrera.getCosteEsperado(), 0);
        

        System.out.println("Visa: " + this.carrera.getTarjetaCredito());
        System.out.println("From: " + this.carrera.getOrigen());
		System.out.println("To: " + this.carrera.getDestino());
		System.out.println("Distance: " + this.carrera.getDistancia());
        // Este método es responsabilidad de Tarifa por lo cual lo MOCKEARé por ahora
        System.out.println("Total: " + this.carrera.getCosteEsperado() + "€");
    }

    
}

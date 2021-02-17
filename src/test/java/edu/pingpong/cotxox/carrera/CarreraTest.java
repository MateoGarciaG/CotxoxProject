package edu.pingpong.cotxox.carrera;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {
    
    private Carrera carrera = null;

    @Before
    public void setupCarrera() {

        this.carrera =  new Carrera();
    }

    @Test
    public void constructor() {

        assertNotNull(this.carrera);
    }

}

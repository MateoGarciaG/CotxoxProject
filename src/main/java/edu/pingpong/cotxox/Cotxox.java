package edu.pingpong.cotxox;

/**
 * Hello world!
 *
 */
public class Cotxox 
{
    public static void main( String[] args )
    {
        / * 
		 * Configuración del usuario
		 * y de la Carrera. 
		 * /

		String tarjetaCredito =  " 4916119711304546 " ;
		String origen =  " Aeroport Son Sant Joan " ;
		String destino =  " Magaluf " ;
		doble distancia =  7,75 ;
		int tiempoEsperadoMinutos =  10 ;

		Carrera carrera =  nueva  Carrera (tarjetaCredito);
		carrera . setOrigen (origen);
		carrera . setDestino (destino);
		carrera . setDistancia (distancia);
		carrera . setTiempoEsperado (tiempoEsperadoMinutos);

		Sistema . fuera . println ( " \ n ##### "  +  " \ t Establecer recogida: \ t "  +  " ##### \ n " );

		Sistema . fuera . println ( " Visa: "  + carrera . getTarjetaCredito ());
		Sistema . fuera . println ( " Desde: "  + carrera . getOrigen ());
		Sistema . fuera . println ( " Para: "  + carrera . getDestino ());
		Sistema . fuera . println ( " Distancia: "  + carrera . getDistancia ());

		Sistema . fuera . println ( " \ n ##### "  +  " \ t Ver tu costo: \ t "  +  " ##### \ n " );

		Sistema . fuera . println ( " Visa: "  + carrera . getTarjetaCredito ());
		Sistema . fuera . println ( " Desde: "  + carrera . getOrigen ());
		Sistema . fuera . println ( " Para: "  + carrera . getDestino ());
		Sistema . fuera . println ( " Distancia: "  + carrera . getDistancia ());
		Sistema . fuera . println ( " Total: "  + carrera . getCosteEsperado () +  " € " );

		Sistema . fuera . println ( " \ n ##### "  +  " \ t Consigue un viaje: Conductor: \ t "  +  " ##### \ n " );

		/ **
		 * Necesitamos crear la flota de conductores de donde seleccionar uno
		 * para ofrecer el servicio.
		 * La flota es un objeto de tipo PoolConductores.
		 * /

		Lista < Conductor > poolConductores =  new  ArrayList < Conductor > ();
		Conductor conductor =  nulo ;

		// creamos objetos conductor y los metemos en el array

		String [] nombres = { " Samantha " , " Fox " , " Mola " };
		para ( String nombre : nombres) {
			conductor =  nuevo  Conductor (nombre);
			poolConductores . agregar (conductor);
		}

		String [] matricula = { " 4ABC123 " , " 5DHJ444 " , " 7JKK555 " };
		String [] modelos = { " Chevy Malibu " , " Toyota Prius " , " Mercedes A " };

		int índice =  0 ;
		para ( Conductor conductora : poolConductores) {
			conductora . setMatricula (matrícula [índice]);
			conductora . setModelo (modelos [índice]);
			// suponemos que las conductoras tienen una valoracion inicial de 4 estrellas
			conductora . setValoracion (( byte ) 4 );
			índice ++ ;
		}

		// Creamos el objeto flota de conductores, de la clase PoolConductores.

		PoolConductores conductores =  new  PoolConductores (poolConductores);

		/ * Seleccion del conductor en la flota y asignacion a la carrera * /

		carrera . asignarConductor (conductores);

		// Info por pantalla

		Sistema . fuera . println ( " Controlador: "  + carrera . getConductor () . getNombre ());
		Sistema . fuera . println ( " Tipo: "  + carrera . getConductor () . getModelo ());
		Sistema . fuera . println ( " Matricula: "  + carrera . getConductor () . getMatricula ());
		Sistema . fuera . println ( " Estrellas: "  + carrera . getConductor () . getValoracion ());
		Sistema . fuera . println ( " Desde: "  + carrera . getOrigen ());
		Sistema . fuera . println ( " Para: "  + carrera . getDestino ());
		booleano ocupado = carrera . getConductor () . isOcupado ();
		if (ocupado) {
			Sistema . fuera . println ( " Disponible para ti " );
		} más {
			Sistema . fuera . println ( " Esta conductora no esta disponible: / " );
		}
		// cancelar viaje
		// contactar por teléfono		

		Sistema . fuera . println ( " \ n ##### "  +  " \ t Pago y propina: \ t "  +  " ##### \ n " );

		carrera . realizarPago (carrera . getCosteEsperado ());
		carrera . recibirPropina ( 1 );
		carrera . liberarConductor ();

		Sistema . fuera . println ( " Controlador: "  + carrera . getConductor () . getNombre ());
		Sistema . fuera . println ( " SUGERENCIA: "  + carrera . getPropina ());
		Sistema . fuera . println ( " Visa: "  + carrera . getTarjetaCredito ());
		Sistema . fuera . println ( " Total: "  + carrera . getCosteTotal ());
		Sistema . fuera . println ( " ¿Ocupado ?: "  + carrera . getConductor () . isOcupado ());

		Sistema . fuera . println ( " \ n ##### "  +  " \ t Califica tu controlador: \ t "  +  " ##### \ n " );

		carrera . getConductor () . setValoracion (( byte ) 5 );

		Sistema . fuera . println ( " Controlador: "  + carrera . getConductor () . getNombre ());
		Sistema . fuera . println ( " Estrellas: "  + carrera . getConductor () . getValoracion ());
    }
}

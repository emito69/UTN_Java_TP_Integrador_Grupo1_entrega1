package org.UTNTP1.entrega1;

import org.UTNTP1.entrega1.Partido;
import org.UTNTP1.entrega1.Pronostico;
import org.UTNTP1.entrega1.Ronda;

public class App {

	public static void main(String[] args) {
		
		/* 
			
			A partir del esquema original propuesto, desarrollar un programa que lea un archivo de
			partidos y otro de resultados, el primero correspondiente a una ronda y el otro que contenga
			los pronósticos de una persona1. Cada ronda debe tener una cantidad fija de partidos, por
			ejemplo 2. 
			
			El programa debe:
			
		 		Tomar como argumento 2 rutas a cada archivo que se necesita
				Al leer las líneas de los archivos debe instanciar objetos de las clases propuestas
				Debe imprimir por pantalla el puntaje de la persona
		*/
		
		
		// Argumentos de entrada: 
		if(args.length == 2){
			//String rutaAbsoluta1 = "C:/Users/alvar/Documents/EclipseProjects/UTN_TP1/src/Entrega1/archivos/resultados.csv";
			//String rutaAbsoluta2 = "C:/Users/alvar/Documents/EclipseProjects/UTN_TP1/src/Entrega1/archivos/pronostico.csv";
			
			String rutaAbsoluta1 = args[0];
			String rutaAbsoluta2 = args[1];
			
			// 1- ARMAR LA RONDA A PARTIR DEL PATH A LA UBICACIÓN DEL ARCHIVO resultados.csv 
			
			Ronda ronda1 = new Ronda("1", rutaAbsoluta1);
				
			Partido[] partidos = new Partido[2]; // para almacenar los partidos en forma individual
			
			partidos = ronda1.damenPartidos();
			Partido partido1 = partidos[0];
			Partido partido2 = partidos[1];
				
			//System.out.println("El Id del partido 2 es: " + partido2.dameIdPartido());
			//System.out.println("El Equipo1 del partido 2 es: " + partido2.dameEquipo1().dameNombreEquipo());
			//System.out.println("El Id del Equipo1 del partido 2 es: " + partido2.dameEquipo1().dameIdEquipo());
			//System.out.println("El resultado del equipo consultado es: " + partido2.dameResultado(partido2.dameEquipo1()));
			
			
			// 2- ARMAR EL PRONÓSTICO A PARTIR DEL PATH A LA UBICACIÓN DEL ARCHIVO pronostico.csv 	
			
			Pronostico pronostico1 = new Pronostico(ronda1, partido1, partido1.dameEquipo2(), rutaAbsoluta2);
			Pronostico pronostico2 = new Pronostico(ronda1, partido2, partido2.dameEquipo2(), rutaAbsoluta2);
			
			// es indistindo si por cada partido pido el pronóstico por el equipo1 o el equipo2 de ese partido
			// ya que los resultados son equivalentes
			
			System.out.println("El total de Puntos es: " + (pronostico1.puntos() + pronostico2.puntos()) +  " pts.");

		
			
			
			
			// PRUEBAS DE IMPRESION -- BORRAR --
			/* 
			Equipo equipo1 = new Equipo("Boca Juniors", "Primera A");

			System.out.println(equipo1.dameNombreEquipo());
			System.out.println(equipo1.dameDescEquipo());
			System.out.println(equipo1.dameIdEquipo());
		
			
			Equipo equipo2 = new Equipo("Gimnasia y Esgrima de La Plata", "Primera A");

			System.out.println(equipo2.dameNombreEquipo());
			System.out.println(equipo2.dameDescEquipo());
			System.out.println(equipo2.dameIdEquipo());

			Equipo equipo3 = new Equipo("River Plate", "Primera A");

			System.out.println(equipo2.dameNombreEquipo());
			System.out.println(equipo2.dameDescEquipo());
			System.out.println(equipo2.dameIdEquipo());
			
			
			Partido partido1 = new Partido(equipo1, equipo2, 3, 4);
			System.out.println("El Id del partido es: " + partido1.dameIdPartido());
			System.out.println("El resultado del equipo consultado es: " + partido1.dameResultado(equipo1));
			*/
			}
		
		if(args.length > 2){
			System.out.println("Demasiados parámetros.");

			System.exit(1);
		}else if(args.length < 2){
			System.out.println("Faltan parámetros.");
			System.exit(1);
		}
		
		
		
		
	}

}
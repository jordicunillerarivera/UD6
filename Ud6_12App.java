import java.util.Random;

import javax.swing.JOptionPane;

public class Ud6_12App {

	public static void main(String[] args) {
		
		int array[] = crearArray();
		mostrarArray(array);
		System.out.println("---------------------------------");
		buscarNumero(array);

	}
	
		// Metodo para crear y rellenar una array con numero random
	public static int[] crearArray() {
		
		int array[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo del vector"))];
		Random rnd = new Random();	// Creamos un objeto Random() para que nos genere numeros aleatorios al llamarlo
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = 1 + rnd.nextInt(300);	// Usamos el objeto Random() para crear numeros aleatorios
			
		}
		
		return array;
	
	}
	
		// Metodo para buscar numeros y crear una nueva array con ellos
	public static void buscarNumero(int array[]) {
		
		int numeroABuscar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ultimo numero a buscar"));
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {		
			if (array[i] % 10 == numeroABuscar) {		// Si el residuo de un numero al dividirlo por 10 coincide con el que buscamos, sumara 1 al contador
				contador++;
			}
		}
		
		int arrayNumero[] = new int[contador]; 		// Se creara una array con el tamaño del contador
		contador = 0;								// y este se resetea para un nuevo uso
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == numeroABuscar) {		// Si el residuo de un numero al dividirlo por 10 coincide con el que buscamos, 
				arrayNumero[contador] = array[i];		// se añadira a la nueva array, teniendo al contador como posicion
				contador++;								// y este se sumara uno a si mismo
			}
		}
		
		mostrarArray(arrayNumero);
		
	}
	
		// Metodo para leer arrays
	public static void mostrarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + (i+1) + ": " + array[i]);
		}
		
	}
			
}
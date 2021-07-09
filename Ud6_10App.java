import java.util.Random;

import javax.swing.JOptionPane;

public class Ud6_10App {

	public static void main(String[] args) {
		
		int largo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo del vector"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango minimo"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango maximo"));
		
		int array[] = crearArray(largo, min, max);
		leerArray(array);
		
	}
	
		// Metodo para crear y rellenar una array con numero random
	public static int[] crearArray(int largo, int min, int max) {
		
		int array[] = new int[largo];
		Random rnd = new Random();	// Creamos un objeto Random() para que nos genere numeros aleatorios al llamarlo
		
		for (int i = 0; i < array.length; i++) {
			
			int aux = min + rnd.nextInt(max);	// Usamos el objeto Random() para crear numeros aleatorios
			
			if (esPrimo(aux)) {
				array[i] = aux;
			} else {
				i--;
			}
			
		}
		
		return array;
		
	}
	
		// Metodo para leer y sumar los digitos de una array
	public static void leerArray(int array[]) {
		
		int suma = 0;
		int mayor = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + (i+1) + ": " + array[i]);
			suma += array[i];
				
			if (array[i] > mayor) {		// Si el numero actual es mayor que el anterior numero mas grande, el primero lo sustituira, 
				mayor = array[i];		// asi cuando termine el bucle quedara guardado el mayor numero dentro de este
			}
		}
		
		System.out.println("El numero guardado mas grande es " + mayor);
		
		
	}
	
	public static boolean esPrimo(int numero) {
		
		int contador = 2;
		boolean primo=true;

		while ((primo) && (contador != numero)){ 	// Divide el numero por todos los numeros entre el 2 y el mismo, 
		  if (numero % contador == 0) {			// si en alguna de estas divisiones sale de residuo 0, no sera primo y el booleano se quedara en false
		    primo = false;
		  }
		  contador++;
		}
		
		return primo;
	}

}

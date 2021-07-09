import java.util.Random;

import javax.swing.JOptionPane;

public class Ud6_09App {

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
			array[i] = min + rnd.nextInt(max);	// Usamos el objeto Random() para crear numeros aleatorios
		}
		
		return array;
		
	}
	
		// Metodo para leer y sumar los digitos de una array
	public static void leerArray(int array[]) {
		
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + (i+1) + ": " + array[i]);
			suma += array[i];
		}
		
		System.out.println("La suma total es de " + suma);
	}

}

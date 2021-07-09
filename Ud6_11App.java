import java.util.Random;

import javax.swing.JOptionPane;

public class Ud6_11App {

	public static void main(String[] args) {
		
		int array1[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo de los arrays"))];
		int array2[] = new int[array1.length];
		int array3[] = new int[array1.length];
		
		array1 = agregarValoresArray(array1);
		array2 = array1;
		array2 = new int[array1.length];
		array2 = agregarValoresArray(array2);
		array3 = multiplicarArrays(array1, array2);
		
		System.out.println("Array 1:");
		mostrarArray(array1);
		System.out.println("\n------------------------------\nArray 2:");
		mostrarArray(array2);
		System.out.println("\n------------------------------\nArray 3:");
		mostrarArray(array3);
		

	}
	
		// Metodo para crear y rellenar una array con numero random
	public static int[] agregarValoresArray(int array[]) {
		
		Random rnd = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = 1 + rnd.nextInt(10);	// Usamos el objeto Random() para crear numeros aleatorios
			
		}
		
		return array;
		
	}
	
		// Metodo para multiplicar los valores del array1 y el array2
	public static int[] multiplicarArrays(int array1[], int array2[]) {
		
		int arrayFinal[] = new int[array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			
			arrayFinal[i] = array1[i] * array2[i];
			
		}
		
		return arrayFinal;
		
	}
	
		// Metodo para mostrar un array
	public static void mostrarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + (i+1) + ": " + array[i]);
		}
		
	}

}

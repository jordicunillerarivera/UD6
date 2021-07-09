import javax.swing.JOptionPane;

public class Ud6_08App {

	public static void main(String[] args) {
		
		int array[] = rellenarArray();
		mostrarArray(array);
		

	}
	
		// Metodo para crear y rellenar el array
	public static int[] rellenarArray() {
		
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para la posicion " + (i+1)));
		}
		
		return array;
		
	}
	
		// Metodo para mostrar el array
	public static void mostrarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + (i+1) + ": " + array[i]);
		}
		
	}

}

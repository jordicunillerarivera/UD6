import javax.swing.JOptionPane;

public class Ud6_04App {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		System.out.println("El factorial de " + numero + " es " + factorial(numero));

	}
	
		// Calculamos el factor del numero y lo devolvemos
	public static int factorial(int numero) {
		
		int factorial = 1;
		
		while (numero != 0) {
			  factorial = factorial * numero;
			  numero--;
		}
		
		return factorial;
	}

}

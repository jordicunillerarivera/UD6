import javax.swing.JOptionPane;

public class Ud6_03App {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		// Si es true, entrara en el if, si no lo es entrara en el else
		if (esPrimo(numero)) {
			System.out.println("El numero introducido es primo");
		} else {
			System.out.println("El numero introducido no es primo");
		}
		
	}
	
		// Metodo para comprobar si es un numero primo
	public static boolean esPrimo(int numero) {
		
		int contador = 2;
		boolean primo=true;

		while ((primo) && (contador!=numero)){ 	// Divide el numero por todos los numeros entre el 2 y el mismo, 
		  if (numero % contador == 0)			// si en alguna de estas divisiones sale de residuo 0, no sera primo y el booleano se quedara en false
		    primo = false;
		  contador++;
		}
		
		return primo;
	}

}

import javax.swing.JOptionPane;

public class Ud6_06App {

	public static void main(String[] args) {
		
		int numero = comprobarNumero();
		System.out.println("El numero introducido tiene " + numeroCifras(numero) + " digitos");

	}
	
		// Metodo para comprobar que el numero introducido es superior a 0
	public static int comprobarNumero() {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero superior a 0"));
		
		if (numero > 0) {
			return numero;
		} else {
			comprobarNumero();	// Si la condicion no se cumple, se repite el metodo hasta que lo haga
			return 0;			// El codigo nunca llegara a esta linea, pero se debe poner un return en todas las condiciones
		}
		
	}
	
		// Metodo para contar las cifras de un numero
	public static int numeroCifras(int numero) {
		
		int cont = 0;
		
		while(numero != 0) {
			numero = numero / 10;	// Va dividiendo entre 10 hasta que el numero es 0
			cont++;					// Por cada division, se suma 1 al contador, por lo que este sera quien nos diga el numero totales de cifras
		}
		
		return cont;
	}

}

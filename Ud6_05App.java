import javax.swing.JOptionPane;

public class Ud6_05App {

	public static void main(String[] args){
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a convertir"));
		System.out.println("El binario de " + numero + " es " + decimalABinario(numero));
		
	}
	
		// Metodo para calcular el binario de un numero
	public static int decimalABinario(int numero) {
		int exp = 0;
		int digito;
		double binario = 0;
		
		while(numero != 0) {
			digito = numero % 2;
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			numero = numero / 2;
		}
		
		return (int)binario;
	}

}

import javax.swing.JOptionPane;

public class Ud6_02App {

	public static void main(String[] args) {
		
		int numMin = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero minimo"));
		int numMax = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero maximo"));
		System.out.println("Numero aleatorio entre " + numMin + " y " + numMax + " es " + aleatorio(numMin, numMax));

	}
	
	// Metodo para generar un numero aleatorio a partir de un numero minimo y maximo
	public static int aleatorio(int numMin, int numMax) {
		return (int)Math.floor(Math.random()*(numMin-numMax+1)+numMax);
	}

}

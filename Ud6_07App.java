import javax.swing.JOptionPane;

public class Ud6_07App {

	public static void main(String[] args) {
		
		double euros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad en euros"));
		String divisa = JOptionPane.showInputDialog("Introduce la divisa a convertir");
		cambioDivisa(euros, divisa);

	}
	
		// Metodo para hacer el calculo de cambio de divisa
	public static void cambioDivisa(double euros, String divisa) {
		
		divisa = divisa.toLowerCase();	// Pasamos el String a minusculas para evitar errores
		
		switch (divisa) {
			case "dolares":
				System.out.println("El cambio de " + euros + "€ a Dolares son " + (euros * 1.28611) + "$");
				break;
			case "yenes":
				System.out.println("El cambio de " + euros + "€ a Yenes son ¥" + (euros * 129.852));
				break;
			case "libras":
				System.out.println("El cambio de " + euros + "€ a Libras son £" + (euros * 0.86));
				break;
	
			default:
				break;
		}
		
	}

}

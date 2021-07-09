import javax.swing.JOptionPane;

public class Ud6_01App {

	public static void main(String[] args) {
		
		// Calcular y mostrar el area de un circulo
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo"));
		System.out.println("El area del circulo es de " + areaCirculo(radio));
		
		// Calcular y mostrar el area de un triangulo
		double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
		System.out.println("El area del triangulo es de " + areaTriangulo(base, altura));
		
		// Calcular y mostrar el area de un cuadrado
		double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		System.out.println("El area del cuadrado es de " + areaCuadrado(lado));
		
	}
	
		// Metodos calculo de areas
	
	// Metodo que calcula el area de un ciruclo
	public static double areaCirculo(double radio) {
		return (Math.pow(radio, 2) * Math.PI);
	}
	
	// Metodo que calcula el area de un triangulo
	public static double areaTriangulo(double base, double altura) {
		return ((base * altura) / 2);
	}
	
	// Metodo que calcula el area de un cuadrado
	public static double areaCuadrado(double lado) {
		return (lado * lado);
	}

}

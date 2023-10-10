package ejercicioMetodosYArraysEj1;
import javax.swing.JOptionPane;
import java.lang.Math;

public class ejercicioMetodosYArraysEj1App {

	public static void main(String[] args) {
		String texto_figura = JOptionPane.showInputDialog("Introduce figura quieres que calculemos el area: CIRCULO(1), CUADRADO(2), TRIANGULO(3) ");
		double resultado = 0;
		
		
		switch(texto_figura) {
		case "CIRCULO":
		case "circulo":
		case "Circulo":
		case "1":
			String texto_radioCirculo = JOptionPane.showInputDialog("Introduce el radio del circulo ");
			int radioCirculo = Integer.parseInt(texto_radioCirculo);
			resultado = Math.pow(radioCirculo, 2);
			resultado = Math.PI*resultado;
			JOptionPane.showMessageDialog(null,"El area del circulo introducido es " +resultado);
			
			break;
		case "CUADRADO":
		case "cuadrado":
		case "Cuadrado":
		case "2":
			String texto_baseCuadrado = JOptionPane.showInputDialog("Introduce la base del quadrado ");
			String texto_alturaCuadrado = JOptionPane.showInputDialog("Introduce la altura del quadrado ");
			int baseCuadrado = Integer.parseInt(texto_baseCuadrado);
			int alturaCuadrado = Integer.parseInt(texto_alturaCuadrado);
			
			resultado = (baseCuadrado*alturaCuadrado)/2;
			
			JOptionPane.showMessageDialog(null,"El area del quadrado introducido es " +resultado);
			break;
		case "TRIANGULO":
		case "triangulo":
		case "Triangulo":
		case "3":
			String texto_ladoTriangulo = JOptionPane.showInputDialog("Introduce el lado del triangulo ");
			int ladoTriangulo = Integer.parseInt(texto_ladoTriangulo);
			resultado = ladoTriangulo*ladoTriangulo;
			
			JOptionPane.showMessageDialog(null,"El area del triangulo introducido es " +resultado);
			break;
			default:
				JOptionPane.showMessageDialog(null,"La figura introducida no es correcto, pruebe otra vez");
			
		}
			
		
	}

}

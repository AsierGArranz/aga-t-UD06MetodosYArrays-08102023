package ejercicioMetodosYArraysEj5;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj5App {

	public static void main(String[] args) {
		
		String texto_primerNumero = JOptionPane.showInputDialog("Introduce el numero que vamos a convertir en binario ");
		int numDecimal = Integer.parseInt(texto_primerNumero);
		String binario = Integer.toBinaryString(numDecimal);
		JOptionPane.showMessageDialog(null,"Numero Binario: "+binario);
	}

}

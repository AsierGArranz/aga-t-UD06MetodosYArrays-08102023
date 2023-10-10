package ejercicioMetodosYArraysEj6;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj6App {

	public static void main(String[] args) {
		int contador= 0;
		String texto_primerNumero = JOptionPane.showInputDialog("Introduce el numero ");
		int numDecimal = Integer.parseInt(texto_primerNumero);
		
		if(numDecimal==0) {
			contador= 1;
		}else {
			for(int i = Math.abs(numDecimal); i>0; i/=10) {
				contador++;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Numero "+numDecimal+" tiene "+contador+" digitos");

	}

}

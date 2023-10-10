package ejercicioMetodosYArraysEj3;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj3App {

	public static void main(String[] args) {

		int contador = 0;
		String texto_numPrimo = JOptionPane.showInputDialog("Introduce un numero para saber si es un numero primo ");
		int numPrimo = Integer.parseInt(texto_numPrimo);
		
			for(int i= 1; i<=numPrimo; i++) {
				if(numPrimo%i==0) {
					contador++;
				}
			}
		
		if(contador <=2) {
			JOptionPane.showMessageDialog(null,"El numero introducido es primo");
		}else{
			JOptionPane.showMessageDialog(null,"El numero introducido NO es primo");
		}

	}

}

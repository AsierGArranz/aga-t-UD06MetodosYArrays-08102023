package ejercicioMetodosYArraysEj4;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj4App {

	public static void main(String[] args) {
		
		//int contador = 0;
		//iba a crear una array para guardarlos por si luego tenia que pasarlos en algun momento, me di cuenta de que no era necesario y los comente
		int resultado = 1;
		
		String texto_primerNumero = JOptionPane.showInputDialog("Introduce el numero para calcular el factorial ");
		int numUno = Integer.parseInt(texto_primerNumero);
		
		//int num[]= new int[numUno];
		
		for(int i =numUno; i > 0; i--) {
			//num[contador]=i;//
			//contador++
			resultado = resultado*i;
			
		}
		JOptionPane.showMessageDialog(null,"El factorial es "+resultado);
		
	}

}

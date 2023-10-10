package ejercicioMetodosYArraysEj9;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj9App {

	public static void main(String[] args) {
		int contador = 0;
		int randomNum;
		double randomContadorFinal = 0;
		
		String texto_primerNumero = JOptionPane.showInputDialog("Introduce el tamaño del Array ");
		int numArray = Integer.parseInt(texto_primerNumero);
		
		double num[]= new double[numArray];
		
		for(double i = numArray;i >0; i--) {
			randomNum = (int)(Math.random()*10);
			num[contador]=randomNum;
			System.out.println(num[contador]);
			contador++;
			randomContadorFinal +=randomNum;
			
		}
		JOptionPane.showMessageDialog(null,"La suma total es "+randomContadorFinal);
	}

}

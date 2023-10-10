package ejercicioMetodosYArraysEj8;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj8App {

	public static void main(String[] args) {
		
		int num[]= new int[10];
		int contador = 1;
		int valorFinal =0;
		
		for(int i=0; i<10; i++) {
			String texto_primerNumero = JOptionPane.showInputDialog("Introduce el  "+contador+"º de la array :");
			int numArray = Integer.parseInt(texto_primerNumero);
			num[i]=numArray;
			System.out.println(num[i]);
			valorFinal += numArray;
			contador++;
		}
		JOptionPane.showMessageDialog(null,"La suma total es "+valorFinal);
	}

}

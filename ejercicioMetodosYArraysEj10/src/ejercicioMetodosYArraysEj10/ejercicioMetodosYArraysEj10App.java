package ejercicioMetodosYArraysEj10;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj10App {

	public static void main(String[] args) {
		int contador = 0;
		int contadorPrimo = 0;
		double mayorQue= 0;
		int numeroRandom=0;
		
		String texto_primerNumero = JOptionPane.showInputDialog("Introduce el tamaño del Array ");
		int numArray = Integer.parseInt(texto_primerNumero);
		
		String texto_segundoNumero = JOptionPane.showInputDialog("Introduce el primer numero ");
		int numPrimoUno = Integer.parseInt(texto_segundoNumero);
		
		String texto_tercerNumero = JOptionPane.showInputDialog("Introduce el segundo numero ");
		int numPrimoDos = Integer.parseInt(texto_tercerNumero);
		
		double num[]= new double[numArray];
			
			
			if(numPrimoUno<numPrimoDos) {
				while(contador<=numArray) {
					numeroRandom = (int)(Math.floor(Math.random()*numPrimoDos-numPrimoUno+1)+numPrimoUno);
					
					for(int i= 1; i<=numeroRandom; i++) {
						if(numeroRandom%i==0) {
							contadorPrimo++;
						}
					}
					if(contadorPrimo <= 2) {
						if(numeroRandom<numPrimoUno || numeroRandom >numPrimoDos) {
							//no me vale esta fuera de los 2 parametros
						}else {
							num[contador]=numeroRandom;
							if(numeroRandom >mayorQue) {
								mayorQue = numeroRandom;
							}
							
							System.out.println(numeroRandom);
							contador++;
						}
					}else {
						
					}
					
				}
				
			}
			JOptionPane.showMessageDialog(null,"El numero primo mas grande generado es "+mayorQue);
	}
}

package ejerciciosetodosYArraysEj12;

import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class ejerciciosetodosYArraysEj12App {

	public static void main(String[] args) {
		int randomNum = 0;
		
		String texto_tamañoArray = JOptionPane.showInputDialog("Inserta el tamaño del Array ");
		int tamañoArray = Integer.parseInt(texto_tamañoArray);
		
		int[] primerArray = new int[tamañoArray];
		int[] segundoArray = primerArray;
		
		String texto_numeroBuscar = JOptionPane.showInputDialog("Inserta el numero que quieres buscar ");
		int numeroBuscar = Integer.parseInt(texto_numeroBuscar);
		switch(numeroBuscar) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			randomNumsArray(primerArray,randomNum);
			segundoArray = buscarNumero(primerArray, numeroBuscar);
			
			pintarPorPantalla(segundoArray);
			
			break;
			default:
				JOptionPane.showMessageDialog(null,"El numero introducido no es valido, porfavor añada un solo digito");
		}
		
		

	}
	
	//funcion para añadir numeros aleatorios a la array segun su tamaño
		private static void randomNumsArray(int[] array, int random) {
			for(int i = 0; i<array.length; i++) {
				random = (int)(Math.random()*300+1);
				array[i] = random;
			}
		}
		
	//funcion para buscar los numeros que nos piden
		private static int[] buscarNumero(int[] array, int numeroBuscar) {
			//encontrado esta funcion por internet pero no entiendo como funciona la verdad
			return IntStream.of(array).filter(numero -> numero % 10 == numeroBuscar).toArray();
			
		}
		
	//funcion para pintar por pantalla
	private static void pintarPorPantalla(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

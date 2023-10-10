package ejercicioMetodosYaArraysEj11;

import javax.swing.JOptionPane;

public class ejercicioMetodosYaArraysEj11App {

	public static void main(String[] args) {
		int randomNum = 0;
		
		String texto_tamañoArray = JOptionPane.showInputDialog("Inserta el tamaño del Array ");
		int tamañoArray = Integer.parseInt(texto_tamañoArray);
		
    	int[] primerArray = new int[tamañoArray];
    	int[] segundoArray = primerArray;
    	int[] tercerArray = new int[tamañoArray];
    	
    	randomNumsArray(primerArray, randomNum);
    	
    	multiplicarArray(primerArray,segundoArray,tercerArray);
    	
    	System.out.println("En el primer array estan los numeros: ");
    	pintarPorPantalla(primerArray);
    	System.out.println("En el segundo array estan los numeros: ");
    	pintarPorPantalla(segundoArray);
    	System.out.println("El resultado de las multiplicaciones es: ");
    	pintarPorPantalla(tercerArray);
    	

	}
	
	//funcion para añadir numeros aleatorios a la array segun su tamaño
	private static void randomNumsArray(int[] array, int random) {
		for(int i = 0; i<array.length; i++) {
			random = (int)(Math.random()*10);
			array[i] = random;
		}
	}
	
	//funcion para guardar el resultado de la multiplicacion en otro array del mismo tamaño
	private static void multiplicarArray(int[] array1, int[] array2, int[] array3) {
		
		for(int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		
	}
	
	//funcion para pintar por pantalla
	private static void pintarPorPantalla(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	


}

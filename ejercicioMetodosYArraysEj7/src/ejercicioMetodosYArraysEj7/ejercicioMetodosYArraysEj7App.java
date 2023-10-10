package ejercicioMetodosYArraysEj7;

import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj7App {

	public static void main(String[] args) {
		
		double cambioMoneda = 0;
		
		final double CALCULO_LIBRAS = 0.86;
		final double CALCULO_DOLARES = 1.28611;
		final double CALCULO_YENES = 129.852;
		
		String texto_primerNumero = JOptionPane.showInputDialog("Introduce cuantos euros tienes ");
		double numEur = Integer.parseInt(texto_primerNumero);
		
		String texto_cambioMoneda = JOptionPane.showInputDialog("Introduce a que moneda quieres cambiar: LIBRAS(1) | DOLARES(2) | YENES(3) ");
		
		switch(texto_cambioMoneda) {
		case "LIBRAS":
		case "Libras":
		case "libras":
		case "1":
			cambioMoneda =numEur*CALCULO_DOLARES;
			
			JOptionPane.showMessageDialog(null, numEur+" euros en libras son "+cambioMoneda+" libras");
			break;
		case "DOLARES":
		case "Dolares":
		case "dolares":
		case "2":
			cambioMoneda =numEur*CALCULO_LIBRAS;
			
			JOptionPane.showMessageDialog(null, numEur+" euros en dolares son "+cambioMoneda+" dolares");
			break;
		case "YENES":
		case "Yenes":
		case "yenes":
		case "3":
			cambioMoneda =numEur*CALCULO_YENES;
			
			JOptionPane.showMessageDialog(null, numEur+" euros en yenes son "+cambioMoneda +" yenes");
			break;
		default:
			JOptionPane.showMessageDialog(null,"La moneda "+texto_cambioMoneda+" no es valida, prueba otra vez");
		}

	}

}

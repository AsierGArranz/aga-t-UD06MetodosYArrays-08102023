package ejercicioMetodosYArraysEj2;		
import javax.swing.JOptionPane;

public class ejercicioMetodosYArraysEj2App {

	public static void main(String[] args) {
			int numeroRandom = 0;
			int bucle = 0;
			
			String texto_primerNumero = JOptionPane.showInputDialog("Introduce el primer numero ");
			int numUno = Integer.parseInt(texto_primerNumero);
			String texto_segundoNumero = JOptionPane.showInputDialog("Introduce el segundo numero ");
			int numDos = Integer.parseInt(texto_segundoNumero);
			
			if(numUno<numDos) {
				while(bucle<=numDos) {
					numeroRandom = (int)(Math.floor(Math.random()*numDos-numUno+1)+numUno);
					if(numeroRandom<numUno || numeroRandom >numDos) {
						
					}else {
						System.out.println(numeroRandom);
						bucle++;
					}
					
				}
			}else {
				JOptionPane.showMessageDialog(null,"El primer numero introducido tiene que ser mas grande que el segundo, pruebe otra vez");
			}
						
		}


	}


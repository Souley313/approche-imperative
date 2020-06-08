/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Souleymane THIAM
 * 
 * un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 :
	- Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.
	- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
 * 
 *
 */
public class InteractifTantQue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb = -1;

		try (Scanner scanner = new Scanner(System.in)) {
			while (nb > 10 || nb < 1) {
			    System.out.println("Veuillez saisir un nombre compris entre 1 et 10 :");
			    nb = scanner.nextInt();

			}
		}
		
	    System.out.println("La nombre que vous avez saisi est " +nb );

		}
	}

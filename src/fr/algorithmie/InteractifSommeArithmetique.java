/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Souleymane THIAM
 * 
 * Un programme qui demande un nombre à l’utilisateur puis calcule 
 * la somme de tous les entiers compris entre 1 et ce nombre
 *
 */
public class InteractifSommeArithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb=1;
		int som=0;
		
        System.out.println("Veuillez saisir un nombre :");
	    try (Scanner scanner = new Scanner(System.in)) {
			nb = scanner.nextInt();
		}
	    System.out.println("la somme de tous les entiers compris entre 1 et "+nb+" est: ");
	    for(int i=1; i<=nb; i++) {
	    	som+=i;
	    }
	    System.out.println(som);
	}

}

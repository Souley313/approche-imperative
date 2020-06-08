/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Souleymane THIAM
 * 
 * Un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants.
 * 
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * @param args
	 * 
	 * un programme qui demande un nombre à l’utilisateur puis qui
	 *  affiche les 10 nombres suivants
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb=1;
		
        System.out.println("Veuillez saisir un nombre :");
	    try (Scanner scanner = new Scanner(System.in)) {
			nb = scanner.nextInt();
		}
	    System.out.println("les 10 prochains nombres de "+nb+" sont");
	    for(int i=1; i<=10; i++) {
	    	System.out.println(nb + i);
	    }

	}

}

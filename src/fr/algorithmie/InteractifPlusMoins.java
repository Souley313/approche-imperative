/**
 * 
 */
package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Souleymane THIAM
 * 
 * un jeu qui :
	- choisit un nombre al�atoire entre 1 et 100
	- puis demande � l�utilisateur de trouver ce nombre en lui indiquant 
		s�il est au-dessus ou en dessous du nombre,
	- Lorsque l�utilisateur a trouv� le nombre, le programme affiche 
		� Bravo, vous avez trouv� en N coups � o� N repr�sente le nombre d�essais 
		effect� par l�utilisateur
	- le programme se termine.

 *
 */
public class InteractifPlusMoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//G�n�ration du nombre al�atoire entre 1 et 100
		int r, choix = 0, cpt=0;
		Random random = new Random();
		r = random.nextInt(100);
		
        System.out.println("L'ordinateur a g�n�r� un nombre aleatoire entre 1 et 1OO, veuillez trouver ce nombre :");
	    
        try (Scanner scanner = new Scanner(System.in)) {
			while(choix!=r){
				cpt++;
				choix = scanner.nextInt();
				if (choix > r){
					System.out.println("Vous etes en dessous du nombre");
				}else if (choix < r){
					System.out.println("Vous etes en dessus du nombre");
				}
			}
		}
	    System.out.println("Bravo, vous avez trouv� en " +cpt + " coups!");
	  }
	}

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
	- choisit un nombre aléatoire entre 1 et 100
	- puis demande à l’utilisateur de trouver ce nombre en lui indiquant 
		s’il est au-dessus ou en dessous du nombre,
	- Lorsque l’utilisateur a trouvé le nombre, le programme affiche 
		« Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais 
		effecté par l’utilisateur
	- le programme se termine.

 *
 */
public class InteractifPlusMoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Génération du nombre aléatoire entre 1 et 100
		int r, choix = 0, cpt=0;
		Random random = new Random();
		r = random.nextInt(100);
		
        System.out.println("L'ordinateur a généré un nombre aleatoire entre 1 et 1OO, veuillez trouver ce nombre :");
	    
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
	    System.out.println("Bravo, vous avez trouvé en " +cpt + " coups!");
	  }
	}

/**
 * 
 */
package fr.boucles;

/**
 * @author Souleymane THIAM
 * 
 * Classe permettant de manipuler des tableaux d'entiers
 *
 */
public class ExerciceTableauEntier {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		//D�claration d'un tableau d�entiers contenant tous les entiers de 1 � 10
				int tab[]= {1,2,3,4,5,6,7,8,9,10};
				
				//Affichage du premier �l�ment du tableau
				System.out.println("Premier �l�ment du tableau est " + tab[0]);
				
				//Affichage de la longueur du tableau en utilisant la propri�t� length
				System.out.println("La longueur du tableau est " + tab.length);
				
				//Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
				System.out.println("Le dernier �l�ment du tableau est " + tab[tab.length-1]);
				
				//Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8
				for(int i=0; i<=tab.length; i++) {
					tab[7]=8;
				}
				System.out.println("La nouvelle valeur de l'�l�ment d'index 4: " + tab[7]);
				
	}

}

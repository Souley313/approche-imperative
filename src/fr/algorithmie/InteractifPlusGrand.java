/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Souleymane THIAM
 *
 *Un programme qui demande 10 nombres à un utilisateur
 * et qui affiche le plus grand de ces nombres
 *
 */
public class InteractifPlusGrand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb, maxVal=0;
		System.out.println("Veuillez saisir 10 nombres :");
		try (Scanner scanner = new Scanner(System.in)) {
			int i=1;
			while( i<=10) {
				i++;
				nb = scanner.nextInt();
				if(nb > maxVal) {
					maxVal = nb;
			    }
			}
		}
		System.out.print("\nLe plus grand de ces nombres = "+maxVal);
			
		}
	   
	}

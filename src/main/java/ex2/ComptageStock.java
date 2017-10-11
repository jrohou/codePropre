package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Class creates a 'comptage' of stocks
 * Checks calcul's type
 * Changes format date
 * Prints result
 * @author ETY2
 *
 */

public class ComptageStock {

	private int nb;
	private int resultat;
	private Date dateDebutComptage;
	private String dateFinComptage;
	private String type;

	public void ajouterElement(int montant) {
		nb++;
		resultat += montant;
	}

	public void afficheStatutComptage() {

		compareType();
		dateDebutFinComptage();
	}

	/** Changes format date
	 * 
	 */
	private void dateDebutFinComptage() {
		if (dateDebutComptage != null) {
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println(f.format(dateDebutComptage));
		}

		if (dateFinComptage != null) {
			System.out.println("Le comptage est clos depuis le " + dateFinComptage);
			if (nb == 0) {
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			} else {
				System.out.println("Le comptage est clos et est OK.");
			}
		} else {
			System.out.println("Le compte est actif.");
		}
	}

	/** Compares type between 'SOMME' and 'MOYENNE' to print the result
	 * 
	 */
	private void compareType() {
		if (type != null && type.equals("SOM")) {
			System.out.println("Ce comptage est de type SOMME");
			System.out.println("Nombre d'élements " + nb);

			System.out.println("Résultat " + resultat);
		} else if (type != null && type.equals("MOY")) {
			System.out.println("Ce compte est de type MOYENNE");
			System.out.println("Nombre d'élements " + nb);

			System.out.println("Résultat " + resultat / nb);
		}
	}

	/** Changes the format of a date
	 * @return a new format date
	 */
	public Date getDateFinComptage() {
		SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if (dateFinComptage != null) {
			try {
				return ff.parse(dateFinComptage);
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
}

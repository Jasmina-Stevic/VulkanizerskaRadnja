
package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa koja predstavlja vulkanizersku radnju.
 * 
 * @author Jasmina Stevic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma koja sadrzi objekte klase AutoGuma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda koja dodaje novu gumu u listu
	 * 
	 * @param a
	 *            prestavlja novu gumu u listi
	 * @throws java.lang.NullPointerException
	 *             ako je prosledjeni objekat null
	 * @throws java.lang.RuntimeException
	 *             ako takva guma vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");

		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");

		gume.addFirst(a);
	}

	/**
	 * Metoda koja pronalazi trazenu gumu po nazivu marke i modela u listi svih guma
	 * 
	 * @param markaModel
	 *            naziv marke i modela gume kao String
	 * @return nova lista sa gumama trazene marke i modela,ako takve postoje u listi
	 * @return null ako ne postoji guma trazene marke i modela u listi
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel)) //nedostajalo je .getMarkaModel
				novaLista.add(gume.get(i));
		return novaLista;
	}
}

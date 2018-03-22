package gume;

/**
 * Klasa koja predstavlja auto gumu u paketu gume
 * 
 * @author Jasmina Stevic
 * @version 1.0
 *
 */
public class AutoGuma {
	/**
	 * Marka i model auto gume
	 */
	private String markaModel = null;
	/**
	 * Precnik auto gume
	 */
	private int precnik = 0;
	/**
	 * Sirina auto gume
	 */
	private int sirina = 0;
	/**
	 * Visina auto gume
	 */
	private int visina = 0;

	/**
	 * Vraca vrednost atributa markaModel
	 * 
	 * @return marku i model auto gume kao jedan String
	 *
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja vrednost atributa markaModel
	 * 
	 * @param markaModel
	 *            nova String vrednost za marku i model auto gume
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je
	 * 
	 *             unet
	 *             <ul>
	 *             <li>null String</li>
	 *             <li>ako je duzina unetog stringa manja od 3 karaktera</li>
	 * 
	 *             </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa precnik.
	 * 
	 * @return precnik auto gume kao integer
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost za precnik auto gume
	 * 
	 * @param precnik
	 *            nova integer vrednost za precnik auto gume
	 * 
	 * @throws java.lang.RuntimeException
	 *             kada je uneta vrednost za precnik auto gume
	 * 
	 *             <ul>
	 *             <li>manja od 13, ili</li>
	 *             <li>veca od 22</li>
	 * 
	 *             </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina auto gume.
	 * 
	 * @return sirinu auto gume kao integer
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost za sirinu auto gume
	 * 
	 * @param sirina nova integer vrednost za sirinu auto gume
	 *            
	 * 
	 * @throws java.lang.RuntimeException
	 *             kada je uneta vrednost za sirinu auto gume 
	 *             <ul>
	 *             <li>manja od 135,ili</li>
	 *             <li>veca od 355</li>
	 * 
	 *             </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visina auto gume.
	 * 
	 * @return visinu auto gume kao integer
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost za visinu auto gume
	 * 
	 * @param visina nova integer vrednost za visinu auto gume
	 * 
	 * @throws java.lang.RuntimeException
	 *             kada je uneta vrednost za visinu auto gume
	 *             <ul>
	 * 
	 *             <li>manja od 25,ili</li>
	 * 
	 *             <li>veca od 95</li>
	 * 
	 *             </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca String sa svim podacima o auto gumi.
	 * @return String sa svim podacima o auto gumi. 
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
/**
 * Proverava da li su dve auto gume iste po atributima
 		markaModel, precnik, sirina i visina.
 * @return true ako su dve gume iste po svim svojim atributima,
 * u suprotnom vraca false
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}

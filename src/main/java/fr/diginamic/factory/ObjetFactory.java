package fr.diginamic.factory;

/**
 * Classe gérant l'instanciation d'objets par le biais de "Factory Methods".
 */
public class ObjetFactory {

	/**
	 * Méthode Factory pour instancier un type d'objet connecté.
	 * 
	 * @param objet : enum précisant la classe concrète de l'objet qui sera retourné
	 * @return ObjetConnecte : objet dont la classe concrète est définie par le
	 *         paramètre
	 */
	public static ObjetConnecte getObjetConnecte(TypeObjetEnum objet) {
		if (objet.equals(TypeObjetEnum.ENCEINTE_CONNECTE)) {
			return new EnceinteConnectee(15);
		} else if (objet.equals(TypeObjetEnum.TABLETTE)) {
			return new Tablette(10);
		} else if (objet.equals(TypeObjetEnum.TELEPHONE_PORTABLE)) {
			return new TelephonePortable(5);
		}
		return null;
	}
}

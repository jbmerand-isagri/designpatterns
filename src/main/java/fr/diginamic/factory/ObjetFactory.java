package fr.diginamic.factory;

/**
 * Classe gérant l'instanciation d'objets par le biais de "Factory Methods".
 */
public class ObjetFactory {

	/**
	 * Méthode Factory pour instancier un type d'objet connecté.
	 * 
	 * @param type int : numéro correspond à la classe concrète de l'objet
	 * @return ObjetConnecte : objet dont la classe concrète est définie par le
	 *         paramètre
	 */
	public static ObjetConnecte getObjetConnecte(int type) {
		if (type == 1) {
			return new EnceinteConnectee();
		} else if (type == 2) {
			return new Tablette();
		} else if (type == 3) {
			return new TelephonePortable();
		}
		return null;
	}
}

package fr.diginamic.composite;

/**
 * Représente un élément de l'organisation hiérarchique
 */
public interface IElement {

	/**
	 * Calcule et retourne le/les salaire(s) de l'entité.
	 * 
	 * @return double : salaire de l'entité.
	 */
	double calculerSalaire();
}

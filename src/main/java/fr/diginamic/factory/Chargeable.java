package fr.diginamic.factory;

/**
 * Interface pour implémenter la capacité à être électriquement rechargeable.
 */
public interface Chargeable {

	/**
	 * Met en charge l'objet branché.
	 * 
	 * @param volts
	 */
	void recharger(int volts);
}

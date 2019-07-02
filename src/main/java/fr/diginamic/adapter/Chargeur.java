package fr.diginamic.adapter;

import fr.diginamic.factory.Chargeable;

/**
 * Représente un chargeur électrique.
 */
public class Chargeur {

	/** volts : int (voltage en sortie du chargeur) */
	int volts = 220;

	/**
	 * Alimente électriquement un objet chargeable.
	 * 
	 * @param chargeable : objet électriquement rechargeable
	 */
	public void brancher(Chargeable chargeable) {
		chargeable.recharger(volts);
	}

}

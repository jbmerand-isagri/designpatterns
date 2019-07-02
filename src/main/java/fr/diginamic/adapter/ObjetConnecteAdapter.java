package fr.diginamic.adapter;

import fr.diginamic.factory.Chargeable;
import fr.diginamic.factory.ObjetConnecte;

/**
 * Représente un objet connecté qui est adapté pour nécessité du 220 volts.
 */
public class ObjetConnecteAdapter implements Chargeable {

	/** objetConnecte : ObjetConnecte */
	private ObjetConnecte objetConnecte;

	/**
	 * Constructor
	 * 
	 * @param objetConnecte
	 */
	public ObjetConnecteAdapter(ObjetConnecte objetConnecte) {
		this.objetConnecte = objetConnecte;
	}

	/**
	 * Transforme si nécessaire les volts entrés pour ne pas fournir plus que la
	 * limite recevable par l'objet.
	 */
	public void recharger(int volts) {
		if (volts > objetConnecte.getLimiteVolts()) {
			objetConnecte.recharger(objetConnecte.getLimiteVolts());
		} else {
			objetConnecte.getLimiteVolts();
		}
	}
}

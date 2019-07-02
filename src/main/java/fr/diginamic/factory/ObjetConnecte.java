package fr.diginamic.factory;

/**
 * Représente un objet connecté abstrait.
 */
public abstract class ObjetConnecte {

	/** limiteVolts : int */
	int limiteVolts;

	/**
	 * Définit la valeur idéale de voltage pour la recharge.
	 * 
	 * @param volts
	 */
	public abstract void recharger(int volts);

	/**
	 * Getter
	 * 
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setter
	 * 
	 * @param limiteVolts the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}

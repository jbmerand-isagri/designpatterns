package fr.diginamic.factory;

/**
 * Représente un objet connecté abstrait.
 */
public abstract class ObjetConnecte implements Chargeable {

	/** limiteVolts : int */
	int limiteVolts;

	public ObjetConnecte(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

	@Override
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

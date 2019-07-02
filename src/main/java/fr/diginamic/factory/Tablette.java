package fr.diginamic.factory;

/**
 * Représente une tablette.
 */
public class Tablette extends ObjetConnecte {

	/**
	 * Constructor
	 * 
	 * @param limiteVolts
	 */
	public Tablette(int limiteVolts) {
		super(limiteVolts);
	}

	@Override
	public void recharger(int volts) {
		if (volts < limiteVolts) {
			System.out.println("Tablette branchée mais voltage insuffisant :/");
		} else if (volts == limiteVolts) {
			System.out.println("Tablette en charge :)");
		} else if (volts > limiteVolts) {
			System.out.println("Tablette grillé :(");
		}
	}
}

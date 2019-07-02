package fr.diginamic.factory;

/**
 * Représente une enceinte connectée.
 */
public class EnceinteConnectee extends ObjetConnecte {

	@Override
	public void recharger(int volts) {
		if (volts < limiteVolts) {
			System.out.println("Enceinte connectée branchée mais voltage insuffisant :/");
		} else if (volts == limiteVolts) {
			System.out.println("Enceinte connectée en charge :)");
		} else if (volts > limiteVolts) {
			System.out.println("Enceinte connectée grillée :(");
		}
	}
}

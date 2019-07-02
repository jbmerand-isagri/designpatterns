package fr.diginamic.factory;

/**
 * Représente un téléphone portable.
 */
public class TelephonePortable extends ObjetConnecte {

	@Override
	public void recharger(int volts) {
		if (volts < limiteVolts) {
			System.out.println("Téléphone portable branché mais voltage insuffisant :/");
		} else if (volts == limiteVolts) {
			System.out.println("Téléphone portable en charge :)");
		} else if (volts > limiteVolts) {
			System.out.println("Téléphone portable grillé :(");
		}
	}

}

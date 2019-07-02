package fr.diginamic.factory;

/**
 * Classe de tests du TP sur les Factory Methods.
 */
public class TestFactory {

	/**
	 * Méthode main d'entrée du test.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		ObjetConnecte telephone = ObjetFactory.getObjetConnecte(3);
		telephone.setLimiteVolts(500);
		telephone.recharger(900);

		ObjetConnecte tablette = ObjetFactory.getObjetConnecte(2);
		tablette.setLimiteVolts(500);
		tablette.recharger(500);

		ObjetConnecte enceinte = ObjetFactory.getObjetConnecte(1);
		enceinte.setLimiteVolts(500);
		enceinte.recharger(300);
	}

}

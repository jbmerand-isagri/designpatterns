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

		ObjetConnecte telephone = ObjetFactory.getObjetConnecte(TypeObjetEnum.TELEPHONE_PORTABLE);
		telephone.recharger(900);

		ObjetConnecte tablette = ObjetFactory.getObjetConnecte(TypeObjetEnum.TABLETTE);
		tablette.recharger(500);

		ObjetConnecte enceinte = ObjetFactory.getObjetConnecte(TypeObjetEnum.ENCEINTE_CONNECTE);
		enceinte.recharger(300);
	}

}

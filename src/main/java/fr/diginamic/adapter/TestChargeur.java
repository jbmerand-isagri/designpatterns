package fr.diginamic.adapter;

import fr.diginamic.factory.ObjetFactory;
import fr.diginamic.factory.TypeObjetEnum;

/**
 * Classe de test de l'efficacité de la recharge des objets suite à leur
 * branchement.
 */
public class TestChargeur {

	/**
	 * Méthode d'entrée, main, du test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Chargeur chargeur = new Chargeur();
		ObjetConnecteAdapter enceinteAdapter = new ObjetConnecteAdapter(
				ObjetFactory.getObjetConnecte(TypeObjetEnum.ENCEINTE_CONNECTE));
		ObjetConnecteAdapter tabletteAdapter = new ObjetConnecteAdapter(
				ObjetFactory.getObjetConnecte(TypeObjetEnum.TABLETTE));
		ObjetConnecteAdapter telephoneAdapter = new ObjetConnecteAdapter(
				ObjetFactory.getObjetConnecte(TypeObjetEnum.TELEPHONE_PORTABLE));

		chargeur.brancher(telephoneAdapter);
		chargeur.brancher(enceinteAdapter);
		chargeur.brancher(telephoneAdapter);
	}

}

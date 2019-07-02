package fr.diginamic.composite;

/**
 * Classe de test du patron "Composite"
 */
public class TestComposite {

	/**
	 * Méthode main, d'entrée de la classe de test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Service DSIN = new Service("DSIN");
		DSIN.addElement(new Employe(10000, "RASPEY", "Cécile"));
		DSIN.addElement(new Employe(8000, "BECHKAR", "Bilel"));

		Service JavaDev = new Service("JavaDev");
		JavaDev.addElement(new Employe(7500, "GUINEAU", "Kevin"));
		JavaDev.addElement(new Employe(3500, "MARTIN", "Paul"));

		Service BigData = new Service("Big Data");
		BigData.addElement(new Employe(7500, "RANMEY", "JB"));
		BigData.addElement(new Employe(3500, "DOE", "Jane"));

		DSIN.addElement(BigData);
		DSIN.addElement(JavaDev);

		System.out.println("Somme des salaires pour DSIN = " + DSIN.calculerSalaire());
	}

}

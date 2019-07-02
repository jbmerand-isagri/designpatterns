package fr.diginamic.composite;

/**
 * Représente un employé de l'entreprise
 */
public class Employe implements IElement {
	private double salaire;
	private String nom;
	private String prenom;

	/**
	 * Constructor
	 * 
	 * @param salaire de l'empoyé
	 * @param nom     de l'employé
	 * @param prenom  de l'employé
	 */
	public Employe(double salaire, String nom, String prenom) {
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public double calculerSalaire() {
		return salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * Setter
	 * 
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}

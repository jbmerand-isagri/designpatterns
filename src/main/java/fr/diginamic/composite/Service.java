package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un service de l'entreprise.
 */
public class Service implements IElement {

	/** sommeSalaires : double */
	private double sommeSalaires = 0;
	/** listeDuService : List<IElement> */
	private List<IElement> listeDuService = new ArrayList<>();
	/** nom : String */
	private String nom;

	public Service(String nom) {
		this.nom = nom;
	}

	@Override
	public double calculerSalaire() {

		if (listeDuService.size() > 0) {
			for (IElement iElement : listeDuService) {
				sommeSalaires += iElement.calculerSalaire();
			}
		}

		return sommeSalaires;
	}

	/**
	 * Ajoute un élément au service.
	 * 
	 * @param element
	 */
	public void addElement(IElement element) {
		listeDuService.add(element);
	}

	/**
	 * Getter
	 * 
	 * @return the sommeSalaires
	 */
	public double getSommeSalaires() {
		return sommeSalaires;
	}

	/**
	 * Setter
	 * 
	 * @param sommeSalaires the sommeSalaires to set
	 */
	public void setSommeSalaires(double sommeSalaires) {
		this.sommeSalaires = sommeSalaires;
	}

	/**
	 * Getter
	 * 
	 * @return the listeDuService
	 */
	public List<IElement> getListeDuService() {
		return listeDuService;
	}

	/**
	 * Setter
	 * 
	 * @param listeDuService the listeDuService to set
	 */
	public void setListeDuService(List<IElement> listeDuService) {
		this.listeDuService = listeDuService;
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

}

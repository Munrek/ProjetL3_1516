package serveur.element;

import java.util.HashMap;

import utilitaires.Calculs;

public class Monstre extends Personnage {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Carcteristiques de base
	 */
	private static final HashMap<Caracteristique, Integer> CARACTS;
	
	/**
	 * Initialisation de la HashMap
	 */
	static
	{
		CARACTS = new HashMap<Caracteristique, Integer>();
		CARACTS.put(Caracteristique.VIE, 10);
		CARACTS.put(Caracteristique.FORCE, 10);
		CARACTS.put(Caracteristique.INITIATIVE, Calculs.valeurCaracAleatoire(Caracteristique.INITIATIVE));
		//TODO CARACTS.put(Caracteristique.DEFENSE, 0);
	}

	public Monstre() {
		super("Monstre", "Serveur", CARACTS);
	}

}

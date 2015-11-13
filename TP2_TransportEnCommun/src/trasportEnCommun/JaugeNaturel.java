package trasportEnCommun;
/**
 * R�alisation d'une Jauge avec des entiers naturels.
 * <p>
 * Un objet Jauge d�finit un niveau et un intervalle ouvert ]vigieMin, vigieMax[. 
 * Le niveau d'une jauge n'est pas limit� aux valeurs dans l'intervalle.
 * <p>
 * L'�tat d'une jauge correspond � la position de son niveau par rapport � 
 * l'intervalle ]vigieMin, vigieMax[.
 * Une jauge d�finit trois etats : 
 * <ul>
 * <li>vert niveau dans l'intervalle, 
 * <li>rouge niveau sup�rieur � l'intervalle,
 * <li>bleu niveau inf�rieur � l'intervalle.
 * </ul>
 * 
 * @author georgy
 * @since 2006-2007
 */
public class JaugeNaturel { 
  private long valeur;
  private final long min;
  private final long max;

  /**
   * Construit une instance en pr�cisant la valeur de d�part de la Jauge
   * et l'intervalle de vigie.
   * 
   * @param vigieMin valeur minimale de l'intervalle de vigie.
   * @param vigieMax valeur maximale de l'intervalle de vigie.
   * @param depart   valeur initiale de la jauge.
   */
  public JaugeNaturel(long vigieMin, long vigieMax, long depart) {
    valeur = depart;
    min = vigieMin;
    max = vigieMax;
    /* Le constructeur d'une classe permet d'initialiser l'etat de l'instance creee.
     * Son nom correspond toujours au nom de la classe. Il n'y a pas de type de retour.
     */
  }


  /**
   * L'�tat de la jauge est-il rouge ?
   *
   * @return vrai si niveau >=  vigieMax.
   *
   */
  public boolean estRouge() {
    return valeur >= max;
  }

  /**
   * L'�tat de la jauge est-il vert ?
   *
   * @return vrai si niveau appartient � ]vigieMin, vigieMax[.
   *
   */
  public boolean estVert() {
    return !(estBleu() || estRouge());
    
  }

  /**
   * L'�tat de la jauge est-il bleu ?
   *
   * @return vrai si niveau <= vigieMin.
   */
  public boolean estBleu() {
    return valeur <= min;
  }

  /**
   * Incr�mente le niveau d'une unit�.
   * L'�tat peut devenir sup�rieur � vigieMax.
   */
  public void incrementer() {
    valeur++;
  }

  /**
   * D�cr�mente le niveau d'une unit�.
   * L'�tat peut devenir inf�rieur � la vigieMin.
   */
  public void decrementer() {
	  valeur--;
  }


  /**
   * Cette m�thode est h�rit�e de la classe {@link java.lang.Object}.
   * Tr�s utile pour le d�bogage, elle permet de fournir une 
   * cha�ne de caract�res correspondant a l'�tat d'un objet.
   * <p> Un code par d�faut est d�finit dans 
   * {@link java.lang.Object#toString() la classe Object} 
   * Il faut adapter (red�finir) le code de cette m�thode � chaque classe.
   *
   * Pour les cha�nes de cararct�res, l'op�rateur + correspond a la concat�nation. 
   * Les valeurs num�riques sont alors convertit en ascii.
   * Si l'�tat d'une instance de cette classe est min=-456, max=23,
   * valeur=-7, la concat�nation donne la cha�ne "<-7 [-456,23]>".
   */
  @Override
  public String toString() {
    return "<" + valeur + " [" + min + "," + max + "]>"; 
  }
}
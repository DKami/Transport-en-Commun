package trasportEnCommun;
public interface Passager {
    
    void accepterPlaceAssise();
    void accepterPlaceDebout(); 
    void accepterSortie(); 
    boolean estAssis(); 
    boolean estDebout(); 
    boolean estDehors(); 
    java.lang.String nom(); 
    void nouvelArret(Bus bus, int numeroArret); 

}

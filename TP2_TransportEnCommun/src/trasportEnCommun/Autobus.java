package trasportEnCommun;

public class Autobus implements Transport, Bus{
    
    private Passager[] lesPassagers;
    private JaugeNaturel jauge;
    private int nbMaxPlaceAssise;
    private int nbMaxPlaceDebout;
    private int arret;
    
    public Autobus(int nbMaxPlaceAssise, int nbMaxPlaceDebout ){
        
        final int PLACEMAX = nbMaxPlaceAssise + nbMaxPlaceDebout ;
        final int PLACEMIN = 0;
        
        // if(PLACEMAX < PLACEMIN){  verification }
        
        this.lesPassagers = new Passager[PLACEMAX] ;
        this.jauge = new JaugeNaturel(PLACEMIN, PLACEMAX, PLACEMIN);
        this.nbMaxPlaceAssise = nbMaxPlaceAssise;  
        this.nbMaxPlaceDebout = nbMaxPlaceDebout; 
        
    }
    
   @Override
   public void allerArretSuivant() throws UsagerInvalideException{
       this.arret += 1;
       for(Passager unPassager : lesPassagers){
           unPassager.nouvelArret(this, this.arret);
       }
   }
   
   @Override
   public boolean aPlaceAssise(){
       int nbPlaceAssise = 0;
      
       for(Passager unPassager : lesPassagers){
          if(unPassager.estAssis()) nbPlaceAssise++;
       }
      return nbPlaceAssise < this.nbMaxPlaceAssise;
   }
   
   @Override
   public boolean aPlaceDebout(){
       int nbPlaceDebout = 0;
      
       for(Passager unPassager : lesPassagers){
          if(unPassager.estAssis()) nbPlaceDebout++;
       }
       return nbPlaceDebout < this.nbMaxPlaceDebout ;
   }
    
   @Override
   public void demanderChangerEnAssis(Passager p){
       if(aPlaceAssise()) p.accepterPlaceAssise();
    }
    
   @Override
   public void demanderChangerEnDebout(Passager p){
       if(aPlaceDebout()) p.accepterPlaceDebout();
    }
    
   @Override
   public void demanderPlaceAssise(Passager p){
    
    }
    
   @Override
   public void demanderPlaceDebout(Passager p){
    
    }
    
   @Override
   public void demanderSortie(Passager p){
    
    }
}

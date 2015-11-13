package trasportEnCommun;

public interface Bus {
     boolean aPlaceAssise();
     boolean aPlaceDebout();
     void demanderChangerEnAssis(Passager p);
     void demanderChangerEnDebout(Passager p);
     void demanderPlaceAssise(Passager p);
     void demanderPlaceDebout(Passager p);
     void demanderSortie(Passager p);
}

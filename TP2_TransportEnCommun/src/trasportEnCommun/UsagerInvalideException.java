package trasportEnCommun;

public class UsagerInvalideException extends Exception{
    private Transport quelTransport;
    private Usager quelUsager;
    
    public UsagerInvalideException(String message, Usager u, Transport t){
    super(message + " usager : lusager Transport : letransport");
    this.quelUsager = u ;
    this.quelTransport = t;
    
    }
    
    public UsagerInvalideException(String message){
     this(message, null, null);
    }
    
}

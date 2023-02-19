import java.util.HashMap;

public class Module {
    private String nom ;
    private Niveau niveau ;
    Module(String nom , Niveau niveau){
        this.nom = nom ;
        this.niveau = niveau ;
    }
    /** Setters and Getters **/
    public String getNom() {
        return nom;
    }
}

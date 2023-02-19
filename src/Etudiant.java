import java.util.HashMap ;
import java.util.Map ;
public class Etudiant {
    /** Donnee etudiant **/
    private String nom ;
    private String prenom ;
    private String matricule ;
    private Groupe groupe ;
    private Niveau niveauEtude ;
    private HashMap<Module, Integer> absencesModules = new HashMap<Module, Integer>() ;
    /** Constructors **/
    Etudiant(String nom, String prenom, String matricule, Niveau niveauEtude, Groupe groupe){
        this.nom = nom ;
        this.prenom = prenom ;
        this.matricule = matricule ;
        this.niveauEtude = niveauEtude ;
        this.groupe = groupe ;
        /** Add to group **/
        this.groupe.addEtudiant(this);
        /** Initialize Absences **/
        for(Module module : this.niveauEtude.getListModules()){
            absencesModules.put(module, 0) ;
        }
    }
    /** Setters & Getters **/
    public String getNom(){
        return this.nom ;
    }
    public String getPrenom(){
        return this.prenom ;
    }
    public Niveau getNiveau(){
        return this.niveauEtude ;
    }
    public Groupe getGroupe(){
        return this.groupe ;
    }
    public String getMatricule(){
        return this.matricule ;
    }
    public HashMap<Module, Integer> getAbsencesModules(){
        return this.absencesModules ;
    }
    /** Manipulation **/
    public void afficher(){
        System.out.println(this.nom + " " + this.prenom);
    }
    public void signalerAbsent(Module module){
        this.absencesModules.put(module, this.absencesModules.get(module) + 1 ) ;
    }
}


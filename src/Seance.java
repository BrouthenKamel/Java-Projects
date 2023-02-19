import java.util.ArrayList ;
import java.util.HashMap ;
public class Seance {
    /** Donnee Seance **/
    private String date ;
    private String heure ;
    private Niveau niveau ;
    private Module module ;
    private Groupe groupe ;
    /** Data **/
    private ArrayList<Etudiant> listAbsentes = new ArrayList<Etudiant>() ;
    private HashMap<Etudiant, Boolean> justificationAbsence = new HashMap<Etudiant, Boolean>() ;
    /** Constructor **/
    Seance(String date, String heure, Niveau niveau, Module module, Groupe groupe){
        this.date = date ;
        this.heure = heure ;
        this.niveau = niveau ;
        this.module = module ;
        this.groupe = groupe ;
    }
    /** Setter & Getter **/
    public Niveau getNiveau(){
        return this.niveau ;
    }
    public Module getModule(){
        return this.module ;
    }
    public Groupe getGroupe(){
        return this.groupe ;
    }
    /** Getters & Setters **/
    public ArrayList<Etudiant> getListAbsent(){
        return listAbsentes;
    }
    public void setAbsents(ArrayList<Etudiant> listeAbsents){
        this.listAbsentes = listeAbsents ;
    }
    public void clearListeAbsents(){
        this.listAbsentes.clear();
    }
    /** Manipulation **/
    public void ajouterAbsent(Etudiant etudiant, boolean justifie){
        this.listAbsentes.add(etudiant) ;
        this.justificationAbsence.put(etudiant, justifie);
    }
    public void justifierAbsence(Etudiant etudiant){
        justificationAbsence.put(etudiant, true) ;
    }
    public void afficherListAbsents(){
        for(Etudiant etudiant : listAbsentes){
            etudiant.afficher() ;
        }
    }
}

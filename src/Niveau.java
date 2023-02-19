import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.Map;

public class Niveau {
    /** Donnee Niveau **/
    private String nom ;
    private ArrayList<Module> listModules ;
    private ArrayList<Groupe> listGroupes ;
    /** Constructor **/
    Niveau(String nom){
        this.nom = nom ;
        this.listModules = new ArrayList<Module>() ;
        this.listGroupes = new ArrayList<Groupe>() ;
    }
    Niveau(String nom, ArrayList<Module> listeModules, ArrayList<Groupe> listeGroupes){
        this.nom = nom;
        this.listModules = listeModules ;
        this.listGroupes = listeGroupes ;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    /** Setter & Getter **/

    public ArrayList<Module> getListModules(){
        return this.listModules ;
    }

    public void setListModules(ArrayList<Module> listModules) {
        this.listModules = listModules;
    }
    public ArrayList<Groupe> getListGroupes() {return this.listGroupes ;} ;

    public void setListGroupes(ArrayList<Groupe> listGroupes) {
        this.listGroupes = listGroupes;
    }
    /** Manipulation **/
}

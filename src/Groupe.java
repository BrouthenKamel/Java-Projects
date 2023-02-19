import java.util.ArrayList;
import java.util.HashMap ;
import java.util.HashMap ;

public class Groupe {
    private Niveau niveau ;
    private int numeroGroupe ;
    private ArrayList<Etudiant> listEtudiants = new ArrayList<Etudiant>() ;
    Groupe(Niveau niveau, int numeroGroupe){
        this.niveau = niveau ;
        this.numeroGroupe = numeroGroupe ;
    }
    public int getNumeroGroupe() {
        return numeroGroupe;
    }
    /** Setter & Getter **/

    public ArrayList<Etudiant> getListEtudiant(){
        return this.listEtudiants ;
    }
    public void setListEtudiant(ArrayList<Etudiant> listEtudiants){
        this.listEtudiants = listEtudiants ;
    }
    /** Manipulation **/
    public void addEtudiant(Etudiant etudiant){
        this.listEtudiants.add(etudiant) ;
    }
}

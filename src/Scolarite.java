import java.util.ArrayList;
import java.util.Map;

public class Scolarite {
    private String nomEcole ;
    public Assiduite assiduite ;
    private ArrayList<Niveau> listNiveaux ;
    /** Constructor **/
    Scolarite(String nomEcole){
        this.nomEcole = nomEcole ;
        this.assiduite = new Assiduite() ;
        this.listNiveaux = new ArrayList<Niveau>() ;
    }
    Scolarite(String nomEcole, Assiduite assiduite, ArrayList<Niveau> listNiveaux){
        this.nomEcole = nomEcole ;
        this.assiduite = new Assiduite() ;
        this.listNiveaux = listNiveaux ;
    }
    /** Setter and Getter **/
    public String getNomEcole(){
        return this.nomEcole;
    }
    public ArrayList<Niveau> getListNiveaux(){
        return this.listNiveaux ;
    }
    public void setListNiveaux(ArrayList<Niveau> listNiveaux){
        this.listNiveaux = listNiveaux ;
    }
    /** Manipulation **/
    public void addNiveau(Niveau niveau){
        this.listNiveaux.add(niveau) ;
    }

    /** Fonctionalites **/

    /** Assiduite **/
    public void afficherAbsence(){
        for (Niveau niveau : this.listNiveaux){
            System.out.println("Les absences de Niveau : "+niveau.getNom() );
            for(Groupe groupe : niveau.getListGroupes()){
                System.out.println("Les absences de Groupes : "+groupe.getNumeroGroupe() );
                for (Etudiant etudiant : groupe.getListEtudiant()){
                    System.out.println("Les absences de : "+etudiant.getNom() + " " + etudiant.getPrenom() );
                    for(Map.Entry<Module, Integer> moduleIntegerEntry : etudiant.getAbsencesModules().entrySet()){
                        System.out.println(" Module "+moduleIntegerEntry.getKey().getNom() + " absentee "+moduleIntegerEntry.getValue()+" fois." );
                    }
                }
            }
        }
    }
}

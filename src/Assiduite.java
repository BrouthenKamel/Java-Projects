import java.util.ArrayList;

public class Assiduite {
    private ArrayList<Seance> listSeance = new ArrayList<Seance>() ;
    /** Constructors **/

    /** Setters & Getters **/
    public ArrayList<Seance> getListSeance() {
        return listSeance;
    }
    public void setListSeance(ArrayList<Seance> listSeance) {
        this.listSeance = listSeance;
    }
    /** Manipulation **/
    public void updateAbsences(){
        for(Seance seance : listSeance){
            for(Etudiant etudiant : seance.getListAbsent()){
                etudiant.signalerAbsent(seance.getModule()); ;
            }
        }
    }
}
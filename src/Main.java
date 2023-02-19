import java.util.ArrayList;

public class Main {
    public static void main(String args []){
        /** Declaration Ecole **/
        Scolarite esi = new Scolarite("Ecole") ;
        /** Declaration Niveaux **/
        Niveau cpi_1 = new Niveau("1CP") ;
        Niveau cpi_2 = new Niveau("2CP") ;
        Niveau cs_1 = new Niveau("1CS") ;
        Niveau cs_2 = new Niveau("2CS") ;
        Niveau cs_3 = new Niveau("3CS") ;
        esi.setListNiveaux(new ArrayList<Niveau>(){{add(cpi_1) ; add(cpi_2) ; add(cs_1) ; add(cs_2) ; add(cs_3) ; }});
        /** Declaration des Modules **/
        Module poo = new Module("POO", cpi_2) ;
        Module sfsd = new Module("SFSD", cpi_2) ;
        Module logm = new Module("LOGM", cpi_2) ;
        cpi_2.setListModules(new ArrayList<Module>() {{add(poo) ; add(sfsd) ; add(logm) ; }});
        /** Declaration des Groupes **/
        Groupe g2_1 = new Groupe(cpi_2, 1) ;
        Groupe g2_2 = new Groupe(cpi_2, 2) ;
        Groupe g2_3 = new Groupe(cpi_2, 3) ;
        cpi_2.setListGroupes(new ArrayList<Groupe>(){{add(g2_1) ; add(g2_2) ; add(g2_3) ; }}) ;
        /** Declaration des Etudiants **/
        Etudiant e1 = new Etudiant("Brouthen", "Kamel", "21/0015", cpi_2, g2_1) ;
        Etudiant e2 = new Etudiant("Brouthen", "Jamel", "20/0015", cpi_2, g2_1) ;
        Etudiant e3 = new Etudiant("Brouthen", "Kamel", "21/0015", cpi_2, g2_2) ;
        Etudiant e4 = new Etudiant("Brouthen", "Yamel", "21/0015", cpi_2, g2_2) ;
        Etudiant e5 = new Etudiant("Brouthen", "Aamel", "21/0015", cpi_2, g2_3) ;
        Etudiant e6 = new Etudiant("Brouthen", "Bamel", "21/0015", cpi_2, g2_3) ;
        Etudiant e7 = new Etudiant("Brouthen", "Camel", "21/0015", cpi_2, g2_3) ;
        /** Declaration des Seances **/
        Seance s1 = new Seance("20/01/2015", "10:00", cpi_2, poo, g2_1) ;
        s1.setAbsents(new ArrayList<Etudiant>(){{add(e1) ; add(e2) ;}});
        Seance s2 = new Seance("4/01/2015", "4:00", cpi_2, sfsd, g2_1) ;
        s2.setAbsents(new ArrayList<Etudiant>(){{ add(e2) ;}});
        Seance s3 = new Seance("7/01/2000", "11:00", cpi_2, logm, g2_2) ;
        s3.setAbsents(new ArrayList<Etudiant>(){{ add(e3) ;}});
        s3.setAbsents(new ArrayList<Etudiant>(){{ add(e4) ;}});
        Seance s4 = new Seance("20/09/2018", "8:00", cpi_2, poo, g2_3) ;
        Seance s5 = new Seance("19/01/2016", "16:00", cpi_2, logm, g2_3) ;
        esi.assiduite.setListSeance(new ArrayList<Seance>(){{add(s1) ; add(s2) ;add(s3) ;add(s4) ;add(s5) ;}});
        /** Mise a jour **/
        esi.assiduite.updateAbsences();
        esi.afficherAbsence();
    }
}

package medipass.medipass.mod;
// 🥱

import java.io.*;
import java.util.*;

public class Statistiques {

    // Attributes
    private int nb_patients;
    private List<int[]> nb_pro_by_ctg;
    private List<int[]> conslt_by_periods;
    public List<int[]> stats;

    // Constructor
    public Statistiques() {
        // ! important
        this.nb_patients = 0;
        this.nb_pro_by_ctg = new ArrayList<>();
        this.conslt_by_periods = new ArrayList<>();
        this.stats = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            this.nb_pro_by_ctg.add(new int[1]);
            this.conslt_by_periods.add(new int[1]);
        }
        this.stats.add(new int[7]);
    }
    //public Statistiques(int nbpat, int nbpro, int consbp, int illoc) {}

    // Methods
    public List<int[]> stats() {
        String line;
        String fileName;
        // row -> index : 0 ; column -> element : e = []
        int[] nb_medecin = new int[1];
        int[] nb_infirmier = new int[1];
        int[] nb_pharmacien = new int[1];
        int[] nb_conslt = new int[1];
        
        // nb_patients
        fileName = "../DB/patients.csv";
        try (BufferedReader patientsCSV = new BufferedReader(new FileReader(fileName))) {
            while ((line = patientsCSV.readLine()) != null) {
                nb_patients += 1;
            }
        } catch (IOException e) { e.printStackTrace(); } // TODO: handle exception
        stats.get(0)[0] = nb_patients - 1;
        
        // nb_pro_by_ctg
        fileName = "../DB/utilisateurs.csv";
        try (BufferedReader usersCSV = new BufferedReader(new FileReader(fileName))) {
            int n = 0;
            while ((line = usersCSV.readLine()) != null) {
                String[] partrow = line.split(",");  // ctg
                List<String> column = Arrays.asList(partrow);
                String[] ctg = {"Medecin", "Infirmier", "Pharmacien"};
                //
                if (column.contains(ctg[0])) //"Medecin"
                    nb_medecin[0] += 1;
                else if (column.contains(ctg[1])) //"Infirmier"
                    nb_infirmier[0] += 1;
                else if (column.contains(ctg[2])) //"Pharmacien"
                    nb_pharmacien[0] += 1;
                else 
                    n += 1;
            }
            stats.get(0)[4] = n - 1;
            //
            this.nb_pro_by_ctg.set(0, nb_medecin);
            this.nb_pro_by_ctg.set(1, nb_infirmier);
            this.nb_pro_by_ctg.set(2, nb_pharmacien);
        } catch (IOException e) { e.printStackTrace(); } // TODO: handle exception
        stats.get(0)[1] = nb_medecin[0];
        stats.get(0)[2] = nb_infirmier[0];
        stats.get(0)[3] = nb_pharmacien[0];
        
        // conslt_by_periods
        // ex: 
        fileName = "../DB/consultations.csv";
        nb_conslt[0] = 23;
        stats.get(0)[5] = nb_conslt[0]; // 1 period

        return stats;
    }
    // cat Statistiques
    public void cats() {
        stats();
        System.out.println("____________________________\n"+
                            " *** Statistiques *** ");
        String[] Champs = {"nb_patients", "nb_medecin", "nb_infirmier", "nb_pharmacien", "Nb_de_ProDeSante", "cons_by_periods"};  /*,,,,,*/
        for (int i = 0; i < Champs.length; i++) {
            if ((i == 0) || (i == 1) || (i == 5)) 
                System.out.println("**");
            System.out.println(Champs[i] +" : "+ stats.get(0)[i]);
        }
        System.out.println("____________________________\n");
    }

}


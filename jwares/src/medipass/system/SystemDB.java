// Base de Données
// Import / Export CSV Data
package medipass.system;

import java.util.*;
import java.io.*;


public class SystemDB {

    // Attributes
    private boolean Table;
    private String fileName;
    private List<String[]> defaultable; // patients || utilisateurs
    private List<String> strow;
    
    // Constructor
    public SystemDB(boolean TableP, boolean TableU) {
        this.Table = TableP;
        if (Table) {
            this.fileName = "../db/patients.csv"; // patients table
            System.out.println(" Connected to Patients Table ");
        } else {
            this.fileName = "../db/utilisateurs.csv"; // users table
            System.out.println(" Connected to ProSante Table ");
        }
        this.defaultable = new ArrayList<>();
        this.strow = new ArrayList<>();
    }

    // Methods
    // default table
    public void getIdentifiers() {
        System.out.println(" G - Give theirs identifiers \n or \n"+
            " E - Enter filepath "+
            "\n G || E "
        );
        try (//
        Scanner scann = new Scanner(System.in)) {
            if (Table) {
                // table patients
                String response = scann.nextLine();
                switch (response) {
                    case "G":
                        System.out.println(
                            " Format : \t ♥ \t ♥ \t ♥ "+
                            "id, nom, prenom, age, sexe, date_naissance, no_tel, email, addresse\\n"
                        );
                        strow.add(scann.nextLine());
                        addToTable();
                        break;
                    case "E":
                        fileName = scann.nextLine();
                        // strow = line;
                        addToTable();
                        break;
                    default:
                        System.out.println(" Out ");
                        break;
                }
            } else {
                // table users
                System.out.println(" YouGive your identifiers basin' on this style ♥\n"+
                    " Format : \t ♥ \t ♥ \t ♥ "+
                    "id, nom, prenom, age, sexe, date_naissance, no_tel, email, addresse, ctg\\n"
                );
                String identifiers = scann.nextLine();
            }
        }
    }
    // OR
    public void addRow() {
        // java_SQL
        // data for Patients
        if (Table) {
            strow.add("id, nom, prenom, age, sexe, date_naissance, no_tel, email, addresse");
            strow.add("0, Verrara, Alicia, 31, Feminin, 12_11_2002, 45347689, alicia2verrara@gmail.com, Vancouver");
            strow.add("1, Ven, Reynan, 31, Feminin, 10_10_2003, 50908732, reynan5ven@gmail.com, Toronto");
            strow.add("2, Don, Carlo, 31, Feminin, 02_04_2006, 54678921, carlo65don@gmail.com, Vancouver");
            strow.add("3, Tren, Bernada, 28, Feminin, 20_09_1980, 90894523, bernada80tren@gmail.com, Berlin");
            strow.add("4, Verrara, Alicia, 45, Feminin, 12_11_2002, 45347689, alicia2verrara@gmail.com, London");
            strow.add("5, Deyara, Alicia, 33, Feminin, 01_11_2001, 89067435, alicia10deydara@gmail.com, Vancouver");
            strow.add("6, Verrara, Ferdinand, 21, Masculin, 30_06_1993, 98886732, alicia2verrara@gmail.com, Alaska");
            strow.add("7, Allman, Kris, 31, Feminin, 12_11_2002, 45347689, alicia2verrara@gmail.com, Beverlly Hills");
            strow.add("8, Vampira, Alica, 18, Feminin, 30_03_1975, 65789324, alica76vapira@gmail.com, Vietnam");
        } else {
            strow.add("id, nom, prenom, age, sexe, date_naissance, no_tel, email, addresse, ctg");
            strow.add("0, Crownwell, Anastasia, 26, Feminin, 21_12_1999, 34900076, anastasia11crownwell@gmail.com, Seoul, Medecin");
            strow.add("1, Brown, Britanie, 26, Feminin, 21_12_1990, 90908976, britanie11brown@gmail.com, Gibraltar, Infirmier");
            strow.add("2, Cornnwell, Simphony, 23, Feminin, 21_12_1997, 90876545, simphony@cornnwellgmail.com, Zair, Medecin");
            strow.add("3, Bill, Ditch, 22, Masculin, 23_01_1978, 34546578, anastasia11@gmail.com, Libye, Medecin");
            strow.add("4, Standford, Stanley, 34, Masculin, 16_08_1996, 09998956, stanley80standford@gmail.com, Kinshasa, Medecin");
            strow.add("5, Harvey, Halsey, 27, Feminin, 21_07_2000, 56677854, halsey7harvey@gmail.com, Seoul, Medecin");
            strow.add("6, Zyt, Aann, 26, Feminin, 21_12_1999, 34900076, anastasia11@gmail.com, Koweit, Medecin");
            strow.add("7, Hann, Sully, 26, Feminin, 21_12_1945, 45234573, hann78sully@gmail.com, Beyrouth, Medecin");
            strow.add("8, Freudicth, Zeyna, 26, Feminin, 18_09_2001, 89730990, zeyna67freudicth@gmail.com, Seoul, Medecin");
            strow.add("9, Gailto, Kagami, 26, Feminin, 21_12_1999, 34900076, anastasia11@gmail.com, Singapour, Infirmier");
        }
    }
    // Import : select * from default
    public void showTable() {
        defaultable.clear();    // Clearin' surely data
        try (BufferedReader tableCSV = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = tableCSV.readLine()) != null) {
                String[] partrow = line.split(",");
                defaultable.add(partrow);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.fileName = "";
    }
    // Export : insert into table default
    public void addToTable() {
        addRow();
        try (BufferedWriter tableCSV = new BufferedWriter(new FileWriter(fileName))) {
            for (int index = 0; index < strow.size(); index++) {
                tableCSV.write(strow.get(index));
                tableCSV.newLine();
            }
            System.out.println(" Données exportées vers '"+ fileName +"'");
            strow.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}


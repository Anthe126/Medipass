package medipass.system;
// --

import java.util.Scanner;


public class MedSystem {
    // Short Main logics

    // Methods
    // Main medical System Logyc
    public void runMedSystem() {
        System.out.println(" Hello people \n THere is the Medipass System \n "+
            " A qui est-je affaire l'honneur ? "
        );
        try (Scanner scann = new Scanner(System.in)) {
            String indvResponse = scann.nextLine();
            switch (indvResponse) {
                case "Administrateur":
                    runAdminSession();
                    break;
                case "Utilisateur":
                    runUsersSession();
                    break;
                case "Patient":// Patient
                    System.out.println(" Vous etes un Patients ! ");
                    runNatPatientSession();
                    break;
                default:
                    break;
            }
        }
    }
    // Administrator Menu
    public void runAdminSession() {
        try (Scanner scann = new Scanner(System.in)) {
            //
            System.out.println(" ________System Admin Session_________  ");
            System.out.println(" Que voulez-vous faire ? \n"+
                "\t _______Admin___Menu_______\n "+
                "A : Ajouter un utilisateur (Création de comptes) \n"+
                "B : Gérer les droits d'accès \n"+
                "C : Afficher les Statistiques du système \n"+
                "Q : quit (q) \n"+
                " A || B || C || q \n"
            );
            
            Administrateur admin = new Administrateur();
            String adminResponse = scann.nextLine();
            switch (adminResponse) {
                case "A":
                    admin.creer_compte();
                    break;
                case "B":
                    admin.gerer_acces();
                    runAdminSession();  // Return
                    break;
                case "C":
                    admin.afficher_statistiques();
                    runAdminSession();  // Return
                    break;
                case "q":
                    System.out.println(" Gettin' out of Menu \n ");
                    break;
                default:
                    break;
            }
            if ((adminResponse == "A") ||
                (adminResponse == "B") ||
                (adminResponse == "C")) 
                runAdminSession();
            else 
                runMedSystem();
        }
    }
    // Patients followin'
    public void runNatPatientSession() {
        // To add some Patients
        SystemDB medDB = new SystemDB(true, false);
        medDB.addToTable();
        medDB.showTable();
        // Continue ...
        System.out.println(" ________End________ \n");
    }
    // Categories of Users Actin'
    public void runUsersSession() {
        try (Scanner scann = new Scanner(System.in)) {
            String userResponses;
            //
            System.out.println(" In which categorie of proUser are you ? [Medecin, Infirmier, Pharmacien] ");
            userResponses = scann.nextLine();
            //
            switch (userResponses) {
                case "Medecin":
                    System.out.println(" Medecin Menu \n");
                    break;
                case "Infirmier":
                    System.out.println(" Infirmier Menu \n");
                    break;
                case "Pharmacien":
                    System.out.println(" Pharmacien Menu \n");
                    break;
                default:
                    break;
            }
        }
    }
    //public void runSysDB() { }
    // *** Scanner problems's solution //handler
    // call this once at program exit to release the scanner
    // public static void closeSharedScanner() { STDIN.close(); }
    // or
    // Use : try (Scanner ... = new ...) {}
}


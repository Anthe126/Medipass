package Medipass.admin;

import Medipass.SystemeMedipass;
import Medipass.utilisateur.Utilisateur;
import java.util.Scanner;

public class Administrateur extends Utilisateur {
    private SystemeMedipass systeme;

    // Constructeur
    public Administrateur(String id, String nom, String prenom, String email,
                          String numero_de_telephone, String date_de_naissance,
                          String adresse, String motDePasse, SystemeMedipass systeme) {
        super(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, motDePasse);
        this.systeme = systeme;
    }

    public Administrateur(){}

    //public Administrateur(){}


    // CRÉATION UTILISATEUR
    public void creerMedecin() {
        if (!SystemeMedipass.connecterAdmin()) {
            System.out.println("Accès refusé. Connexion administrateur requise.");
            return;
        }

        System.out.println("=== CRÉATION DE COMPTE PAR ADMINISTRATEUR ===");

        //  APPEL à la méthode qui existe DÉJÀ dans SystemeMedipass
        systeme.ajouter_medecin();

        System.out.println("✅ Compte créé avec succès par l'administrateur!");
    }

    public void creerInfirmier() {
        if (!SystemeMedipass.connecterAdmin()) {
            System.out.println("Accès refusé. Connexion administrateur requise.");
            return;
        }

        System.out.println("=== CRÉATION DE COMPTE PAR ADMINISTRATEUR ===");

        //  APPEL à la méthode qui existe DÉJÀ dans SystemeMedipass
        systeme.ajouter_infirmier();

        System.out.println("✅ Compte créé avec succès par l'administrateur!");
    }

    public void creerPharmacien() {
        if (!SystemeMedipass.connecterAdmin()) {
            System.out.println("Accès refusé. Connexion administrateur requise.");
            return;
        }

        System.out.println("=== CRÉATION DE COMPTE PAR ADMINISTRATEUR ===");

        //  APPEL à la méthode qui existe DÉJÀ dans SystemeMedipass
        systeme.ajouter_pharmacien();

        System.out.println("✅ Compte créé avec succès par l'administrateur!");
    }

    //  AUTRES FONCTIONNALITÉS ADMIN
    public void listerTousLesUtilisateurs() {
        if (!SystemeMedipass.connecterAdmin()) return;

        System.out.println("=== LISTE DES UTILISATEURS ===");
        // Logique spécifique à l'admin pour lister les users
    }

    public void reinitialiserMotDePasseUtilisateur() {
        if (!SystemeMedipass.connecterAdmin()) return;

        Scanner sc = new Scanner(System.in);
        System.out.println("Identifiant de l'utilisateur : ");
        String identifiant = sc.nextLine().trim();

        // Logique spécifique de réinitialisation
        System.out.println("Mot de passe réinitialisé pour: " + identifiant);
    }
    public void creer_compte_admin(){
        SystemeMedipass.creer_admin();
    }
    public void afficherHistorique() {
        if (!SystemeMedipass.connecterAdmin()) return;
        SystemeMedipass.listageHistorique();
    }
}
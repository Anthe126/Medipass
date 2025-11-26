package Medipass;
import Medipass.dossier.Ordonnance;
import Medipass.patient.Patient;
import Medipass.utilisateur.Infirmier;
import Medipass.utilisateur.Medecin;
import Medipass.utilisateur.Pharmacien;
import Medipass.utilisateur.Utilisateur;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class SystemeMedipass {

    private static ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<String> historique = new ArrayList<>();
    private static ArrayList<String> prescriptions = new ArrayList<>();
    private static int dernierIdUtilisateur = 0;
    private static final String IDENTIFIANT_ADMIN = "admin";
    private static final String MOT_DE_PASSE_ADMIN = "admin123";
    private boolean disponbilite;
    private static ArrayList<Ordonnance> ordonnances = new ArrayList<>();
    private static int dernierIdOrdonnance = 0;

    // Méthode creer compte pour les pros de sante

    //Medecin
    public void ajouter_medecin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRÉATION DE COMPTE MÉDIPASS ===");

        // Informations personnelles
        System.out.println("Veuillez saisir votre nom : ");
        String nom = sc.nextLine().trim();
        while (nom.isEmpty()) {
            System.out.println("Le nom est obligatoire : ");
            nom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre prénom : ");
        String prenom = sc.nextLine().trim();
        while (prenom.isEmpty()) {
            System.out.println("Le prénom est obligatoire : ");
            prenom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre email : ");
        String email = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre specialite : ");
        String specialite = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre numéro de téléphone : ");
        String numero_de_telephone = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre adresse : ");
        String adresse = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre date de naissance : ");
        String date_de_naissance = sc.nextLine().trim();

        //  Génération AUTOMATIQUE de l'identifiant
        String id = genererIdMedical(nom, prenom);

        // Mot de passe avec confirmation
        System.out.println("Veuillez saisir votre mot de passe : ");
        String motDePasse = sc.nextLine().trim();

        System.out.println("Veuillez confirmer votre mot de passe : ");
        String confirmation = sc.nextLine().trim();

        while (!motDePasse.equals(confirmation)) {
            System.out.println("Les mots de passe ne correspondent pas !");
            System.out.println("Veuillez saisir votre mot de passe : ");
            motDePasse = sc.nextLine().trim();
            System.out.println("Veuillez confirmer votre mot de passe : ");
            confirmation = sc.nextLine().trim();
        }

        Medecin u = new Medecin(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse,specialite, disponbilite, motDePasse);
        utilisateurs.add(u);
        System.out.println(" Compte utilisateur créé avec succès !");
        System.out.println(" Nom : " + u.getPrenom() + " " + u.getNom());
        System.out.println(" Votre identifiant : " + u.getId());
        historique.add(" Compte de medecin cree pour "+ u.getPrenom() + " " + u.getNom()+" identifiant : " + u.getId());
    }

    //creer compte pour infirmier
    public void ajouter_infirmier() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRÉATION DE COMPTE MÉDIPASS ===");

        // Informations personnelles
        System.out.println("Veuillez saisir votre nom : ");
        String nom = sc.nextLine().trim();
        while (nom.isEmpty()) {
            System.out.println("Le nom est obligatoire : ");
            nom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre prénom : ");
        String prenom = sc.nextLine().trim();
        while (prenom.isEmpty()) {
            System.out.println("Le prénom est obligatoire : ");
            prenom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre email : ");
        String email = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre specialite : ");
        String specialite = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre numéro de téléphone : ");
        String numero_de_telephone = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre adresse : ");
        String adresse = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre date de naissance : ");
        String date_de_naissance = sc.nextLine().trim();

        //  Génération AUTOMATIQUE de l'identifiant
        String id = genererIdMedical(nom, prenom);

        // Mot de passe avec confirmation
        System.out.println("Veuillez saisir votre mot de passe : ");
        String motDePasse = sc.nextLine().trim();

        System.out.println("Veuillez confirmer votre mot de passe : ");
        String confirmation = sc.nextLine().trim();

        while (!motDePasse.equals(confirmation)) {
            System.out.println("Les mots de passe ne correspondent pas !");
            System.out.println("Veuillez saisir votre mot de passe : ");
            motDePasse = sc.nextLine().trim();
            System.out.println("Veuillez confirmer votre mot de passe : ");
            confirmation = sc.nextLine().trim();
        }

        Infirmier u = new Infirmier(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, specialite, disponbilite, motDePasse);
        utilisateurs.add(u);
        System.out.println(" Compte utilisateur créé avec succès !");
        System.out.println(" Nom : " + u.getPrenom() + " " + u.getNom());
        System.out.println(" Votre identifiant : " + u.getId());
        historique.add(" Compte d'infirmier cree pour "+ u.getPrenom() + " " + u.getNom()+" identifiant : " + u.getId());
    }

    //creer compte pour le pharmacien

    public void ajouter_pharmacien() {
        Scanner sc = new Scanner(System.in);
        String specialite = "";

        System.out.println("=== CRÉATION DE COMPTE MÉDIPASS ===");

        // Informations personnelles
        System.out.println("Veuillez saisir votre nom : ");
        String nom = sc.nextLine().trim();
        while (nom.isEmpty()) {
            System.out.println("Le nom est obligatoire : ");
            nom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre prénom : ");
        String prenom = sc.nextLine().trim();
        while (prenom.isEmpty()) {
            System.out.println("Le prénom est obligatoire : ");
            prenom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre email : ");
        String email = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre numéro de téléphone : ");
        String numero_de_telephone = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre adresse : ");
        String adresse = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre date de naissance : ");
        String date_de_naissance = sc.nextLine().trim();

        //  Génération AUTOMATIQUE de l'identifiant
        String id = genererIdMedical(nom, prenom);

        // Mot de passe avec confirmation
        System.out.println("Veuillez saisir votre mot de passe : ");
        String motDePasse = sc.nextLine().trim();

        System.out.println("Veuillez confirmer votre mot de passe : ");
        String confirmation = sc.nextLine().trim();

        while (!motDePasse.equals(confirmation)) {
            System.out.println("Les mots de passe ne correspondent pas !");
            System.out.println("Veuillez saisir votre mot de passe : ");
            motDePasse = sc.nextLine().trim();
            System.out.println("Veuillez confirmer votre mot de passe : ");
            confirmation = sc.nextLine().trim();
        }

        Pharmacien u = new Pharmacien(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, specialite, motDePasse);
        utilisateurs.add(u);
        System.out.println(" Compte utilisateur créé avec succès !");
        System.out.println(" Nom : " + u.getPrenom() + " " + u.getNom());
        System.out.println(" Votre identifiant : " + u.getId());
        historique.add(" Compte utilisateur cree pour "+ u.getPrenom() + " " + u.getNom()+" identifiant : " + u.getId());
    }

        //  MÉTHODE DE GÉNÉRATION D'IDENTIFIANT
        private static String genererIdMedical(String nom, String prenom) {
            dernierIdUtilisateur++;

            // Nettoyer le nom (enlever accents, espaces)
            String nomPropre = nettoyerChaine(nom);
            String prenomPropre = nettoyerChaine(prenom);

            // Prendre les 4 premières lettres du nom (ou moins)
            String partieNom = nomPropre.length() >= 4 ?
                    nomPropre.substring(0, 4).toUpperCase() :
                    nomPropre.toUpperCase();

            // Prendre la première lettre du prénom
            String initialePrenom = prenomPropre.substring(0, 1).toUpperCase();

            // Formater l'ID sur 3 chiffres
            String idFormatte = String.format("%03d", dernierIdUtilisateur);

            return  ("MED_" + partieNom + "_" + initialePrenom + "_" + idFormatte);
        }

        // Méthode pour nettoyer les chaînes (enlever accents, espaces)
        private static String nettoyerChaine(String chaine) {
            return chaine
                    .toLowerCase()
                    .replaceAll("[éèêë]", "e")
                    .replaceAll("[àâä]", "a")
                    .replaceAll("[îï]", "i")
                    .replaceAll("[ôö]", "o")
                    .replaceAll("[ùûü]", "u")
                    .replaceAll("[ç]", "c")
                    .replaceAll("[^a-z]", ""); // Garder seulement les lettres
        }

        //creer un compte admin

        public static void creer_admin(){
            Scanner sc = new Scanner(System.in);

            System.out.println("=== CRÉATION DE COMPTE MÉDIPASS POUR L'ADMIN ===");

            // Informations personnelles
            System.out.println("Veuillez saisir votre nom : ");
            String nom = sc.nextLine().trim();
            while (nom.isEmpty()) {
                System.out.println("Le nom est obligatoire : ");
                nom = sc.nextLine().trim();
            }

            System.out.println("Veuillez saisir votre prénom : ");
            String prenom = sc.nextLine().trim();
            while (prenom.isEmpty()) {
                System.out.println("Le prénom est obligatoire : ");
                prenom = sc.nextLine().trim();
            }

            System.out.println("Veuillez saisir votre email : ");
            String email = sc.nextLine().trim();

            System.out.println("Veuillez saisir votre numéro de téléphone : ");
            String numero_de_telephone = sc.nextLine().trim();

            System.out.println("Veuillez saisir votre adresse : ");
            String adresse = sc.nextLine().trim();

            System.out.println("Veuillez saisir votre date de naissance : ");
            String date_de_naissance = sc.nextLine().trim();

            String id = IDENTIFIANT_ADMIN;


            String motDePasse = MOT_DE_PASSE_ADMIN;


            Utilisateur u = new Utilisateur(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, motDePasse);
            utilisateurs.add(u);
            System.out.println(" Compte créé avec succès !");
            System.out.println(" Nom : " + u.getPrenom() + " " + u.getNom());
            System.out.println(" Votre identifiant : " + id);
            historique.add(" Compte administrateur créé  pour "+ u.getPrenom() + " " + u.getNom());
        }


    //  CONNEXION ADMIN
    public static boolean connecterAdmin() {
        Scanner sc = new Scanner(System.in);



        System.out.println("=== CONNEXION ADMINISTRATEUR ===");
        System.out.println("Identifiant admin : ");
        String identifiant = sc.nextLine().trim();

        System.out.println("Mot de passe admin : ");
        String motDePasse = sc.nextLine().trim();

        if (identifiant.equals(IDENTIFIANT_ADMIN) && motDePasse.equals(MOT_DE_PASSE_ADMIN)) {
            System.out.println(" Connexion administrateur réussie!");
            historique.add("Connexion de l'administrateur");
            return true;
        } else {
            System.out.println(" Identifiant ou mot de passe administrateur incorrect");
            historique.add("Echec de connexion de l'administrateur");
            return false;
        }
    }
    //historique
    public static void listageHistorique() {
        System.out.println("=== HISTORIQUE DES ACTIONS ===");

        for (int i = 0; i < historique.size(); i++) {
            System.out.println((i + 1) + ". " + historique.get(i));
        }
    }
    //ajouter patient
    public static void ajouterPatient(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRÉATION DE PATIENT MÉDIPASS ===");

        // Informations personnelles
        System.out.println("Veuillez saisir votre nom : ");
        String nom = sc.nextLine().trim();
        while (nom.isEmpty()) {
            System.out.println("Le nom est obligatoire : ");
            nom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre prénom : ");
        String prenom = sc.nextLine().trim();
        while (prenom.isEmpty()) {
            System.out.println("Le prénom est obligatoire : ");
            prenom = sc.nextLine().trim();
        }

        System.out.println("Veuillez saisir votre email : ");
        String email = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre numéro de téléphone : ");
        String numero_de_telephone = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre adresse : ");
        String adresse = sc.nextLine().trim();

        System.out.println("Veuillez saisir votre date de naissance : ");
        String date_de_naissance = sc.nextLine().trim();

        System.out.println("Veuillez Entrer votre sexe (M pour masculin et F pour feminin : ");
        String sexe = sc.nextLine().trim().toUpperCase();
        do {
            if (!sexe.equals("M") && !sexe.equals("F")) {
                System.out.println("Erreur : vous devez entrer M ou F :");
                sexe = sc.nextLine().trim().toUpperCase();
            }

        } while (!sexe.equals("M") && !sexe.equals("F"));

        //  Génération AUTOMATIQUE de l'identifiant
        String id = genererIdMedical(nom, prenom);

        Patient p = new Patient(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, sexe);
        patients.add(p);
        System.out.println(" Compte utilisateur créé avec succès !");
        System.out.println(" Nom : " + p.getPrenom() + " " + p.getNom());
        System.out.println(" Votre identifiant : " + p.getId());
        historique.add(" Compte patient cree pour "+ p.getPrenom() + " " + p.getNom()+" identifiant : " + p.getId());
    }

    //methode pour la prescription des medocs
    public static  void prescrireMedicament(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuiller saisir vos prescriptions");
        String p = sc.nextLine();
        prescriptions.add(p);
    }

    // MÉTHODE COMPLÈTE DE PRESCRIPTION
    public static void prescrireMedicament(Utilisateur utilisateur) {
        // 🔐 VÉRIFICATION D'ACCÈS()
        //if (!verifierPermission(utilisateur, "PRESCRIRE_MEDICAMENT")) {
        //    System.out.println("❌ Seuls les médecins peuvent prescrire des médicaments");
        //    return;
        //}

        Scanner sc = new Scanner(System.in);

        System.out.println("=== PRESCRIPTION MÉDICALE ===");

        //  INFORMATION PATIENT
        System.out.println("ID du patient : ");
        String patientId = sc.nextLine().trim();

        // Vérifier que le patient existe
        if (!patientExiste(patientId)) {
            System.out.println(" Patient non trouvé");
            return;
        }

        //  CRÉATION ORDONNANCE
        dernierIdOrdonnance++;
        String ordonnanceId = "ORD_" + String.format("%04d", dernierIdOrdonnance);
        Ordonnance ordonnance = new Ordonnance(ordonnanceId, Utilisateur.getId(), patientId);

        // SAISIE DES MÉDICAMENTS
        boolean continuer = true;
        while (continuer) {
            System.out.println("\n--- Nouveau médicament ---");
            System.out.println("Nom du médicament : ");
            String medicament = sc.nextLine().trim();

            System.out.println("Posologie (ex: 1 comprimé 3 fois par jour) : ");
            String posologie = sc.nextLine().trim();

            // Ajouter à l'ordonnance
            ordonnance.ajouterMedicament(medicament, posologie);

            System.out.println("Ajouter un autre médicament ? (o/n)");
            String reponse = sc.nextLine().trim().toLowerCase();
            continuer = reponse.equals("o") || reponse.equals("oui");
        }

        // INSTRUCTIONS COMPLÉMENTAIRES
        System.out.println("Instructions complémentaires : ");
        String instructions = sc.nextLine().trim();

        System.out.println("Durée du traitement (en jours) : ");
        int duree = sc.nextInt();
        sc.nextLine(); // Vider buffer

        //  SAUVEGARDE
        ordonnances.add(ordonnance);
        historique.add("Ordonnance " + ordonnanceId + " prescrite par " + utilisateur.getNom() + " pour patient " + patientId);

        //  CONFIRMATION
        System.out.println(" Ordonnance créée avec succès !");
        System.out.println(" ID Ordonnance : " + ordonnanceId);
        System.out.println(" Patient : " + patientId);
        System.out.println(" Prescripteur : " + utilisateur.getNom());
        System.out.println(" Date : " + new Date());
    }

    //  VÉRIFIER SI LE PATIENT EXISTE
    private static boolean patientExiste(String patientId) {
        for (Utilisateur user : utilisateurs) {
            if (user.getId().equals(patientId)) {
                return true;
            }
        }
        return false;
    }

    //  MÉTHODE POUR CONSULTER LES ORDONNANCES
    public static void consulterOrdonnances(Utilisateur utilisateur) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONSULTATION DES ORDONNANCES ===");
        System.out.println("1. Ordonnance d'un patient (Medecin/Infirmier/)");
        System.out.println("2. Ordonnances que j'ai prescrites (Médecin)");
        //System.out.println("3. Toutes les ordonnances (Pharmacien/Ifirmier)");
        System.out.print("Choix : ");

        int choix = sc.nextInt();
        sc.nextLine();

        switch (choix) {
            case 1:
                // Patient voit ses propres ordonnances
                afficherOrdonnancesPatient(utilisateur.getId());
                break;
            case 2:
                // Médecin voit ses prescriptions

                    afficherOrdonnancesMedecin(utilisateur.getId());
                break;
            //case 3:
                // Admin/Pharmacien voit tout

                    //afficherToutesOrdonnances();
        }
    }

    //  AFFICHER ORDONNANCES D'UN PATIENT
    private static void afficherOrdonnancesPatient(String patientId) {
        System.out.println("=== MES ORDONNANCES ===");
        boolean trouve = false;

        for (Ordonnance ord : ordonnances) {
            if (ord.getPatientId().equals(patientId)) {
                afficherOrdonnance(ord);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucune ordonnance trouvée");
        }
    }

    // AFFICHER ORDONNANCES D'UN MÉDECIN
    private static void afficherOrdonnancesMedecin(String medecinId) {
        System.out.println("=== MES PRESCRIPTIONS ===");
        boolean trouve = false;

        for (Ordonnance ord : ordonnances) {
            if (ord.getMedecinId().equals(medecinId)) {
                afficherOrdonnance(ord);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucune prescription trouvée");
        }
    }

    //  AFFICHER TOUTES LES ORDONNANCES
    private static void afficherToutesOrdonnances() {
        System.out.println("=== TOUTES LES ORDONNANCES ===");
        if (ordonnances.isEmpty()) {
            System.out.println("Aucune ordonnance dans le système");
            return;
        }

        for (Ordonnance ord : ordonnances) {
            afficherOrdonnance(ord);
            System.out.println("-----------------------------");
        }
    }

    // AFFICHER UNE ORDONNANCE
    private static void afficherOrdonnance(Ordonnance ordonnance) {
        System.out.println(" Ordonnance: " + ordonnance.getId());
        System.out.println(" Patient: " + ordonnance.getPatientId());
        System.out.println(" Médecin: " + ordonnance.getMedecinId());
        System.out.println(" Date: " + ordonnance.getDatePrescription());
        System.out.println(" Médicaments:");

        for (String medicament : ordonnance.getMedicaments()) {
            System.out.println("  • " + medicament);
             }
        }

    public void ajouter_infos(){
        //besoi de dossier medical
    }


}






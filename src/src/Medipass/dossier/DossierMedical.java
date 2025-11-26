package Medipass.dossier;

import java.util.ArrayList;
import java.util.List;

public class DossierMedical {

    private int idDossier;
    private List<Consultation> consultations;
    private List<Antecedent> antecedents;
    private boolean archive;

    public DossierMedical(int idDossier) {
        this.idDossier = idDossier;
        this.consultations = new ArrayList<>();
        this.antecedents = new ArrayList<>();
        this.archive = false;
    }

    // Ajouter une consultation
    public void ajouterConsultation(Consultation c) {
        if (archive) {
            System.out.println("[ERREUR] Impossible d'ajouter : le dossier est archivé.");
            return;
        }
        consultations.add(c);
        System.out.println("[OK] Consultation ajoutée.");
    }

    // Ajouter un antécédent
    public void ajouterAntecedent(Antecedent a) {
        if (archive) {
            System.out.println("[ERREUR] Impossible d'ajouter : le dossier est archivé.");
            return;
        }
        antecedents.add(a);
        System.out.println("[OK] Antécédent ajouté.");
    }

    // Archiver
    public void archiver() {
        this.archive = true;
        System.out.println("[OK] Le dossier a été archivé.");
    }

    // Afficher le contenu du dossier en console
    public void afficherDossier() {
        System.out.println("\n===== DOSSIER MÉDICAL N°" + idDossier + " =====");

        System.out.println("\n--- Consultations ---");
        if (consultations.isEmpty()) {
            System.out.println("Aucune consultation.");
        } else {
            for (Consultation c : consultations) {
                System.out.println(c);
            }
        }

        System.out.println("\n--- Antécédents ---");
        if (antecedents.isEmpty()) {
            System.out.println("Aucun antécédent.");
        } else {
            for (Antecedent a : antecedents) {
                System.out.println(a);
            }
        }

        System.out.println("\nÉtat du dossier : " + (archive ? "ARCHIVÉ" : "ACTIF"));
        System.out.println("===== FIN =====\n");
    }
}

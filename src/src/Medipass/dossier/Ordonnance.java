package Medipass.dossier;

import java.util.Date;
import java.util.ArrayList;

public class Ordonnance {
    private String id;
    private String medecinId;
    private String patientId;
    private Date datePrescription;
    private ArrayList<String> medicaments;
    private String instructions;
    private int dureeTraitement; // en jours

    public Ordonnance(String id, String medecinId, String patientId) {
        this.id = id;
        this.medecinId = medecinId;
        this.patientId = patientId;
        this.datePrescription = new Date();
        this.medicaments = new ArrayList<>();
    }

    public Ordonnance(){

    }

    public void ajouterMedicament(String medicament, String posologie) {
        String prescription = medicament + " - " + posologie;
        medicaments.add(prescription);
    }

    // Getters...
    public String getId() { return id; }
    public String getMedecinId() { return medecinId; }
    public String getPatientId() { return patientId; }
    public ArrayList<String> getMedicaments() { return medicaments; }
    public Date getDatePrescription() { return datePrescription; }
}
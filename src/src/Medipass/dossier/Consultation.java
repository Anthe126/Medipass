package medipass.dossier;

import medipass.professionnel.Medecin;
import java.time.LocalDateTime;

public class Consultation {

    private final String idConsultation;
    private final String motif;
    private final String commentaire;
    private final LocalDateTime dateConsultation;
    private final Medecin medecin;   // Le médecin qui effectue la consultation

    public Consultation(String idConsultation, String motif, String commentaire, Medecin medecin) {

        if (medecin == null) {
            throw new IllegalArgumentException("Le médecin ne peut pas être null.");
        }

        if (!medecin.isDisponible()) {
            throw new IllegalStateException(
                    "Impossible de créer la consultation : le médecin "
                            + medecin.getNom() + " n'est pas disponible."
            );
        }

        this.idConsultation = idConsultation;
        this.motif = motif;
        this.commentaire = commentaire;
        this.medecin = medecin;
        this.dateConsultation = LocalDateTime.now();  // Auto timestamp

        // On occupe le médecin (important)
        medecin.setDisponible(false);
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public String getIdConsultation() {
        return idConsultation;
    }

    @Override
    public String toString() {
        return "\n--- Consultation ---" +
                "\nID : " + idConsultation +
                "\nMotif : " + motif +
                "\nCommentaire : " + commentaire +
                "\nDate : " + dateConsultation +
                "\nMédecin : " + medecin.getNom() +
                "\n--------------------";
    }
}

package medipass.users;
// --
import 

public class ProSante extends Utilisateur {
    // Attributes
    protected String specialite;
    protected boolean disponibilite;

    // Constructors
    public ProSante() {
        // init
        this.specialite = "ProDeSante";
        this.disponibilite = true;
    }
    public ProSante(String speciality, boolean disponibility) {
        this.specialite = speciality;
        this.disponibilite = disponibility;
    }

    // Specialite
    public void setSpecialite(String speciality) {
        if (speciality != null) {
            this.specialite = speciality;
        } else 
            setSpecialite(speciality);
    }
    public String getSpecialite() { return specialite; }
    //Disponibilite
    public void setDisponobilite(boolean disponibility) {
        this.disponibilite = disponibility;
    }
    public void getDisponibilite() { return disponibilite; }

    // Methods
    // Optionnel
    public boolean isDisponible(boolean disponibility) {
        //
        return true;
    }
}


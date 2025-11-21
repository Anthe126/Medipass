

public abstract class ProSante extends Utilisateur {

    // Attribute
    protected String specialite;
    // **** Is speciality : any; type
    // or speciality : {"Medecin", "Infirmier", "Pharmacien", ...} : list;
    // pour pourvoir faire un ' switch ... case ' entre les 
    // **** Au cas ou specialite serait nos trois héritiers, pourquoi ne pas utiliser comme 
    // une constante de listes 
    // ou faire un enum (comme je le fis avec la constante sexe ne pouvant etre que "Homme" ou "Femme")
    
    // erase all comments

    // Constructor
    public ProSante() {
        // init
    }
    public ProSante(String speciality) {
        this.specialite = speciality;
    }

    // Specialite
    public void setSpecialite(String speciality) {
        if (speciality != null) {
            this.specialite = speciality;
        } else 
            setSpecialite(speciality);
        
    }
    public String getSpecialite() { return specialite; }

    // Methods

    // Optionnel
    public boolean isDisponible() {
        // à modifier
        return true;
    }
    public ProSante(int idt , String login , String motDePasse){
    }
    @Override
    public void gererAcces(){
        System.out.println("Accès aux dossiers personnels et rendez-vous.");
    };
}


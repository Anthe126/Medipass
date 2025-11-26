package Medipass.patient;

public class Patient {
    //atributs
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String numero_de_telephone;
    private String date_de_naissance;
    private String adresse;
    private String sexe;

    //constrcteur

    public Patient(String id, String adresse, String date_de_naissance, String email, String nom, String numero_de_telephone, String prenom, String sexe) {
        this.adresse = adresse;
        this.date_de_naissance = date_de_naissance;
        this.email = email;
        this.nom = nom;
        this.numero_de_telephone = numero_de_telephone;
        this.prenom = prenom;
        this.sexe = sexe;
        this.id = id;
    }

    public Patient() {

    }
    //getteurs et setters

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {

        this.adresse = adresse;
    }

    public String getDate_de_naissance() {

        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {

        this.date_de_naissance = date_de_naissance;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getNumero_de_telephone() {

        return numero_de_telephone;
    }

    public void setNumero_de_telephone(String numero_de_telephone) {

        this.numero_de_telephone = numero_de_telephone;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String motDePasse) {
        this.sexe = motDePasse;
    }

}

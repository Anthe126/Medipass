package Medipass.utilisateur;

public abstract class ProDeSante extends Utilisateur {

    //attributs de pro de sante

    protected String specialite;


    //constructeur

    public ProDeSante(String id, String nom, String prenom, String email, String numero_de_telephone, String date_de_naissance, String adresse, String specialite,  String motDePasse) {
        super(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, motDePasse);
        this.specialite = specialite;
    }

    public ProDeSante(){

    }

    //setteur et getteur


    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

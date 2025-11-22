package Medipass.utilisateur;

import Medipass.SystemeMedipass;

public class Medecin extends ProDeSante{

    protected boolean disponibilite;

    public Medecin(String id, String nom, String prenom, String email, String numero_de_telephone, String date_de_naissance, String adresse, String specialite, boolean disponibilite, String motDePasse) {
        super(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, specialite,  motDePasse);

        this.disponibilite = disponibilite;

    }

    public Medecin(){

    }
    //getteur et setteur

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    //methodes specifiques
    public  void creerPatient(){
        SystemeMedipass.ajouterPatient();
    }

    public void prescrire() {
        SystemeMedipass.prescrireMedicament(this); // 'this' = l'utilisateur courant
    }

    public  void mesOrdonnances() {
        SystemeMedipass.consulterOrdonnances(this);
    }

    public void mettre_a_jour_dossier_medical(){
        //besoin du code de la classe dossier medical
    }

}

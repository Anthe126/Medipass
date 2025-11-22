package Medipass.utilisateur;

import Medipass.SystemeMedipass;

import java.security.SecureRandom;

public class Infirmier extends ProDeSante{

    protected boolean disponibilite;

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Infirmier(String id, String nom, String prenom, String email, String numero_de_telephone, String date_de_naissance, String adresse, String specialite, boolean disponibilite, String motDePasse) {
        super(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, specialite, motDePasse);

        this.disponibilite = disponibilite;


    }

    public Infirmier(){}


    public void consulterOrdonnances() {
        SystemeMedipass.consulterOrdonnances(this);
    }

    public void ajouter_infos(){
        //besoi de dossier medical
    }

}

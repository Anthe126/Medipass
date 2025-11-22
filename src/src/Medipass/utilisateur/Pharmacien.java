package Medipass.utilisateur;

import Medipass.SystemeMedipass;

public class Pharmacien extends ProDeSante {
    public Pharmacien(String id, String nom, String prenom, String email, String numero_de_telephone, String date_de_naissance, String adresse, String specialite,  String motDePasse) {
        super(id, nom, prenom, email, numero_de_telephone, date_de_naissance, adresse, specialite,  motDePasse);
    }

    public Pharmacien(){}


    public void consulterOrdonnances() {
        SystemeMedipass.consulterOrdonnances(this);
    }

    public void consulterAntecedants(){
        //besoin de la classe antecedant
    }
}

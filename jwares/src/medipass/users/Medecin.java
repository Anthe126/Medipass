package medipass.users;
// --
//import medipass.utils.MedDoss;


public class Medecin extends ProSante {

    // Constructors
    public Medecin() {
        // init
        System.out.println(" Medecin (partial Admin n°1) actin' \n");
    }

    // Methods
    // cat medDoss
    public void consulter(int index) {
        MedDoss dossierMedical = new MedDoss();
        System.out.println(" ___Dossier_Medical_Patient_n°"+index+"___\n"+
            " Consultations : "+ dossierMedical.getConsultation() +"\n"+
            " Examens : "+ dossierMedical.getExamens() +"\n"+
            " Antecedents : "+ dossierMedical.getAntecedent() +"\n"
        );
        // Invocation de la BD
    }
    // create medInfos
    public void addMedInfos() {
        setMedInfos();
        //
        // Invocation de la BD
        //SystemDB medDossDB = new SystemDB();
        //medDossDB.addToTable(fileName, Object);
    }
    // medDoss's update
    public void mettre_a_jour_dossier_medical() {
        setMedInfos();

        // Invocation de la BD
    }
    // set
    public void setMedInfos() {
        MedDoss dossierMedical = new MedDoss();
        //
        System.out.println(" Antecedent : ");
        dossierMedical.setAntecedents(0, new Antecedent());
        //
        System.out.println(" Examens : ");
        dossierMedical.setExamens(0, "new String[N]");
        //
        System.out.println(" Consultation : ");
        dossierMedical.setConsultations(0, new Consultation());
    }
    // prog ...
    public void programmer() {}
    // got medocs
    public void prescrire_medicament() {}
    //
}


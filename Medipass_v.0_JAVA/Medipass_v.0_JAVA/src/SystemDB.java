
// Centralisateur


public class SystemDB {

    // Attributes
    public Patient[] patients;
    //public Utilisateur[] users;
    
    // Constructor
    public SystemDB() {
        patients = null;
        // users = null;
    }
    public SystemDB(int nindv) {
        patients = new Patient[nindv];
        // users = new Utilisateur[nindv];
    }

    // Methods
    public void addPatient(int idt, Patient patient) {
        patients[idt] = patient;
        System.out.println(patients[idt].getId() + "\n" +patients[idt].getName() + "\n" + patients[idt].getPrenom() + "\n" + patients[idt].getAge() + "\n" + patients[idt].getSexe()+ "\n" +patients[idt].getNTel()+ "\n" +patients[idt].getEmail()+ "\n" +patients[idt].getAddress());
    }
    
    /*
    public void addUtilisateur(int ni, Utilisateur user) {
        users[idt] = user;
    }*/
    
}


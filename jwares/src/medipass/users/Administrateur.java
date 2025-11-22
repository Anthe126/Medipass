package medipass.users;
// --
import medipass.mod.Statistiques;


public class Administrateur extends Utilisateur {

    // Constructor
    public Administrateur() {
        // init
        System.out.println(" System Admin actin' (partial SuperUser) \n");
    }

    // Methods
    // Users accounts
    public void creer_compte() {
        SystemDB medDB = new SystemDB(false, true);
        // medDB.getIdentifiers();
        medDB.addToTable();
        medDB.showTable();
    }
    // Users Access Handler
    public void gerer_acces() {}
    // Statistiques
    public void afficher_statistiques() {
        Statistiques statqs = new Statistiques();
        statqs.cats();
    }
    // System Preccess (PID) Supervisation
    public void suivre_actions_system() {}
    //
}



//import java.time.format.DateTimeFormatter;


public class Patient {

    // Attribut
    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;
    protected Sexe sexe;
    //protected LocalDate date_naissance;
    protected long no_tel;
    protected String email;
    protected String addresse;

    // Constructor
    public Patient() {
        // init
    }
    public Patient(int idt, String name, String firstname, int yo, Sexe sex, /*LocalDate datePaN,*/ long phone_nb, String e_mail, String add_loc) {
        this.id = idt;
        this.nom = name;
        this.prenom = firstname;
        this.age = yo;
        this.sexe = sex;
        //this.date_naissance = datePaN;
        this.no_tel = phone_nb;
        this.email = e_mail;
        this.addresse = add_loc;
    }
    
    // Id
    public void setId(int idt) {
        this.id = idt;
    }
    public int getId() { return id; }

    // Nom
    public void setName(String name) {
        this.nom = name;
    }
    public String getName() {
        return nom;
    }

    // Prenom
    public void setPrenom(String firstname) {
        this.prenom = firstname;
    }
    public String getPrenom() { return prenom; }

    // Age
    public void setAge(int yo) {
        if (yo > 0) {
            this.age = yo;
        } else {
            setAge(yo);
        }
    }
    public int getAge() { return age; }

    // Sexe
    public void setSexe(Sexe sex) {
        this.sexe = sex;
    }
    public Sexe getSexe() { return sexe; }

    // Date
    /*
    public void setDate(LocalDate dateN) {
        this.date_naissance = dateN;
    }
    public LocalDate getDate() { return date_naissance; }*/

    // N_Tel
    public void setNTel(long phone_nb) {
        this.no_tel = phone_nb;
    }
    public long getNTel() { return no_tel; }

    // E_mail
    public void setEmail(String e_mail) {
        this.email = e_mail;
    }
    public String getEmail() { return email; }

    // Address
    public void setAddress(String add_loc) {
        this.addresse = add_loc;
    }
    public String getAddress() { return addresse; }
        
    //

    // Methods

    // *** None for Patient so this is just a test
    // don't know where to implements it.
    // *** Can be useful
    // *** Work in that case

    public void insc(int idt, String name, String firstname, int yo, Sexe sex,/* LocalDate dateNaP*/ long phone_nb, String e_mail, String add_loc) {
        // list
        int[] lidt = {0, 1, 2};
        String[] lname = {"Alice", "Bertrand", "Leonard"};
        String[] lfirstname = {"Alice", "Bertrand", "Leonard"};
        int[] lyo = {21, 8, 12};
        Sexe[] lsex = {Sexe.FEMALE, Sexe.MALE, Sexe.MALE};
        // LocalDate[] ldatePaN = { , , };
        long[] lphone_nb = {23245434, 87964532, 10987765};
        String[] le_mail = { "a1@gmail.com", "b2@gmail.com", "c3@gmail.com"};
        String[] ladd_loc = { "Bogota", "Gotham", "Venise"};
        //
        int np = lname.length;
        //
        System.out.println(" Nombre d'utilisateur à inscrire : " + np);
        //
        SystemDB patientdb = new SystemDB(np);    // PatientDB Initializer
        
        for (int idx=0; idx<np; idx++) {
            System.out.println("\t Identifier"+idx+" : ");
            // Creation
            Patient patient = new Patient(lidt[idx], lname[idx], lfirstname[idx], lyo[idx], lsex[idx]/*, dateNaP*/, lphone_nb[idx], le_mail[idx], ladd_loc[idx]);
            // Insertion
            patientdb.addPatient(idx, patient);  // Addded
            
        }

    }

}


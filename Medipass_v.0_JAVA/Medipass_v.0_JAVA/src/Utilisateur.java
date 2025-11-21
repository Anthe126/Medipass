
import java.time.LocalDate;



public abstract class Utilisateur {
    // Attribut
    protected int id;
    protected String login;
    protected String motDePasse;
    protected String nom;
    protected String prenom;
    protected int age;
    protected Sexe sexe;
    protected LocalDate date_naissance;
    protected long no_tel;
    protected String email;
    protected String addresse;

    // Constructor
    public Utilisateur() {
        // init
    }
    public Utilisateur(int idt, String login ,String motDePasse,String name, String firstname, int yo, Sexe sex, LocalDate dateN, long phone_nb, String e_mail, String add_loc) {
        this.id = idt;
        this.login=login;
        this.motDePasse=motDePasse;
        this.nom = name;
        this.prenom = firstname;
        this.age = yo;
        this.sexe = sex;
        this.date_naissance = dateN;
        this.no_tel = phone_nb;
        this.email = e_mail;
        this.addresse = add_loc;
    }

    
    // Id
    public void setId(int idt) {
        this.id = idt;
    }
    public int getId() { return id; }
    
    //login
    public void setlogin(String login) {
        this.login=login;
    }
    public String getlogin() {return login;}

    //Mot de passe 

    public void setmotDePasse( String motDePasse){
        this.motDePasse=motDePasse;
    }
    public String getmotDePasse() {return motDePasse;}

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
    public void setDate(LocalDate dateN) {
        this.date_naissance = dateN;
    }
    public LocalDate getDate() { return date_naissance; }

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
    
    // Methods
    public boolean authentifier(String login , String motDePasse) {
         return this.login.equals(login) && this.motDePasse.equals(motDePasse);
    }
    public abstract void gererAcces();
    
}


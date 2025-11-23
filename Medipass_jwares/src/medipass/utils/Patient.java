package medipass.utils;
// --
import java.time.*;


public class Patient {
    // Attributes
    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;
    protected String sexe;
    protected LocalDate date_naissance;
    protected long no_tel;
    protected String email;
    protected String addresse;

    // Constructor
    public Patient() {
        // init
    }
    public Patient(int idt,
        String name, String firstname,
        int yo, String sex, LocalDate datePaN,
        long phone_nb, String e_mail, String add_loc)
    {
        this.id = idt;
        this.nom = name;
        this.prenom = firstname;
        this.age = yo;
        this.sexe = sex;
        this.date_naissance = datePaN;
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
    public void setSexe(String sex) {
        this.sexe = sex;
    }
    public String getSexe() { return sexe; }

    // Date
    public void setDate(LocalDate datePaN) {
        this.date_naissance = datePaN;
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

    // Methods : None
}



// Short Main logics

import java.time.LocalDate;


public class MedSystem {

    // Attributes
    public int idt;
    public String name;
    public String firstname;
    public int yo;
    public Sexe sex;
    public LocalDate dateNaP;
    public long phone_nb;
    public String e_mail;
    public String add_loc;
    public Patient patient = new Patient();

    // Methods
    public void runInsc() {
        //
        patient.insc(idt, name, firstname, yo, sex,/* datePaN*/ phone_nb, e_mail, add_loc);
    }
}

// Systeme medical
// *** Constitué des attributs et methodes generales
// ** Ce fut une obligation



import java.time.LocalDate;


public class Consultation {

    // Attributes
    protected int id;
    protected LocalDate date;
    protected ProSante pro_de_sante;
    protected Patient patient;
    protected String motif;
    protected String[] observations;
    

    // Constructor
    public Consultation() {
        // init
    }
    public Consultation(int idt, LocalDate dateCon, ProSante prodesante, Patient souffrant, String reason, String obsv) {
        this.id = idt;
        this.date = dateCon;
        this.pro_de_sante = prodesante;
        this.patient = souffrant;
        this.motif = reason;
        this.observations[id] = obsv; // id or index:int
    }

    // Id
    public void setId(int idt) {
        this.id = idt;
    }
    public int getId() { return id; }

    // ProDeSante
    public void setProSante(ProSante prodesante) {
        this.pro_de_sante = prodesante;
    }
    public ProSante getProSante() { return pro_de_sante; }

    // Patient
    public void setPatient(Patient souffrant) {
        this.patient = souffrant;
    }
    public Patient getPatient() { return patient; }

    // Motif
    public void setMotif(String reason) {
        this.motif = reason;
    }
    public String getMotif() { return motif; }

    // Observations
    public void setObservations(String obsv) {
        //Scanner scann = new Scanner(System.in);
        //
        String[] obs = {"Retard", "Ecumé", "Incurabilite"};
        int nbob = obs.length;
        //
        System.out.println(" Nombre d'Observations notifiées : " + nbob);
        for (int ob=0; ob <nbob; ob++) {
            //obs = scann.nextln();
            observations[ob] = "*" + ob;
        }
    }
    public String[] getObservation() {
        return observations;
    }
    
    // Diagnostics
    // setter & getter

    // Traitements
    // setter & getter
}


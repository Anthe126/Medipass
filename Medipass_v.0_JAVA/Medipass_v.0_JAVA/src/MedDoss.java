

public class MedDoss {

    // Attributes
    protected int id;
    protected Consultation[] consultations;
    protected String[] examens;
    protected Antecedent[] antecedents;
    /*
    protected ;
    protected ;
    protected ;*/

    // Constructor
    public MedDoss() {
        // init
    }
    public MedDoss(int idt, Consultation consultation, String exams, Antecedent antecedent) {
        this.id = idt;
        this.consultations[idt] = consultation;    // id or index : fix it
        this.examens[idt] = exams;
        this.antecedents[idt] = antecedent;
    }

    // Id
    public void setId(int idt) {
        this.id = idt;
    }
    public int getId() { return id; }

    // Consultations
    public void setConsultations(int index, Consultation consultation) {
        this.consultations[index] = consultation;
    }
    public Consultation[] getConsultation() { return consultations; }
    
    // Examens
    public void setExamens(int index, String exams) {
        this.examens[index] = exams;
    }
    public String[] getExamens() { return examens; }

    // Antecedents
    public void setAntecedents(int index, Antecedent antecedent) {
        this.antecedents[index] = antecedent;
    }
    public Antecedent[] getAntecedent() { return antecedents; }

}


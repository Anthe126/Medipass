package medipass.utils;
// --

import java.util.*;


public class MedDoss {
    // Attributes
    protected int id;
    protected List<Consultation> consultations;
    // protected String[] examens;
    protected List<String> examens;
    protected List<Antecedent> antecedents;

    // Constructor
    public MedDoss() {
        // init
    }
    public MedDoss(int idt, Consultation consultation, String exams, Antecedent antecedent) {
        this.id = idt;
        this.consultations = new ArrayList<>();
        this.examens = new ArrayList<>();
        this.antecedents = new ArrayList<>();
    }

    // Id
    public void setId(int idt) {
        this.id = idt;
    }
    public int getId() { return id; }

    // Consultations
    public void setConsultations(int index, Consultation consultation) {
        // where
        this.consultations.add(consultation);
    }
    public List<Consultation> getConsultation() { return consultations; }
    
    // Examens
    public void setExamens(int index, String exams) {
        this.examens.add(exams);
    }
    public List<String> getExamens() { return examens; }

    // Antecedents
    public void setAntecedents(int index, Antecedent antecedent) {
        this.antecedents.add(antecedent);
    }
    public List<Antecedent> getAntecedent() { return antecedents; }

}


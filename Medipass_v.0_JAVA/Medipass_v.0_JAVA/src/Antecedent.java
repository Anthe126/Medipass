
import java.time.LocalDate;


public class Antecedent {

    // Attributes
    protected int id;
    protected String niveau_de_gravite;    // enum
    protected String description;
    protected LocalDate date;

    // Constructor
    public Antecedent() {
        // init
    }
    public Antecedent(int idt, String gravityLevel, String describe, LocalDate dateAn) {
        this.id = idt;
        this.niveau_de_gravite = gravityLevel;
        this.description = describe;
        this.date = dateAn;
    }

    // Id
    public void setId(int idt) {
        this.id = idt;
    }
    public int getId() { return id; }
    
    // Niveau_de_gravite
    public void setGravityLevel(String gravityLevel) {
        this.niveau_de_gravite = gravityLevel;
    }
    public String getGravityLevel() {
        return niveau_de_gravite;
    }

    // Description
    public void setDescription(String describe) {
        this.description = describe;
    }
    public String getDescription() {
        return description;
    }

    // Date
    public void setDateAn(LocalDate dateAn) {
        this.date = dateAn;
    }
    public LocalDate getDateAn() {
        return date;
    }

}


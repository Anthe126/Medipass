
// import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Scanner scann = new Scanner(System.in);

        MedSystem medSys = new MedSystem();
        medSys.runInsc();

        Consultation consultation = new Consultation();
        consultation.setObservations("AZERTY");
    }
}
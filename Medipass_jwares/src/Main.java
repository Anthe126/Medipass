// --
//import medipass.system.MedSystem;
//import medipass.system.ArchivesManager;


public class Main {
    public static void main(String[] args) {

        MedSystem medSys = new MedSystem();
        medSys.runMedSystem();

        ArchivesManager ArcM = new ArchivesManager();
        ArcM.ArchiveMedDoss("./medipass/db/TempFileMedDoss","./medipass/db/ArchivedMedDoss/Archives.zip");
        ArcM.RestoreMedDoss("./medipass/db/ArchivedMedDoss/Archives.zip","./medipass/db/RestoredMedDoss");
        // throws ---> error (IO)
    }

}

// Scanner problem solution
    // shared Scanner for the whole app (do not construct/close per-method)
    //private static final java.util.Scanner STDIN = new java.util.Scanner(System.in);

    // java.util.Scanner scann = STDIN;


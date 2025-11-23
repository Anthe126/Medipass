// on MedDoss
package medipass.system;
// --

import java.io.*;
//import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.*;


public class ArchivesManager {
    // Attributes
    // Dossier à Zipper
    public String FolderToZip = "../db/TempFileMedDoss";
    // fichierZip
    public String ZipFile = "../db/ArchivedMedDoss/Archives.zip";
    // Dossier de destination
    public String dossierDestination = "../db/RestoredMedDoss";

    // Constructor
    public ArchivesManager() {
        // init
    }

    // Methods

    // Archivages
    public void ArchiveMedDoss(String FolderToZip, String ZipFile) throws IOException {
        //
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(ZipFile))) {
            // Objet File pour le Dossier à archiver
            Path dossierPath = Paths.get(FolderToZip);
            // Parcours
            Files.walk(dossierPath).forEach(path -> {
                // Fichier cible
                String relativeFile = dossierPath.relativize(path).toString();
                try {
                    // Fichier cible -> Dossier : Enter
                    if (Files.isDirectory(path)) {
                        zos.putNextEntry(new ZipEntry(relativeFile + "/"));
                    } else {    // cible -> Files : Add
                        zos.putNextEntry(new ZipEntry(relativeFile));
                        Files.copy(path, zos);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
    
    // Restaurations
    public void RestoreMedDoss(String ZipFile, String dossierDestination) throws FileNotFoundException, IOException {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(ZipFile))) {
            ZipEntry entry;

            while ((entry = zis.getNextEntry()) != null) {
                // creation d'un fichier ou dossier pour chaque entées de l'archive
                File file = new File(dossierDestination, entry.getName());

                // case folder
                if (entry.isDirectory()) {
                    file.mkdirs();
                } else {    // case file
                    File dossierParent = file.getParentFile();
                    if (!dossierParent.exists()) {
                        dossierParent.mkdirs(); // autres dossiers Parents
                    }
                    // copie du contenu de File dans destination dossierDestination
                    try (FileOutputStream fosCreated = new FileOutputStream(file)) {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = zis.read(buffer)) > 0) {
                            fosCreated.write(buffer, 0, length);
                        }
                    }
                }
            }
        }
    }
}


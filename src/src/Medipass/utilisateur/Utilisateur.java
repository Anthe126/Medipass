package Medipass.utilisateur;

public  class Utilisateur {
    //attributs de le classe
    protected String nom;
    protected String prenom;
    protected String email;
    protected String numero_de_telephone;
    protected String date_de_naissance;
    protected String adresse;

    //pour la connexion

    private static String id;
    private String motDePasse;

    //constructeur

    public Utilisateur(String id, String nom, String prenom, String email,
                       String numero_de_telephone, String date_de_naissance,
                       String adresse, String motDePasse)  {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numero_de_telephone = numero_de_telephone;
        this.date_de_naissance = date_de_naissance;
        this.adresse = adresse;
        this.motDePasse = motDePasse;
    }

    public Utilisateur() {

    }

    //methodes


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {

        this.adresse = adresse;
    }

    public String getDate_de_naissance() {

        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {

        this.date_de_naissance = date_de_naissance;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public static String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getNumero_de_telephone() {

        return numero_de_telephone;
    }

    public void setNumero_de_telephone(String numero_de_telephone) {

        this.numero_de_telephone = numero_de_telephone;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
/*methode de recuperation des attributs de le classe
    public String recup_infos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veillez saisir votre nom :");
        nom = sc.next();
        System.out.println("Veillez saisir votre prenom :");
        prenom = sc.next();
        System.out.println("Veillez saisir votre email :");
        email = sc.next();
        System.out.println("Veillez saisir votre numero de telephone :");
        numero_de_telephone = sc.nextInt();
        System.out.println("Veillez saisir votre date de naisssance :");
        date_de_naissance = sc.next();
        System.out.println("Veillez saisir votre adresse : ");

        return ( "int"+" "+getNom()+", "+"int"+" "+getPrenom()+", "+"int"+" "+getEmail()+", " +"int"+" "+getNom()+", " +"int"+" "+getNumero_de_telephone()+", " +"int"+" "+getDate_de_naissance()+", " +"int"+" "+getAdresse()+", ");
    }*/

}

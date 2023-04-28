import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Etudiant extends Personne {
    // Variables servant de modèle à la place d'une base de données
    public static List<String> listeNiveau = new ArrayList<String>();
    public static List<String> listeFiliere = new ArrayList<String>();
    public static List<Object> listeEtudiants = new ArrayList<Object>();

    // A utiliser juste pour l'affichage
    public static int idEtudiant = 1;

    private String faculte = "";
    private String departement = "";
    private String filiere = "Informatique";
    private String niveauEtudes = "Licence 1";

    private Map<String, Float> modules_notes = new HashMap<>();

    public Etudiant(String faculte, String departement, String filiere, String niveauEtudes,
            Map<String, Float> modules_notes) {
        this.faculte = faculte;
        this.departement = departement;
        this.filiere = filiere;
        this.niveauEtudes = niveauEtudes;
        this.modules_notes = modules_notes;

        listeEtudiants.add(this);
    }

    public Etudiant(String nom, String prenom, int age, String faculte, String departement, String filiere,
            String niveauEtudes, Map<String, Float> modules_notes) {
        super(nom, prenom, age);
        this.faculte = faculte;
        this.departement = departement;
        this.filiere = filiere;
        this.niveauEtudes = niveauEtudes;
        this.modules_notes = modules_notes;

        listeEtudiants.add(this);
    }

    public Etudiant(String nom, String prenom, int age, String telephone, String mail, String faculte,
            String departement, String filiere, String niveauEtudes, Map<String, Float> modules_notes) {
        super(nom, prenom, age, telephone, mail);
        this.faculte = faculte;
        this.departement = departement;
        this.filiere = filiere;
        this.niveauEtudes = niveauEtudes;
        this.modules_notes = modules_notes;

        listeEtudiants.add(this);
    }

    public static int getIdEtudiant() {
        return idEtudiant;
    }

    public static void setIdEtudiant() {
        Etudiant.idEtudiant++;
    }

    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        if (listeFiliere.contains(filiere))
            this.filiere = filiere;
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Vous-vous ajouter cette filière ? O/N");
            char reponse = sc.next().charAt(0);
            if (reponse == 'O' || reponse == 'o')
                ajouterFiliere(filiere);
        }
    }

    public String getNiveauEtudes() {
        return niveauEtudes;
    }

    public void setNiveauEtudes(String niveauEtudes) {
        if (listeNiveau.contains(niveauEtudes))
            this.niveauEtudes = niveauEtudes;
    }

    public Map<String, Float> getModules_notes() {
        return modules_notes;
    }

    public void setModules_notes(Map<String, Float> modules_notes) {
        this.modules_notes = modules_notes;
    }

    public static void initialisationDonnees() {
        listeNiveau.add("Licence 1");
        listeNiveau.add("Licence 2");
        listeNiveau.add("Licence 3");
        listeNiveau.add("Master 1");
        listeNiveau.add("Master 2");

        listeFiliere.add("Informatique");
        listeFiliere.add("Electronique");
        listeFiliere.add("Medecine");
    }

    public void ajouterFiliere(String filiere) {
        listeFiliere.add(filiere);
    }

    public String toString() {
        String description = "~~~~ Etudiant N° : " + idEtudiant++ + " ~~~~\n................\n";
        description += "\tNom : " + this.getNom();
        description += "\n\tPrénom : " + this.getPrenom();
        description += "\n\tAffilié à la faculté : " + this.getFaculte() + ", Département : " + this.getDepartement();
        description += "\n\tFilière : " + this.filiere;
        description += "\n\tNiveau d'étude : " + this.niveauEtudes + "\n################\n";
        return description;
    }

    @Override
    public void descriptionPersonne() {
        System.out.println("\nListe des Etudiants : ");
        System.out.println(listeEtudiants.toString());
    }

}

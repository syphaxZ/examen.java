import java.util.ArrayList;
import java.util.List;

public class Enseignant extends Personne {
    public static int idEnseignant = 1;
    public static List<Object> listeEnseignants = new ArrayList<Object>();

    private String Grade = "docteur";
    private List<String> ModulesEnseignes = null;

    public Enseignant(String grade, List<String> modulesEnseignes) {
        Grade = grade;
        ModulesEnseignes = modulesEnseignes;

        listeEnseignants.add(this);
    }

    public Enseignant(String nom, String prenom, int age, String grade, List<String> modulesEnseignes) {
        super(nom, prenom, age);
        Grade = grade;
        ModulesEnseignes = modulesEnseignes;

        listeEnseignants.add(this);
    }

    public Enseignant(String nom, String prenom, int age, String telephone, String mail, String grade,
            List<String> modulesEnseignes) {
        super(nom, prenom, age, telephone, mail);
        Grade = grade;
        ModulesEnseignes = modulesEnseignes;

        listeEnseignants.add(this);
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public List<String> getModulesEnseignes() {
        return ModulesEnseignes;
    }

    public void setModulesEnseignes(List<String> modulesEnseignes) {
        ModulesEnseignes = modulesEnseignes;
    }

    public void ajouterModules(String module) {
        if (this.ModulesEnseignes == null)
            this.ModulesEnseignes = new ArrayList<String>();
        this.ModulesEnseignes.add(module);
    }

    public String toString() {
        String description = "~~~~ Enseignant N° : " + idEnseignant++ + " ~~~~\n................\n";
        description += "\tNom : " + this.getNom();
        description += "\n\tPrénom : " + this.getPrenom();
        description += "\n\tGrade : " + this.getGrade();
        description += "\n\tModules enseignés : " + this.getModulesEnseignes();
        description += "\n################\n";
        return description;
    }

    @Override
    public void descriptionPersonne() {
        System.out.println("\nListe des Enseignants : ");
        System.out.println(listeEnseignants.toString());
    }

}

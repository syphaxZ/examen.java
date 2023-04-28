
public class Main {

    public static void main(String[] args) {
        // Instanciation des étudiants et enseignants
        Etudiant etudiant1 = new Etudiant("ziani", "sifax", 34, "0689439244", "ziani.sifax@gmail.com",
                "Science exactes", "Informatique", "tehc inf et de l'infor", "Master 1", null);

        Etudiant etudiant2 = new Etudiant("ziani", "sifax", 34, "0689439244", "ziani.sifax@gmail.com",
                "Science exactes", "Informatique", "tehc inf et de l'infor", "Master 1", null);

        Enseignant enseignant1 = new Enseignant("Assouline", "amar", 35, "Docteur", null);
        // ajout de modules enseignés à l'enseignant1
        enseignant1.ajouterModules("java");

        // description de la liste des étudiants
        etudiant1.descriptionPersonne();

        // description de la liste des enseignants
        enseignant1.descriptionPersonne();
    }
}

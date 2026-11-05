import java.util.Scanner;

public class Etudiant {

    
    private String codeE;
    private String nom;
    private String classe;

    
    public Etudiant(String codeE, String nom, String classe) {
        this.codeE = codeE;
        this.nom = nom;
        this.classe = classe;
    }

    // Getters
    public String getCodeE() {
        return codeE;
    }

    public String getNom() {
        return nom;
    }

    public String getClasse() {
        return classe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le code de l'étudiant : ");
        String code = sc.nextLine();
        System.out.print("Entrer le nom : ");
        String nom = sc.nextLine();
        System.out.print("Entrer la classe : ");
        String classe = sc.nextLine();

        Etudiant e = new Etudiant(code, nom, classe);

        int choix;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Afficher le codeE");
            System.out.println("2 - Afficher le nom et la classe");
            System.out.println("3 - Quitter");
            System.out.print("Votre choix : ");

            
            while (!sc.hasNextInt()) {
                System.out.print("Entrée invalide, tapez 1, 2 ou 3 : ");
                sc.next();
            }
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("CodeE : " + e.getCodeE());
                    break;
                case 2:
                    System.out.println("Nom : " + e.getNom());
                    System.out.println("Classe : " + e.getClasse());
                    break;
                case 3:
                    System.out.println("salem 3alihom ");
                    break;
                default:
                    System.out.println("zid chof rou7k");
            }
        } while (choix != 3);

        sc.close();
    }
}
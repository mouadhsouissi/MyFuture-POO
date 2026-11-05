import java.util.Scanner;

public class produit {

    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    public produit(String reference, String designation,
                   double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    
    public void afficher() {
        System.out.println("Reference : " + reference);
        System.out.println("Designation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Quantite Stock : " + quantiteStock);
    }

    
    public void saisir(Scanner sc) {
        System.out.println("Donner la reference :");
        this.reference = sc.next();
        sc.nextLine(); // vider le retour a la ligne

        System.out.println("Donner la designation :");
        this.designation = sc.nextLine();

        System.out.println("Donner le prix HT :");
        this.prixHT = sc.nextDouble();

        System.out.println("Donner la quantite en stock :");
        this.quantiteStock = sc.nextInt();
    }

    
    public void ajouter(Scanner sc) {
        System.out.println("--- Ajout d'un produit ---");
        saisir(sc);
        System.out.println("Produit ajoute avec succes !");
    }

   
    public void modifier(String nouvelledesignation) {
        this.designation = nouvelledesignation;

    }
        public double calculerValeurStock() {
        return prixHT * quantiteStock;
    }
        public double appliquerRemise(double pourcentage) {
        return prixHT - (prixHT * pourcentage / 100);
    }
    


    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Donner la quantite en stock :");
        int quantite = sc.nextInt();

        System.out.println("Donner le prix HT :");
        double prixHT4 = sc.nextDouble();

        produit p = new produit("ref1", "ordinateur", 750.5, quantite);


        System.out.println("Valeur du stock : " + p.calculerValeurStock());
        System.out.println("Prix apres remise de 10% : "
                + p.appliquerRemise(10));


        int choix;

        do {

            System.out.println("MENu");
            System.out.println("1- Afficher les details du produit");
            System.out.println("2- Ajouter un produit");
            System.out.println("3- Modifier la des");
            System.out.println("4- Quitter");

            System.out.println("Donner votre choix :");
            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Produit p ");
                    p.afficher();
                    break;

                case 2:
                    p.ajouter(sc);
                    break;

                case 3:
                    System.out.println("Donner la nouvelle desg :");
                    String nouvelleDes = sc.next();
                    p.modifier(nouvelleDes);
                    System.out.println("Reference modifiee : "
                            + p.getDesignation());
                    break;

                case 4:
                    System.out.println("bye!");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 4);

        sc.close();
    }
}


public class AffichageDuJeu {

    public static void afficher(int[][] t){

        for (int i = 0; i < t.length; i++){
            for (int x = 0; x < t[i].length; x++){
                System.out.print("\t" + Couleur.prendreCouleur(t[i][x]) + t[i][x] + Couleur.RESET + " ");
            }
            System.out.println("\t");
        }

    }


    public static void afficherQuatreD(int[][][] grilles){

        System.out.println();

        // Afficher Tableau 1 et 2 côte à côte
        for (int ligne = 0; ligne < 2; ligne++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(Couleur.prendreCouleur(grilles[0][ligne][col]) + grilles[0][ligne][col] + Couleur.RESET + " ");
            }
            System.out.print("\t\t");
            for (int col = 0; col < 2; col++) {
                System.out.print(Couleur.prendreCouleur(grilles[1][ligne][col]) + grilles[1][ligne][col] + Couleur.RESET + " ");
            }
            System.out.println();
        }

        System.out.println();


        // Afficher Tableau 3 et 4 côte à côte
        for (int ligne = 0; ligne < 2; ligne++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(Couleur.prendreCouleur(grilles[2][ligne][col]) + grilles[2][ligne][col] + Couleur.RESET + " ");
            }
            System.out.print("\t\t");
            for (int col = 0; col < 2; col++) {
                System.out.print(Couleur.prendreCouleur(grilles[3][ligne][col]) + grilles[3][ligne][col] + Couleur.RESET + " ");
            }
            System.out.println();
        }
    }

}

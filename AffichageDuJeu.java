public class AffichageDuJeu {

    public static void afficher(int[][] t){

        for (int i = 0; i < t.length; i++){
            System.out.println("\t");
            for (int x = 0; x < t[i].length; x++){
                System.out.print("\t" + t[i][x]);
            }

        }

    }

    public static void afficherQuatreD(int[][][] grilles){

        System.out.println();

        // Afficher Tableau 1 et 2 côte à côte
        for (int ligne = 0; ligne < 2; ligne++) {
            // Tableau 1 (grilles[0])
            for (int col = 0; col < 2; col++) {
                System.out.print(grilles[0][ligne][col] + " ");
            }

            System.out.print("\t\t");

            // Tableau 2 (grilles[1])
            for (int col = 0; col < 2; col++) {
                System.out.print(grilles[1][ligne][col] + " ");
            }
            System.out.println();
        }

        System.out.println();


        // Afficher Tableau 3 et 4 côte à côte
        for (int ligne = 0; ligne < 2; ligne++) {
            // Tableau 3 (grilles[2])
            for (int col = 0; col < 2; col++) {
                System.out.print(grilles[2][ligne][col] + " ");
            }

            System.out.print("\t\t");

            // Tableau 4 (grilles[3])
            for (int col = 0; col < 2; col++) {
                System.out.print(grilles[3][ligne][col] + " ");
            }
            System.out.println();
        }
    }

}

import java.util.Random;
import java.util.Scanner;

public class Grille {
    public static int[][] initialiserGrille (int nombreDuMode, int nombreDeValeurAjoutee) {


        int[][] tab = creerGrille(nombreDuMode);

        //ajoute deux valeur
        for (int i = 0; i < nombreDeValeurAjoutee; i++) {
            ajouterValeur(tab, nombreDuMode);
        }
        return tab;
    }

    public static int[][] creerGrille(int nombreDeCase){
        //Initialise le tableau à deux dimensions
        int[][] tab = new int[nombreDeCase][nombreDeCase];

        //remplissage
        for (int x = 0; x < tab.length; x++){
            for (int y = 0; y < tab[x].length; y++){
                tab[x][y] = 0;
            }
        }
        return tab;
    }

    public static void ajouterValeur (int[][] grille, int nombre) {

        Random rand = new Random();

        int x, y;

        do {
            x = rand.nextInt(nombre); // 0 à 3
            y = rand.nextInt(nombre);
        } while (grille[x][y] != 0 );
            grille[x][y] = (rand.nextInt(10) == 0) ? 4 : 2;
    }

    public static void ajouterValeurQuatreD (int[][][] grilles) {
        Random rand = new Random();

        int tableauChoisi = rand.nextInt(4);

        Grille.ajouterValeur(grilles[tableauChoisi], 2);
    }

    public static void deplacerGrille(int[][] grille, char direction, int nombreDeCase){


        switch (direction){
            case 'Z':
                deplacerVersHaut(grille);
                break;
            case 'Q':
                deplacerVersGauche(grille);
                break;
            case 'S':
                deplacerVersBas(grille, nombreDeCase);
                break;
            case 'D':
                deplacerVersDroite(grille, nombreDeCase);
                break;
            default:
                System.out.println("Caractères non pris en charge");
                //si l'utilisateur entre autre chose que Z Q S D
                break;
        }

    }

    private static void deplacerVersHaut(int[][] grille) {

        for (int ligne = 0; ligne < grille.length; ligne++){
            for (int colonne = 0; colonne < grille[ligne].length; colonne++){

                if (grille[ligne][colonne] != 0){

                    int valeur = grille[ligne][colonne];
                    int position = ligne;

                    while (position != 0 && (grille[position - 1][colonne] == 0 || grille[position - 1][colonne] == valeur)){

                        if (grille[position - 1][colonne] == valeur){

                            valeur*=2;
                            grille[position - 1][colonne] = valeur;
                            grille[position][colonne] = 0;
                            position--;


                            break;
                        } else {
                            grille[position - 1][colonne] = valeur;
                            grille[position][colonne] = 0;
                            position--;

                        }



                    }
                }

            }


        }

    }


    private static boolean deplacerVersGauche(int[][] grille) {

        boolean grilleChangee = false;



        for (int ligne = 0; ligne < grille.length; ligne++){
            for (int colonne = 0; colonne < grille[ligne].length; colonne++){

                if (grille[ligne][colonne] != 0){

                    int valeur = grille[ligne][colonne];

                    while (colonne != 0 && (grille[ligne][colonne - 1] == 0 || grille[ligne][colonne - 1] == valeur)){

                        if (grille[ligne][colonne - 1] == valeur){

                            valeur *=2;
                            grille[ligne][colonne - 1] = valeur;
                            grille[ligne][colonne] = 0;
                            colonne--;

                            break;
                        } else {

                            grille[ligne][colonne - 1] = valeur;
                            grille[ligne][colonne] = 0;
                            colonne--;
                        }



                    }
                }

            }


        }


        return false;
    }

    private static boolean deplacerVersBas(int[][] grille, int nombre) {
        boolean grilleChangee = false;

        for (int ligne = grille.length - 1; ligne >= 0; ligne--){
            for (int colonne = 0; colonne < grille[ligne].length; colonne++){

                if (grille[ligne][colonne] != 0){

                    int valeur = grille[ligne][colonne];


                    while (ligne != (nombre-1) && (grille[ligne + 1 ][colonne] == 0 || grille[ligne + 1 ][colonne] == valeur)){

                        if (grille[ligne + 1 ][colonne] == valeur){


                            valeur *=2;
                            grille[ligne + 1 ][colonne] = valeur;
                            grille[ligne][colonne] = 0;
                            ligne++;


                            break;

                        } else {
                            grille[ligne + 1 ][colonne] = valeur;
                            grille[ligne][colonne] = 0;
                            ligne++;
                        }



                    }
                }

            }
        }


        return grilleChangee;
    }

    private static boolean deplacerVersDroite(int[][] grille, int nombre) {
        boolean grillechangee = false;

        for (int ligne = grille.length - 1; ligne >= 0; ligne--){
            for (int colonne = grille[ligne].length - 1; colonne >= 0; colonne--){

                if (grille[ligne][colonne] != 0){

                    int valeur = grille[ligne][colonne];


                    while (colonne != (nombre-1) && (grille[ligne][colonne + 1] == 0 || grille[ligne][colonne + 1] == valeur)){

                        if (grille[ligne][colonne + 1] == valeur){

                            valeur *=2;
                            grille[ligne][colonne + 1] = valeur;
                            grille[ligne][colonne] = 0;
                            colonne++;
                            //On ajoute le break pour éviter les fusions directes des valeurs
                            break;

                        } else {

                            grille[ligne][colonne + 1] = valeur;
                            grille[ligne][colonne] = 0;
                            colonne++;

                        }



                    }
                }

            }
        }


        return grillechangee;
    }

}

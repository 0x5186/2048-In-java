import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    public void testCreerGrille() {

        int[][] grille = Grille.creerGrille(4); //Initialise grille

        assertEquals(4, grille.length); //On s'assure que la grille comporte bien 4 lignes
        assertEquals(4, grille[0].length); //Verifie si la 1er ligne à 4 colonnes
        assertEquals(0, grille[0][0]); //verifie que toutes les valeurs sont égales à 0.


    }

    @Test
    public void testAjouterValeur() {

        int[][] grille = Grille.creerGrille(4);

        Grille.ajouterValeur(grille, 4);  //On ajoute une valeur, 2 ou 4.

        boolean ValeurTrouvee = false; //Pour l'instant, on a trouvé aucune valeur

        for (int x = 0; x < grille.length; x++){ //On parcour le tableau (ligne)
            for (int y = 0; y < grille[x].length; y++){ //colonne
                if (grille[x][y] != 0){ // Si la valeur différente de 0.
                    ValeurTrouvee = true; //Valeur trouvée
                    assertTrue(grille[x][y] == 2 || grille[x][y] == 4); //On s'assure que les valeurs ajoutées sont 2 ou 4.

                }


            }

        }


    }

    @Test
    public void TestDeplacerGrille () {



        int[][] grille = {
                {0, 0, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };


        Grille.deplacerGrille(grille, 'D', 4);

        assertEquals(2 , grille[1][3]); //Verifie si la valeur 2 est bien dans la case la plus à droite
        assertEquals(0, grille[1][2]); //Verifie que la case initiale soit bien vide

        Grille.deplacerGrille(grille, 'Q', 4);

        assertEquals(2 , grille[1][0]);
        assertEquals(0, grille[1][3]);

        Grille.deplacerGrille(grille, 'Z', 4);

        assertEquals(2 , grille[0][0]);
        assertEquals(0, grille[1][0]);

        Grille.deplacerGrille(grille, 'S', 4);

        assertEquals(2, grille[3][0]);
        assertEquals(0, grille[0][0]);

    }

    @Test
    public void modeGrille4D () {

        int[][][] grille = new int[4][][];

        for (int i = 0; i < 4; i++){

            grille[i] = Grille.creerGrille(2);

        }

        assertEquals(4, grille.length); //verifie si il y a bien 4 tableaux indépendants
        assertEquals(2, grille[0].length); //verifie si il y a bien 2 lignes
        assertEquals(2, grille[0][0].length); //verifie si il y a bien 2 colonnes

    }
}

import java.util.Random;
import java.util.Scanner;

public class ModeDeJeu {
    public static void Classique (){
        Scanner tt = new Scanner(System.in);

        //Déclarer grille et appeler la méthode qui initalise le tableau
        int[][] grille = Grille.initialiserGrille(4,2);

        boolean JeuEncours = true;

        while (JeuEncours) {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║             Mode Classique             ║");
            System.out.println("╚════════════════════════════════════════╝");

            // Appeler méthode qui affiche le tableau
            AffichageDuJeu.afficher(grille);

            // Vérifier victoire
            if (Grille.contient2048(grille)) {
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                                        ║");
                System.out.println("║              Tu as gagné !             ║");
                System.out.println("║         Tu as atteint les 2048 !       ║");
                System.out.println("║                                        ║");
                System.out.println("╚════════════════════════════════════════╝");
                System.out.println();
                break;
            }


            System.out.println("\n\nChoisissez un mode de déplacement :\n");
            System.out.println("Z (Haut)");
            System.out.println("Q (Gauche)");
            System.out.println("S (Bas)");
            System.out.println("D (Droite)");
            System.out.println("Taper 5 pour quitter le mode de jeu.\n");
            System.out.print("\n➤ Entrez votre choix : ");

            char direction = tt.next().toUpperCase().charAt(0);

            Grille.deplacerGrille(grille, direction, 4);
            Grille.ajouterValeur(grille, 4);

            // Vérifier défaite
            if (!Grille.mouvementPossible(grille)) {
                // Afficher la grille finale
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║             Mode Classique             ║");
                System.out.println("╚════════════════════════════════════════╝");
                AffichageDuJeu.afficher(grille);


                // Message défaite
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║                                            ║");
                System.out.println("║        Tu as malheureusement perdu         ║");
                System.out.println("║            Mouvement impossible            ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.println();
                break;
            }

            if (direction == '5') {
                break;
            }
        }


    }

    public static void cinqFoisCinq (){
        Scanner tt = new Scanner(System.in);

        int[][] grille = Grille.initialiserGrille(5, 2);


        boolean JeuEnCours = true;

        while (JeuEnCours){

            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║                Mode 5x5                ║");
            System.out.println("╚════════════════════════════════════════╝");


            AffichageDuJeu.afficher(grille);

            // Vérifier victoire
            if (Grille.contient2048(grille)) {
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                                        ║");
                System.out.println("║              Tu as gagné !             ║");
                System.out.println("║         Tu as atteint les 2048 !       ║");
                System.out.println("║                                        ║");
                System.out.println("╚════════════════════════════════════════╝");
                System.out.println();
                break;
            }

            System.out.println("\n\nChoisissez un mode de déplacement :\n");
            System.out.println("Z (Haut)");
            System.out.println("Q (Gauche)");
            System.out.println("S (Bas)");
            System.out.println("D (Droite)");
            System.out.println("Taper 5 pour quitter le mode de jeu.\n");
            System.out.print("\n➤ Entrez votre choix : ");

            char direction = tt.next().toUpperCase().charAt(0);

            Grille.deplacerGrille(grille, direction, 5);

            Grille.ajouterValeur(grille, 5);

            // Vérifier défaite
            if (!Grille.mouvementPossible(grille)) {
                // Afficher la grille finale
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                Mode 5x5                ║");
                System.out.println("╚════════════════════════════════════════╝");
                AffichageDuJeu.afficher(grille);

                // Message défaite
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║                                            ║");
                System.out.println("║        Tu as malheureusement perdu         ║");
                System.out.println("║            Mouvement impossible            ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.println();
                break;
            }

            if (direction == '5'){
                break;
            }

        }

    }

    public static void huitFoisHuit () {
        Scanner tt = new Scanner(System.in);

        int[][] grille = Grille.initialiserGrille(8, 4);

        boolean JeuEnCours = true;

        while (JeuEnCours){

            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║                Mode 8x8                ║");
            System.out.println("╚════════════════════════════════════════╝");

            AffichageDuJeu.afficher(grille);

            // Vérifier victoire
            if (Grille.contient2048(grille)) {
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                                        ║");
                System.out.println("║              Tu as gagné !             ║");
                System.out.println("║         Tu as atteint les 2048 !       ║");
                System.out.println("║                                        ║");
                System.out.println("╚════════════════════════════════════════╝");
                System.out.println();
                break;
            }

            System.out.println("\n\nChoisissez un mode de déplacement :\n");
            System.out.println("Z (Haut)");
            System.out.println("Q (Gauche)");
            System.out.println("S (Bas)");
            System.out.println("D (Droite)");
            System.out.println("Taper 5 pour quitter le mode de jeu.\n");
            System.out.print("\n➤ Entrez votre choix : ");

            char direction = tt.next().toUpperCase().charAt(0);

            Grille.deplacerGrille(grille, direction, 8);
            Grille.ajouterValeur(grille, 8);

            // Vérifier défaite
            if (!Grille.mouvementPossible(grille)) {
                // Afficher la grille finale
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                Mode 8x8                ║");
                System.out.println("╚════════════════════════════════════════╝");
                AffichageDuJeu.afficher(grille);

                // Message défaite
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║                                            ║");
                System.out.println("║        Tu as malheureusement perdu         ║");
                System.out.println("║            Mouvement impossible            ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.println();
                break;
            }

            if (direction == '5'){
                break;
            }


        }




    }

    public static void quatreDimensions() {
        Scanner tt = new Scanner(System.in);

        int[][][] GrilleQuatre = new int[4][][];

        for (int i = 0; i < 4; i++){

            GrilleQuatre[i] = Grille.creerGrille(2);

        }

        Grille.ajouterValeurQuatreD(GrilleQuatre);
        Grille.ajouterValeurQuatreD(GrilleQuatre);

        boolean JeuEnCours = true;

        while (JeuEnCours){

            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║                 Mode 4D                ║");
            System.out.println("╚════════════════════════════════════════╝");

            AffichageDuJeu.afficherQuatreD(GrilleQuatre);

            // Vérifier victoire dans LES 4 GRILLES
            boolean victoire = false;
            for (int i = 0; i < 4; i++) {
                if (Grille.contient2048(GrilleQuatre[i])) {
                    victoire = true;
                    break;
                }
            }
            if (victoire) {
                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                                        ║");
                System.out.println("║              Tu as gagné !             ║");
                System.out.println("║         Tu as atteint les 2048 !       ║");
                System.out.println("║                                        ║");
                System.out.println("╚════════════════════════════════════════╝");
                System.out.println();
                break;
            }

            System.out.println("\n\nChoisissez un mode de déplacement :\n");
            System.out.println("Z (Haut)");
            System.out.println("Q (Gauche)");
            System.out.println("S (Bas)");
            System.out.println("D (Droite)");
            System.out.println("Taper 5 pour quitter le mode de jeu.\n");
            System.out.print("\n➤ Entrez votre choix : ");

            char direction = tt.next().toUpperCase().charAt(0);

            if (direction == '5') {
                break;
            }

            // Déplacer toutes les grilles avec la même direction
            for (int i = 0; i < 4; i++) {
                Grille.deplacerGrille(GrilleQuatre[i], direction, 2);
            }

            // Ajouter UNE seule valeur au total parmi les 4 grilles
            Grille.ajouterValeurQuatreD(GrilleQuatre);

            // Vérifier défaite dans TOUTES LES 4 GRILLES
            boolean defaite = true;
            for (int i = 0; i < 4; i++) {
                if (Grille.mouvementPossible(GrilleQuatre[i])) {
                    defaite = false; // Au moins une grille peut encore jouer
                    break;
                }
            }

            if (defaite) {
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║                 Mode 4D                ║");
                System.out.println("╚════════════════════════════════════════╝");
                AffichageDuJeu.afficherQuatreD(GrilleQuatre);

                System.out.println("\n");
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║                                            ║");
                System.out.println("║        Tu as malheureusement perdu         ║");
                System.out.println("║            Mouvement impossible            ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.println();
                break;
            }

        }

    }


}

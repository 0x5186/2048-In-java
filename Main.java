import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner tt = new Scanner(System.in);

        int LONGUEUR = 4;

        int[][] tableau_2048 = new int[LONGUEUR][LONGUEUR];


        // les types de choix de l'user
        int choixJoueur = 0;
        int choixMode = 0;

        do{
            System.out.println("\n");
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║                  2048                  ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println();
            System.out.println("  1.  Choisir le mode de Jeu");
            System.out.println("  2.  Les règles du jeu");
            System.out.println("  3.  Quitter le jeu");
            System.out.println();
            System.out.print("➤ Votre choix : ");

            choixJoueur = tt.nextInt();


            switch (choixJoueur){
                case 1:
                    do {
                        System.out.println("\n");
                        System.out.println("╔════════════════════════════════════════╗");
                        System.out.println("║              MODES DE JEU              ║");
                        System.out.println("╚════════════════════════════════════════╝");
                        System.out.println();
                        System.out.println("  1. Mode Classique (4x4)");
                        System.out.println("  2. Mode 5x5");
                        System.out.println("  3. Mode 8x8");
                        System.out.println("  4. Mode 4D (4 tableaux)");
                        System.out.println("  5. ⬅ Retour au menu");
                        System.out.println();
                        System.out.print("➤ Mode de jeu : ");

                        choixMode = tt.nextInt();

                        switch(choixMode) {
                            case 1:
                                //appeler le mode classique
                                ModeDeJeu.Classique();
                                break;
                            case 2:
                                //appeler le mode 5x5
                                ModeDeJeu.cinqFoisCinq();
                                break;
                            case 3:
                                //appeler le mode 8x8
                                ModeDeJeu.huitFoisHuit();
                                break;
                            case 4:
                                //appeler le mode 4D
                                ModeDeJeu.quatreDimensions();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("\n Choix incorrect");
                        }

                    } while (choixMode != 5);
                    break;
                case 2:
                    do {
                        System.out.println("\n");
                        System.out.println("╔════════════════════════════════════════╗");
                        System.out.println("║              RÈGLES DU JEU             ║");
                        System.out.println("╚════════════════════════════════════════╝");
                        System.out.println();
                        System.out.println("  Objectif : Atteindre la valeur 2048 !");
                        System.out.println();
                        System.out.println("     Commandes :");
                        System.out.println("     Z → Déplacer vers le HAUT");
                        System.out.println("     Q → Déplacer vers la GAUCHE");
                        System.out.println("     S → Déplacer vers le BAS");
                        System.out.println("     D → Déplacer vers la DROITE");
                        System.out.println();
                        System.out.println("     Principe :");
                        System.out.println("     • Les cases de même valeur fusionnent");
                        System.out.println("     • 2 + 2 = 4, 4 + 4 = 8, etc.");
                        System.out.println("     • Une nouvelle case avec une valeur apparaît après");
                        System.out.println("       chaque déplacement");
                        System.out.println();
                        System.out.println("  1. ⬅  Retour au menu");
                        System.out.println();
                        System.out.print("➤ Choix : ");
                        choixMode = tt.nextInt();
                    } while (choixMode != 1);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nSaisissez un choix correct");
            }

        } while (choixJoueur != 3);

        System.out.println("\n");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           Merci d'avoir joué           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        tt.close();
    }
}
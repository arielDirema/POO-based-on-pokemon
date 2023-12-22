package projetpokemon.actions;

import static projetpokemon.main.ProjetPokemon.listDesPokemons;
import static projetpokemon.main.ProjetPokemon.menu;

import java.util.Scanner;

import projetpokemon.cpts.Pokemon;
import projetpokemon.main.ProjetPokemon;

public class playGame {

    // METHODE PERMETTANT D'ATTAQUER UN POKEMON
    public static void attaquerPokemon() {
        Scanner scannerAttaquant = new Scanner(System.in);
        Scanner scannerAttaque = new Scanner(System.in);

        System.out.println(" ");
        if (listDesPokemons.isEmpty()) {
            System.out.println("\t\t\t\t###########  LISTE DE POKEMONS VIDE !!!  ###########");
            menu();
        } else if (listDesPokemons.size() == 1) {
            System.out.println("\t\t\t\t#  UN POKEMON NE PEUT PAS S'ATTAQUER LUI MÊME !!!  #");
            menu();
        } else {
            System.out.println("\t\t\t\t##############  BATAILLE DE POKEMONS  ##############");
            CreatePokemon.afficherPokemons();
            System.out.println(" ");
            System.out.print("\t\t\t\t   _*_ Entrez le nom du pokemon attaquant : ");
            String nomAttaquant = scannerAttaquant.nextLine();
            System.out.print("\t\t\t\t   _*_ Entrez le nom du pokemon attaqué : ");
            String nomAttaque = scannerAttaque.nextLine();

            System.out.println(" ");
            System.out.println("\t\t\t\t#######  STAT DES COMBATTANTS AVANT ATTAQUE  #######");
            System.out.println(" ");
            System.out.println("\t\t\t| NOM\t\t| TYPE\t    | HEALTH PTS  | ATTACK PTS  |POSITION   |");
            System.out.println("\t\t\t=====================================================================");

            System.out.printf("\t\t\t| %-14s| %-10s| %-12s| %-12s| ATTAQUANT |%n",
                    trouverPokemon(nomAttaquant).getNom(),
                    trouverPokemon(nomAttaquant).getType(), trouverPokemon(nomAttaquant).getHp(),
                    trouverPokemon(nomAttaquant).getAtk());

            System.out.printf("\t\t\t| %-14s| %-10s| %-12s| %-12s| ATTAQUE   |%n", trouverPokemon(nomAttaque).getNom(),
                    trouverPokemon(nomAttaque).getType(), trouverPokemon(nomAttaque).getHp(),
                    trouverPokemon(nomAttaque).getAtk());

            // AFFICHER L'ATTAQUE
            System.out.println(" ");
            System.out.println(
                    "\t\t\t\t############### " + trouverPokemon(nomAttaquant).getNom().toUpperCase() + " ATTAQUE "
                            + trouverPokemon(nomAttaque).getNom().toUpperCase() + "  ###############");

            trouverPokemon(nomAttaquant).attaquer(trouverPokemon(nomAttaque));

            System.out.println(" ");
            System.out.println("\t\t\t\t#######  STAT DES COMBATTANTS APRES ATTAQUE  #######");
            System.out.println(" ");
            System.out.println("\t\t\t| NOM\t\t| TYPE\t    | HEALTH PTS  | ATTACK PTS  |POSITION   |");
            System.out.println("\t\t\t=====================================================================");

            System.out.printf("\t\t\t| %-14s| %-10s| %-12s| %-12s| ATTAQUANT |%n",
                    trouverPokemon(nomAttaquant).getNom(),
                    trouverPokemon(nomAttaquant).getType(), trouverPokemon(nomAttaquant).getHp(),
                    trouverPokemon(nomAttaquant).getAtk());

            System.out.printf("\t\t\t| %-14s| %-10s| %-12s| %-12s| ATTAQUE   |%n", trouverPokemon(nomAttaque).getNom(),
                    trouverPokemon(nomAttaque).getType(), trouverPokemon(nomAttaque).getHp(),
                    trouverPokemon(nomAttaque).getAtk());

            menu();
        }
    }

    // METHODE PERMETTANT DE RENVOYER UN POKEMON A PARTIR DE SON NOM
    public static Pokemon trouverPokemon(String nom) {
        for (Pokemon p : ProjetPokemon.listDesPokemons) {
            if (p.getNom().equals(nom)) {
                return p;
            }
        }
        System.out.print("\\t\\t\\t\\t##########  ENTREZ DES NOMS DE POKEMON VALABLES  ##########");
        attaquerPokemon();
        return null;
    }
}

package projetpokemon.actions;

import projetpokemon.cpts.*;
import projetpokemon.main.ProjetPokemon;

import static projetpokemon.main.ProjetPokemon.menu;

import java.util.Scanner;

public class CreatePokemon {

    // METHODE PERMETTANT D'AFFICHER LA LISTE DE POKEMONS
    public static void afficherPokemons() {
        if (ProjetPokemon.listDesPokemons.isEmpty()) {
            System.out.println("\t\t\t\t###########  LISTE DE POKEMONS VIDE !!!  ###########");
        } else {
            System.out.println(" ");
            System.out.println("\t\t\t######################  LISTE DES POKEMONS  ######################");
            System.out.println(" ");
            System.out.println("\t\t\t| NOM\t\t| TYPE\t\t| HEALTH POINTS\t| ATTACK POINTS\t|");
            System.out.println("\t\t\t=================================================================");
            for (PokemonPrincipal p : ProjetPokemon.listDesPokemons) {
                System.out.printf("\t\t\t| %-14s| %-14s| %-14s| %-14s|%n", p.getNom(), p.getType(), p.getHp(),
                        p.getAtk());
            }
        }

    }

    // METHODE PERMETTANT DE CREER DES POKEMONS
    public static void pokemonCreator() {
        int type;
        String nom;
        double hp;
        double atk;

        Scanner scanner = new Scanner(System.in);
        Scanner scannerNom = new Scanner(System.in);
        Scanner scannerHp = new Scanner(System.in);
        Scanner scannerAtk = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("\t\t\t\t#################  POKEMON CREATOR  #################");
            System.out.println("\t\t\t\t#  ENTREZ LE TYPE DU POKEMON QUE VOUS VOULEZ CREER  #");
            System.out.println(
                    "\t\t\t\t   _1_ pour Pokemon de type GENERAL\n\t\t\t\t   _2_ pour Pokemon de type PLANTE\n\t\t\t\t   _3_ pour Pokemon de type FEU\n\t\t\t\t   _4_ pour Pokemon de type EAU");
            System.out.println(" ");
            System.out.print("\t\t\t\tEntrez votre choix : ");
            type = scanner.nextInt();
        } while (type < 1 || type > 4);

        System.out.print("\t\t\t\t   _*_ Entrez le nom du pokemon : ");
        nom = scannerNom.nextLine();

        System.out.print("\t\t\t\t   _*_ Entrez les points de vie du pokemon : ");
        hp = scannerHp.nextDouble();

        System.out.print("\t\t\t\t   _*_ Entrez les points d'attaque du pokemon : ");
        atk = scannerAtk.nextDouble();

        System.out.println(" ");
        System.out.println("\t\t\t\t########## VOTRE POKEMON A ETE BIEN CREE ###########");

        switch (type) {
            case 1:
                ProjetPokemon.listDesPokemons.add(new Pokemon(nom, hp, atk, "GENERAL"));
                menu();
                break;
            case 2:
                ProjetPokemon.listDesPokemons.add(new PokemonPlante(nom, hp, atk, "PLANTE"));
                menu();
                break;
            case 3:
                ProjetPokemon.listDesPokemons.add(new PokemonFeu(nom, hp, atk, "FEU"));
                menu();
                break;
            case 4:
                ProjetPokemon.listDesPokemons.add(new PokemonEau(nom, hp, atk, "EAU"));
                menu();
                break;
            default:
                return;
        }

        scanner.close();
        scannerNom.close();
        scannerAtk.close();
        scannerHp.close();
    }

    // METHODE PERMETTANT D'INITIALISER DES POKEMONS AU DEBUT DU JEU
    public static void initialiser() {
        // CREATION DE 2 POKEMON DE TYPE FEU
        ProjetPokemon.listDesPokemons.add(new PokemonFeu("Infernape", 104, 10, "FEU"));
        ProjetPokemon.listDesPokemons.add(new PokemonFeu("Charizard", 84, 8, "FEU"));

        // CREATION DE 2 POKEMON DE TYPE EAU
        ProjetPokemon.listDesPokemons.add(new PokemonEau("Gyarados", 125, 15, "EAU"));
        ProjetPokemon.listDesPokemons.add(new PokemonEau("Swampert", 110, 60, "EAU"));

        // CREATION DE 2 POKEMON DE TYPE PLANTE
        ProjetPokemon.listDesPokemons.add(new PokemonPlante("Venusaur", 82, 10, "PLANTE"));
        ProjetPokemon.listDesPokemons.add(new PokemonPlante("Decidueye", 107, 10, "PLANTE"));

        // CREATION DE 2 POKEMON DE TYPE GENERAL
        ProjetPokemon.listDesPokemons.add(new Pokemon("Pikachu", 150, 85, "GENERAL"));
        ProjetPokemon.listDesPokemons.add(new Pokemon("Flambuzard", 104, 80, "GENERAL"));

    }
}

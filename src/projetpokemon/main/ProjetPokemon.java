/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetpokemon.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projetpokemon.actions.CreatePokemon;
import projetpokemon.actions.playGame;
import projetpokemon.cpts.Pokemon;
import projetpokemon.cpts.PokemonEau;
import projetpokemon.cpts.PokemonFeu;
import projetpokemon.cpts.PokemonPrincipal;

/**
 *
 * @author hp
 */
public class ProjetPokemon {
    public static List<PokemonPrincipal> listDesPokemons = new ArrayList<>();

    public static List<PokemonPrincipal> getListDesPokemons() {
        return listDesPokemons;
    }

    public static void setListDesPokemons(List<PokemonPrincipal> listDesPokemons) {
        ProjetPokemon.listDesPokemons = listDesPokemons;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonPrincipal jiji = new PokemonEau("jiji", 100, 30, "EAU");
        PokemonPrincipal joji = new PokemonFeu("joji", 100, 30, "FEU");

        // jiji.attaquer(joji);

        CreatePokemon.initialiser();
        menu();
    }

    public static void menu() {
        Scanner scannerChoix = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("\t\t\t\t##########  BIENVENU DANS LE JEU POKEMON  ##########");
        System.out.println("\t\t\t\t################## VOICI LE MENU  ##################");
        System.out.println("\t\t\t\t   _1_ pour afficher la liste des pokemon existants");
        System.out.println("\t\t\t\t   _2_ pour ajouter un nouveau pokemon");
        System.out.println("\t\t\t\t   _3_ pour jouer");
        System.out.println("\t\t\t\t   _4_ pour quitter");
        System.out.println(" ");
        System.out.print("\t\t\t\tEntrez votre choix : ");
        int choixUn = scannerChoix.nextInt();

        switch (choixUn) {
            case 1:
                CreatePokemon.afficherPokemons();
                menu();
                break;
            case 2:
                CreatePokemon.pokemonCreator();
            case 3:
                playGame.attaquerPokemon();
            case 4:
                System.out.println(" ");
                System.out.println("\t\t\t\t################  FIN DU PROGRAMME  ################");
                System.out.println(" ");
                break;
            default:
                return;
        }
    }

}

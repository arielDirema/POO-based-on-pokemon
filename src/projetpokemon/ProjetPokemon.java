/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetpokemon;

/**
 *
 * @author hp
 */
public class ProjetPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //CREATION DE 2 POKEMON DE TYPE FEU
        PokemonFeu charizard = new PokemonFeu("Charizard", 84, 8);
        PokemonFeu infernape = new PokemonFeu("Infernape", 104, 10);

        //CREATION DE 2 POKEMON DE TYPE EAU
        PokemonEau gyarados = new PokemonEau("Gyarados", 125, 15);
        PokemonEau swampert = new PokemonEau("Swampert", 110, 60);

        //CREATION DE 2 POKEMON DE TYPE PLANTE
        PokemonPlante venusaur = new PokemonPlante("Venusaur", 82, 10);
        PokemonPlante decidueye = new PokemonPlante("Decidueye", 107, 10);

        //CREATION DE 2 POKEMON DE TYPE GENERAL
        //Pokemon pikachu = new Pokemon("Pikachu", 150, 85);
        //Pokemon flambuzard = new Pokemon("Flambuzard", 104, 80);

        //System.out.println(charizard.getNom());
        System.out.print("\n\n");
        System.out.println("------POKEMONS DE TYPE FEU------");
        System.out.println(" ");
        infernape.afficher();
        System.out.println(" ");
        charizard.afficher();
        System.out.println(" ");

        System.out.println("------POKEMONS DE TYPE PLANTE------");
        System.out.println(" ");
        venusaur.afficher();
        System.out.println(" ");
        decidueye.afficher();
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("------POKEMONS DE TYPE EAU------");
        System.out.println(" ");
        gyarados.afficher();
        System.out.println(" ");
        swampert.afficher();
        System.out.println(" ");

        //PROCEDER A UNE ATTAQUE
        System.out.println("******Swampert attaque Infernape*****");
        swampert.attaquer(infernape);

        //AFFICHAGE DES NOUVEAUX STATS DES POKEMONS COMBATTANTS
        System.out.println(" ");
        swampert.afficher();
        System.out.println(" ");
        infernape.afficher();
        System.out.println(" ");

        //PROCEDER A UNE ATTAQUE
        System.out.println("******Charizard attaque Venusaur*****");
        charizard.attaquer(venusaur);

        //AFFICHAGE DES NOUVEAUX STATS DES POKEMONS COMBATTANTS
        System.out.println(" ");
        charizard.afficher();
        System.out.println(" ");
        venusaur.afficher();
    }
    
}

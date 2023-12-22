/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon.cpts;

/**
 *
 * @author hp
 */
public class Pokemon extends PokemonPrincipal {
    // CONSTRUCTEURS
    public Pokemon() {

    }

    public Pokemon(String _nom, double _hp, double _atk, String _type) {
        super(_nom, _hp, _atk, _type);
    }

    // IMPLEMENTATION DES METHODES ATTAQUER AVEC SURCHARGE
    // ATTAQUER UN POKEMON_NORMAL
    @Override
    public void attaquer(Pokemon poke) {
        // System.out.println("Classe : Pokemon");
        poke.hp -= this.atk * 0.5;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

    // ATTAQUER UN POKEMON_FEU
    @Override
    public void attaquer(PokemonFeu poke) {
        // System.out.println("Classe : Pokemon");
        poke.hp -= this.atk;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

    // ATTAQUER UN POKEMON_EAU
    @Override
    public void attaquer(PokemonEau poke) {
        poke.hp -= this.atk;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

    // ATTAQUER UN POKEMON_PLANTE
    @Override
    public void attaquer(PokemonPlante poke) {
        poke.hp -= this.atk;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }
}

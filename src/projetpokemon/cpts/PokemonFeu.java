/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon.cpts;

/**
 *
 * @author hp
 */
public class PokemonFeu extends PokemonPrincipal {
    // CONSTRUCTEURS
    public PokemonFeu() {

    }

    public PokemonFeu(String _nom, double _hp, double _atk, String _type) {
        super(_nom, _hp, _atk, _type);
    }

    // IMPLEMENTATION DES METHODES ATTAQUER AVEC SURCHARGE
    // ATTAQUER UN POKEMON_NORMAL
    @Override
    public void attaquer(Pokemon poke) {
        poke.hp -= this.atk;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

    // ATTAQUER UN POKEMON_FEU
    @Override
    public void attaquer(PokemonFeu poke) {
        poke.hp -= this.atk * 0.5;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

    // ATTAQUER UN POKEMON_EAU
    @Override
    public void attaquer(PokemonEau poke) {
        poke.hp -= this.atk * 0.5;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

    // ATTAQUER UN POKEMON_PLANTE
    @Override
    public void attaquer(PokemonPlante poke) {
        poke.hp -= this.atk * 2;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }

}

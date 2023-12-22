/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon.cpts;

/**
 *
 * @author hp
 */
public class PokemonFeu extends Pokemon {
    // CONSTRUCTEURS
    public PokemonFeu() {

    }

    public PokemonFeu(String _nom, double _hp, double _atk, String _type) {
        super(_nom, _hp, _atk, _type);
    }

    // IMPLEMENTATION DES METHODES ATTAQUER

    public void attaquer(Pokemon poke) {
        if (poke instanceof Pokemon) {
            poke.hp -= this.atk;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        } else if (poke instanceof PokemonFeu) {
            poke.hp -= this.atk * 0.5;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        } else if (poke instanceof PokemonEau) {
            poke.hp -= this.atk * 0.5;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        } else if (poke instanceof PokemonPlante) {
            poke.hp -= this.atk * 2;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        }
    }
}

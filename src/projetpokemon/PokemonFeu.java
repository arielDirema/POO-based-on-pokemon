/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon;

/**
 *
 * @author hp
 */
public class PokemonFeu extends Pokemon{
    //CONSTRUCTEURS
    public PokemonFeu(){
        
    }
    public PokemonFeu(String _nom, int _hp, int _atk){
        super(_nom, _hp, _atk);
    }
    
    //IMPLEMENTATION DES METHODES ATTAQUER AVEC SURCHARGE
    //ATTAQUER UN POKEMON_NORMAL
    @Override
    public void attaquer(Pokemon poke) {
        poke.hp -= this.atk;
    }
    
    //ATTAQUER UN POKEMON_FEU
    @Override
    public void attaquer(PokemonFeu pokeFeu) {
        pokeFeu.hp -= this.atk * 0.5;
    }
    
    //ATTAQUER UN POKEMON_EAU
    @Override
    public void attaquer(PokemonEau pokeEau) {
        pokeEau.hp -= this.atk * 0.5;
    }
    
    //ATTAQUER UN POKEMON_PLANTE
    @Override
    public void attaquer(PokemonPlante pokePlante) {
        pokePlante.hp -= this.atk * 2;
    }

}

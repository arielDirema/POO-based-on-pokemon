/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon;

/**
 *
 * @author hp
 */
public abstract class Pokemon {
    protected String nom;
    protected int hp; //Health Points
    protected int atk; //Attack points
    
    //CONSTRUCTEURS
    public Pokemon(){
        
    }
    public Pokemon(String _nom, int _hp, int _atk){
        this.nom = _nom;
        this.hp = _hp;
        this.atk = _atk;
    }
    
    //GETTERS
    public String getNom(){
        return this.nom;
    }
    public int getHp(){
        return this.hp;
    }
    public int getAtk(){
        return this.atk;
    }
    
    //METHODE IS_DEAD
    public boolean isDead(){
        return (this.hp == 0);
    }
    
    //METHODE AFFICHER
    public void afficher(){
        System.out.println("Nom : " + this.nom + "\nHealth Point : " + this.hp + "\nPoint d'attaque : " + this.atk);
    }
    
    //IMPLEMENTATION DES METHODES ATTAQUER AVEC SURCHARGE
    //ATTAQUER UN POKEMON_NORMAL
    public void attaquer(Pokemon poke) {
        poke.hp -= this.atk * 0.5;
    }
    
    //ATTAQUER UN POKEMON_FEU
    public void attaquer(PokemonFeu pokeFeu) {
        pokeFeu.hp -= this.atk;
    }
    
    //ATTAQUER UN POKEMON_EAU
    public void attaquer(PokemonEau pokeEau) {
        pokeEau.hp -= this.atk;
    }
    
    //ATTAQUER UN POKEMON_PLANTE
    public void attaquer(PokemonPlante pokePlante) {
        pokePlante.hp -= this.atk;
    }
}

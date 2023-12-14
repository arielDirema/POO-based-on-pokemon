/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon;

/**
 *
 * @author hp
 */
public class Pokemon {
    protected String nom;
    protected double hp; //Health Points
    protected double atk; //Attack points
    
    //CONSTRUCTEURS
    public Pokemon(){
        
    }
    public Pokemon(String _nom, double _hp, double _atk){
        this.nom = _nom;
        this.hp = _hp;
        this.atk = _atk;
    }
    
    //GETTERS
    public String getNom(){
        return this.nom;
    }
    public double getHp(){
        return this.hp;
    }
    public double getAtk(){
        return this.atk;
    }

    //SETTERS
    public void setNom(String _nom){
        this.nom = _nom;
    }
    public void setHp(double _hp){
        this.hp = _hp;
    }
    public void setAtk(double _atk){
        this.atk = _atk;
    }
    
    //METHODE IS_DEAD
    public boolean isDead(){
        return (this.hp <= 0);
    }
    
    //METHODE AFFICHER
    public void afficher(){
        System.out.println("Nom : " + this.nom + "\nHealthPoint : " + this.hp + "\nAttackPoint : " + this.atk + "\nVivant : " + !this.isDead());
    }
    
    //IMPLEMENTATION DES METHODES ATTAQUER AVEC SURCHARGE
    //ATTAQUER UN POKEMON_NORMAL
    public void attaquer(Pokemon poke) {
        poke.hp -= this.atk * 0.5;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }
    
    //ATTAQUER UN POKEMON_FEU
    public void attaquer(PokemonFeu pokeFeu) {
        pokeFeu.hp -= this.atk;
        if (pokeFeu.getHp() <= 0) {
            pokeFeu.setHp(0);
        }
    }
    
    //ATTAQUER UN POKEMON_EAU
    public void attaquer(PokemonEau pokeEau) {
        pokeEau.hp -= this.atk;
        if (pokeEau.getHp() <= 0) {
            pokeEau.setHp(0);
        }
    }
    
    //ATTAQUER UN POKEMON_PLANTE
    public void attaquer(PokemonPlante pokePlante) {
        pokePlante.hp -= this.atk;
        if (pokePlante.getHp() <= 0) {
            pokePlante.setHp(0);
        }
    }
}

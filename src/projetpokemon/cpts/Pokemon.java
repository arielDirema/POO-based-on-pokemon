/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpokemon.cpts;

/**
 *
 * @author hp
 */
public class Pokemon {
    protected String nom;
    protected double hp; // Health Points
    protected double atk; // Attack points
    protected String type;

    // CONSTRUCTEURS
    public Pokemon() {

    }

    public Pokemon(String _nom, double _hp, double _atk, String _type) {
        this.nom = _nom;
        this.hp = _hp;
        this.atk = _atk;
        this.type = _type;
    }

    // GETTERS
    public String getNom() {
        return this.nom;
    }

    public double getHp() {
        return this.hp;
    }

    public double getAtk() {
        return this.atk;
    }

    public String getType() {
        return this.type;
    }

    // SETTERS
    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public void setHp(double _hp) {
        this.hp = _hp;
    }

    public void setAtk(double _atk) {
        this.atk = _atk;
    }

    public void setType(String _type) {
        this.type = _type;
    }

    // METHODE IS_DEAD
    public boolean isDead() {
        return (this.hp <= 0);
    }

    // METHODE AFFICHER
    public void afficher() {
        System.out.println("\uD83D\uDC39");
        System.out.println("Nom : " + this.nom + "\nHealthPoint : " + this.hp + "\nAttackPoint : " + this.atk
                + "\nType : " + this.type + "\nVivant : " + !this.isDead());
    }

    // IMPLEMENTATION DES METHODES ATTAQUER

    public void attaquer(Pokemon poke) {
        if (poke instanceof Pokemon) {
            poke.hp -= this.atk * 0.5;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        } else if (poke instanceof PokemonFeu) {
            poke.hp -= this.atk;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        } else if (poke instanceof PokemonEau) {
            poke.hp -= this.atk;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        } else if (poke instanceof PokemonPlante) {
            poke.hp -= this.atk;
            if (poke.getHp() <= 0) {
                poke.setHp(0);
            }
        }
    }

}

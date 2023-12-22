package projetpokemon.cpts;

public abstract class PokemonPrincipal {
    protected String nom;
    protected double hp; // Health Points
    protected double atk; // Attack points
    protected String type;

    // CONSTRUCTEURS
    public PokemonPrincipal() {

    }

    public PokemonPrincipal(String _nom, double _hp, double _atk, String _type) {
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

    public abstract void attaquer(Pokemon poke);
    public abstract void attaquer(PokemonEau poke);
    public abstract void attaquer(PokemonFeu poke);
    public abstract void attaquer(PokemonPlante poke);
}

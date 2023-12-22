package projetpokemon.cpts;

public class PokemonGeneral extends Pokemon{
    public PokemonGeneral(){
        
    }
    public PokemonGeneral(String _nom, double _hp, double _atk, String _type){
        super(_nom, _hp, _atk, _type);
    }

    //IMPLEMENTATION DES METHODES ATTAQUER AVEC SURCHARGE
    //ATTAQUER UN POKEMON_NORMAL
    @Override
    public void attaquer(Pokemon poke) {
        poke.hp -= this.atk;
        if (poke.getHp() <= 0) {
            poke.setHp(0);
        }
    }
    
    //ATTAQUER UN POKEMON_FEU
    @Override
    public void attaquer(PokemonFeu pokeFeu) {
        pokeFeu.hp -= this.atk * 2;
        if (pokeFeu.getHp() <= 0) {
            pokeFeu.setHp(0);
        }
    }
    
    //ATTAQUER UN POKEMON_EAU
    @Override
    public void attaquer(PokemonEau pokeEau) {
        pokeEau.hp -= this.atk * 0.5;
        if (pokeEau.getHp() <= 0) {
            pokeEau.setHp(0);
        }
    }
    
    //ATTAQUER UN POKEMON_PLANTE
    @Override
    public void attaquer(PokemonPlante pokePlante) {
        pokePlante.hp -= this.atk * 0.5;
        if (pokePlante.getHp() <= 0) {
            pokePlante.setHp(0);
        }
    }
}
}

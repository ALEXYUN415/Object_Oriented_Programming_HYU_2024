package week5;

public class PlayerPokemon {
    String pokemonName;
    int maxHP;
    int HP;
    int attackPower;


    PlayerPokemon (String pokemonName, int maxHP, int attackPower) {
        this.pokemonName = pokemonName;
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.attackPower = attackPower;
    }
}

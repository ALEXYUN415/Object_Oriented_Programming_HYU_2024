package week5;

public class PokemonGame {
    public static void main(String[] args) {
        PlayerPokemon playerPokemon = new PlayerPokemon("Pikachu",100,35);
        GameMessage gameMessage = new GameMessage();

        while (playerPokemon.HP > 0){
            WildPokemon wildPokemon = new WildPokemon("Eevee",80,15);
            PokemonBattle pokemonBattle = new PokemonBattle();

            if (wildPokemon.HP > 0){
            gameMessage.encounter(wildPokemon, playerPokemon);
            pokemonBattle.battle(wildPokemon, playerPokemon, gameMessage);
            System.out.println();
        }
    }
}
}

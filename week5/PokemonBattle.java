package week5;

public class PokemonBattle {


    public void battle(WildPokemon wildPokemon, PlayerPokemon playerPokemon, GameMessage gameMessage) {
        while (true){

            gameMessage.option(wildPokemon, playerPokemon);

            if (gameMessage.num == 1){
                wildPokemon.HP -= playerPokemon.attackPower;
                playerPokemon.HP -= wildPokemon.attackPower;
                if (playerPokemon.HP <= 0){
                    System.out.println("Your " + playerPokemon.pokemonName + " was defeated.....");
                    break;
                } else if (wildPokemon.HP<=0) {
                    System.out.println("You defeated the wild " + wildPokemon.pokemonName + "!");
                    break;
                }
                System.out.println(wildPokemon.pokemonName + " attacks back!");
            }
            else if (gameMessage.num == 2){
                System.out.println("You run away.");
                break;
            }
            else if (gameMessage.num == 3){
                if (wildPokemon.HP < wildPokemon.maxHP * 0.2){
                    System.out.println("You have successfully caught " + wildPokemon.pokemonName + "!");
                    break;
                }
                else {
                    System.out.println(wildPokemon.pokemonName + " is too strong. It escaped the Poketball!");
                    break;
                }
            }
            else {
                System.out.println("Invaild number. Please try again.");
            }
        }

    }
}
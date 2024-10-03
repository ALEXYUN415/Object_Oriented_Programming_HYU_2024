package week5;

import java.util.Scanner;


public class GameMessage {

    int num;

    public void encounter (WildPokemon wildPokemon,PlayerPokemon playerPokemon) {
        System.out.println("You encounter a wild " + wildPokemon.pokemonName + "!");
        System.out.println("You choose "  + playerPokemon.pokemonName + " to battle!");
    }
    public void option(WildPokemon wildPokemon, PlayerPokemon playerPokemon) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your " + playerPokemon.pokemonName + "'s HP" + playerPokemon.HP + ". Wild " + wildPokemon.pokemonName +  "'s HP" + wildPokemon.HP + ".");
        System.out.println("Do you want to (1) attack, (2) Run away, or (3) use a Poketball?");
        num = input.nextInt();
    }






}

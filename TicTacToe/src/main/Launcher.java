/**
 * 
 */
package main;

import simulator.Simulator;
import java.util.ArrayList;
import java.util.Scanner;
import player.*;
import visual.Visualizer;

/**
 * @author waseem
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulator simulator;
		Visualizer visualizer;
		ArrayList<Player> Players=new ArrayList<Player>();
		PlayerFactory playerfactory=new PlayerFactory();
		String ch;
		Scanner scan;
		Player player;
		//Creating Player and with first player has first turn
		for(int i=1;i<3;i++)
		{
			player=playerfactory.createPlayer("PLAYER "+i,i==1?true:false);
		    Players.add(player);
		}
		do {
			visualizer=new Visualizer();
			simulator=Simulator.getSimulator(Players,visualizer);
			simulator.StartGame();
			simulator.clearScreen();
			System.out.println(simulator.GameResult());
			System.out.println("Would you like to play again (Enter 'yes')? ");
			scan = new Scanner(System.in);
			ch = scan.nextLine();
		} while (ch.equals("yes"));
       //Checking the GIT
	}

}

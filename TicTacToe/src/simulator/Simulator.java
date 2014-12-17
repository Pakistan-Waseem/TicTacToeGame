/**
 * 
 */
package simulator;

import player.Player;
import visual.Visualizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author waseem
 *
 */
 public class Simulator {

	private char Fields[];
	private Player player;
	private ArrayList<Player> Players;
	private Visualizer visualizer;
	private static Simulator simulator; 
	private int Moves;

	// Constructor Initializing the game parameters
	private Simulator(Collection<Player> players, Visualizer visual) {
		Players = new ArrayList<Player>();
		for (Player obj : players) {
			if (obj.getPlayerStatus())
				player = obj;
		}
		Players = (ArrayList<Player>) players;
		Fields = new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		visualizer = visual;
		Moves = 0;
	}
	public static Simulator getSimulator(Collection<Player> players, Visualizer visual)
	{
		if(simulator==null)
			simulator=new Simulator(players,visual);
		return simulator;
	}

	// Start Game
	public void StartGame() {
		int position;
		visualizer.DrawTicTacToeBoard(Fields);
		do {
			System.out.println(player.getPlayerName() + " Your Turn");
			Scanner in = new Scanner(System.in);
			position = in.nextInt();
			if (position >= 1 && position <= 9) {
				if (IsFieldEmpty(position)) {
					Fields[position - 1] = player.getPlayerSymbol();
					Moves++;
					NextPlayer();
				}
			}
			else
			{
				System.out.println("Please choose correct field");
			}
			visualizer.DrawTicTacToeBoard(Fields);

		} while (!isStopGame());
	}

	// Checking the field in game board is empty
	public boolean IsFieldEmpty(int pos) {
		boolean isEmpty = true;
		char PositionSymbol = Fields[pos - 1];
		for (Player obj : Players) {
			if (PositionSymbol == obj.getPlayerSymbol()) {
				System.out
						.println("This field is already filled, please choose another.");
				isEmpty = false;
			}
		}
		return isEmpty;
	}

	// Getting the player which has turn
	public Player GetPlayer() {

		return player;
	}

	// Updating player of game after turn
	public void NextPlayer() {
		for (Player obj : Players) {
			if (obj.getPlayerStatus())
				obj.setPlayerStatus(false);
			else {
				obj.setPlayerStatus(true);
				player = obj;
			}
		}
	}

	// Checking the player is wins or not

	private boolean CheckPlayerWin(Player player) {
		char playersymbol = player.getPlayerSymbol();
		boolean win = false;
		if (Fields[0] == playersymbol && Fields[1] == playersymbol
				&& Fields[2] == playersymbol)
			win = true;
		if (Fields[3] == playersymbol && Fields[4] == playersymbol
				&& Fields[5] == playersymbol)
			win = true;
		if (Fields[6] == playersymbol && Fields[7] == playersymbol
				&& Fields[8] == playersymbol)
			win = true;
		if (Fields[0] == playersymbol && Fields[3] == playersymbol
				&& Fields[6] == playersymbol)
			win = true;
		if (Fields[1] == playersymbol && Fields[4] == playersymbol
				&& Fields[7] == playersymbol)
			win = true;
		if (Fields[2] == playersymbol && Fields[5] == playersymbol
				&& Fields[8] == playersymbol)
			win = true;
		if (Fields[0] == playersymbol && Fields[4] == playersymbol
				&& Fields[8] == playersymbol)
			win = true;
		if (Fields[2] == playersymbol && Fields[4] == playersymbol
				&& Fields[6] == playersymbol)
			win = true;
		return win;
	}

	// Output the result of game
	public String GameResult() {
		String Result = "";
		for (Player pl : Players) {
			if (CheckPlayerWin(pl)) {
				Result = "Congratulation! " + pl.getPlayerName() + " you won";
				break;
			}
			continue;
		}
		if (Result == "")
			Result = "Game is Tie";
		return Result;
	}

	// checking that the game should be stop or not
	private boolean isStopGame() {
		boolean result = false;
		if (Moves >= 9)
			result = true;
		else {
			for (Player pl : Players) {
				if (CheckPlayerWin(pl)) {
					result = true;
					break;
				}
			}
		}
		return result;

	}
	// Clear Screen
	public void clearScreen()
	{
		for(int i=1;i<50;i++)
			System.out.println();
	}

}

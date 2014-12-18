/**
 * 
 */
package player;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author waseem
 *
 */
// Creating Player
public class PlayerFactory {

	public ArrayList<Player> createPlayers() {
		String Name;
		Scanner scan;
		ArrayList<Player> Players = new ArrayList<Player>();
		scan = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.println("Please enter PLAYER" + i + " name");
			Name = scan.nextLine();
			if(i==1)
				Players.add(new PlayerX(Name,true));
			else
				Players.add(new PlayerO(Name,false));
		}
		return Players;
	}
}

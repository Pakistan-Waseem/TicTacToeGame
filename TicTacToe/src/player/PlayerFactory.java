/**
 * 
 */
package player;

import java.util.Scanner;

/**
 * @author waseem
 *
 */
//Creating Player
public class PlayerFactory {

	public PlayerFactory() {
	}

	public static Player createPlayer(String playernumber, boolean status) {
		String Name;
		String Symbol;
		Scanner scan;
		System.out.println("Please enter " + playernumber + " name");
		scan = new Scanner(System.in);
		Name = scan.nextLine();
		System.out.println("Please enter game symbol for " + playernumber
				+ "name");
		Symbol = scan.nextLine();
		return new Player(Name, Symbol.trim().charAt(0), status);

	}
}

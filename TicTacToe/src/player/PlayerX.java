/**
 * 
 */
package player;

/**
 * @author waseem
 *
 */
public class PlayerX implements Player {
	private String Name;
	private boolean isActive;
	private char playerSymbol;

	public PlayerX(String name, boolean active) {
		this.Name = name;
		this.isActive = active;
		playerSymbol = 'X';
	}

	public void setPlayerName(String name) {
		Name = name;
	}

	public String getPlayerName() {
		return Name;
	}

	public char getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerStatus(boolean turn) {
		isActive = turn;
	}

	public boolean getPlayerStatus() {
		return isActive;
	}
}

/**
 * 
 */
package player;

/**
 * @author waseem
 *
 */
public class PlayerO implements Player {
	private String Name;
	private boolean isActive;
	private char playerSymbol;

	public PlayerO(String name, boolean active) {
		this.Name = name;
		this.isActive = active;
		playerSymbol = 'O';
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

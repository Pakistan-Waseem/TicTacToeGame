package player;

public class PlayerItem {
    private char Item;
    private PlayerItem()
    {}
    public PlayerItem(String Player)
    {
    	if(Player=="PLAYER1")
    		Item='X';
    	else
    		Item='O';
    	
    }
    public void setPlayerItem(char item)
    {
    	Item=item;
    }
    public char getPlayerITem()
    {
    	return Item;
    }
}

package it.polimi.ingsw.network.message;

//TODO: delete this class
public class PlayerNumberMessage extends Message{

    private int playerNumber;

    public PlayerNumberMessage(String nickname, int playerNumber) {
        super(nickname, MessageType.PLAYER_NUMBER_REPLY);
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}

package soundsystem;

import java.util.List;

public class Game {

    private List<Player> list;
    
    public void setPlayerList(List<Player> list) {
        this.list = list;
    }
    
    public void play() {
        list.forEach(Player::play);
    }

}

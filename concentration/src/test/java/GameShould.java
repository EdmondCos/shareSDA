import com.sda.Arbitru;
import com.sda.Player;
import org.junit.Test;

public class GameShould {
    private BotPlayer botPlayer = new BotPlayer();

    @Test
    public void finishWhenBotIsPlaying() {
        Arbitru arbitru = new Arbitru(4, botPlayer);
        arbitru.playGame();
    }
}


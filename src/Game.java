import java.util.ArrayList;
import java.util.List;

class Game {
  private List<Player> players;

  Game() {
    this.players = new ArrayList<>();
  }

  void addPlayer(Player player) throws PlayerLimitExceededException {
    if (players.size() > 1)
      throw new PlayerLimitExceededException();
    players.add(player);
  }

  List<Integer> move() {
    ArrayList<Integer> result = new ArrayList<>();
    for (Player player : players) {
      result.add(player.move());
    }
    return result;
  }
}

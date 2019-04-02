import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Game {
  private List<Player> players;
  private List<Integer> score;
  private Machine machine;

  Game() {
    this.players = new ArrayList<>();
    this.score = new ArrayList<>(Arrays.asList(0, 0));
    this.machine = new Machine();
  }

  void addPlayer(Player player) throws PlayerLimitExceededException {
    if (players.size() > 1)
      throw new PlayerLimitExceededException();
    players.add(player);
  }

  List<Integer> move() {
    ArrayList<MoveType> moves = new ArrayList<>();
    Player player1 = this.players.get(0);
    Player player2 = this.players.get(1);

    moves.add(player1.move());
    moves.add(player2.move());
    List<Integer> latestScore = this.machine.putCoins(moves);

    this.setPlayerLatestScore(latestScore);
    this.updateScore(latestScore);

    return this.score;
  }

  private void updateScore(List<Integer> score) {
    this.score.set(0, this.score.get(0) + score.get(0));
    this.score.set(1, this.score.get(1) + score.get(1));
  }

  private void setPlayerLatestScore(List<Integer> score) {
    this.players.get(0).setScore(score.get(0));
    this.players.get(1).setScore(score.get(1));
  }
}

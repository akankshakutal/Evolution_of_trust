import java.util.*;

class Game {
  private List<Player> players;
  private Map<List<MoveType>, List<Integer>> scoreMatrix;
  private List<Integer> score;

  Game() {
    this.players = new ArrayList<>();
    this.scoreMatrix = new HashMap<>();
    this.score = new ArrayList<>(Arrays.asList(0, 0));
    scoreMatrix.put(Arrays.asList(MoveType.COOPERATE, MoveType.COOPERATE), Arrays.asList(2, 2));
  }

  void addPlayer(Player player) throws PlayerLimitExceededException {
    if (players.size() > 1)
      throw new PlayerLimitExceededException();
    players.add(player);
  }

  List<Integer> move() {
    ArrayList<MoveType> result = new ArrayList<>();
    for (Player player : players) {
      result.add(player.move());
    }
    List<Integer> latestScore = this.scoreMatrix.get(result);
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

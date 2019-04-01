import java.util.*;

class Machine {
  private Map<List<MoveType>, List<Integer>> scoreMatrix;

  Machine() {
    this.scoreMatrix = new HashMap<>();
    scoreMatrix.put(Arrays.asList(MoveType.COOPERATE, MoveType.COOPERATE), Arrays.asList(2, 2));
    scoreMatrix.put(Arrays.asList(MoveType.CHEAT, MoveType.CHEAT), Arrays.asList(0, 0));
    scoreMatrix.put(Arrays.asList(MoveType.CHEAT, MoveType.COOPERATE), Arrays.asList(3, -1));
    scoreMatrix.put(Arrays.asList(MoveType.COOPERATE, MoveType.CHEAT), Arrays.asList(-1, 3));
  }

  List<Integer> putCoins(List<MoveType> moves) {
    return scoreMatrix.get(moves);
  }
}

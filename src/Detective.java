import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Detective extends Player {
  private List<MoveType> initialMoves = new ArrayList<>(Arrays.asList
          (MoveType.COOPERATE, MoveType.CHEAT, MoveType.COOPERATE, MoveType.COOPERATE)
  );
  private Player character;

  @Override
  MoveType move() {
    if (this.initialMoves.size() != 0) {
      MoveType move = initialMoves.get(0);
      initialMoves.remove(0);
      if (this.score != null && this.score < 0) {
        character = new CopyCat();
      }
      return move;
    }
    return character.move();
  }
}
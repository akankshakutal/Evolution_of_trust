public class Cheater extends Player {
  private Integer score;

  @Override
  public MoveType move() {
    return MoveType.CHEAT;
  }

}

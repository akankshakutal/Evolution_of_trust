class CooperativePlayer extends Player {
  private Integer score;

  @Override
  public MoveType move() {
    return MoveType.COOPERATE;
  }
}

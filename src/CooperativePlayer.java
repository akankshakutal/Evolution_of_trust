class CooperativePlayer implements Player {
  private Integer score;

  @Override
  public MoveType move() {
    return MoveType.COOPERATE;
  }

  @Override
  public void setScore(Integer score) {
    this.score = score;
  }
}

class CooperativePlayer implements Player {

  private int score;

  CooperativePlayer() {
    this.score = 0;
  }

  @Override
  public Integer move() {
    score += 2;
    return 2;
  }

  @Override
  public Integer getScore() {
    return score;
  }

}

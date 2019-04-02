abstract class Player {
  Integer score;

  abstract MoveType move();

  void setScore(Integer score) {
    this.score = score;
  }

}

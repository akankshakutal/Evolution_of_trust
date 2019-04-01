abstract class Player {
  private Integer score;

  abstract MoveType move();

  void setScore(Integer score){
    this.score = score;
  }

}

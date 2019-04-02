class CopyCat extends Player {
  @Override
  MoveType move() {
    if (this.score != null && this.score <= 0) {
      return MoveType.CHEAT;
    }
    return MoveType.COOPERATE;
  }
}
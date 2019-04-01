import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
  private Game game;

  @BeforeEach
  void setUp() {
    game = new Game();
  }

  @Test
  void shouldReturnObjectOfPlayerScoreWhenBothAreCooperating() throws PlayerLimitExceededException {
    Player john = new CooperativePlayer();
    Player roy = new CooperativePlayer();
    game.addPlayer(john);
    game.addPlayer(roy);

    assertEquals(List.of(2,2), game.move());
  }

  @Test
  void shouldReturnObjectOfTotalScoreAfterTwoRounds() throws PlayerLimitExceededException {
    Player john = new CooperativePlayer();
    Player roy = new CooperativePlayer();
    game.addPlayer(john);
    game.addPlayer(roy);
    game.move();
    game.move();

    assertEquals(List.of(4,4),game.score());
  }
}
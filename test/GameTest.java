import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    CooperativePlayer roy = new CooperativePlayer();
    game.addPlayer(john);
    game.addPlayer(roy);


    List<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);

    assertEquals(expected, game.move());
  }

}
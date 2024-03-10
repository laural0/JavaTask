import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

  private Main main;

  @Before
  public void setUp() {
    main = new Main();
  }

  @Test
  public void stream_sameChar() {

    String input = "aaaaa";

    String actualResult = main.streamTask(input);

    assertEquals("a5", actualResult);
  }

  @Test
  public void stream_random() {
    String input = "test input";

    String actualResult = main.streamTask(input);

    assertEquals("t3e1s1i1n1p1u1", actualResult);
  }

  @Test
  public void stream_contiguu() {
    //    main = new Main();

    String input = "tttaax";

    String actualResult = main.streamTask(input);

    assertEquals("t3a2x1", actualResult);
  }

  @Test
  public void stream_0sizeString() {

    String input = "";

    String actualResult = main.streamTask(input);

    assertEquals("", actualResult);
  }

  @Test
  public void stream_oneChar() {

    String input = "t";

    String actualResult = main.streamTask(input);

    assertEquals("t1", actualResult);
  }

  @Test
  public void hashMap_sameChar() {

    String input = "aaaaa";

    String actualResult = main.hashMapTask(input);

    assertEquals("a5", actualResult);
  }

  @Test
  public void hashMap_contiguu() {

    String input = "tttaaaapp";

    String actualResult = main.hashMapTask(input);

    assertEquals("a4t3p2", actualResult);
  }

  @Test
  public void hashMap_random() {

    String input = "testinput";

    String actualResult = main.hashMapTask(input);

    assertEquals("t3e1s1i1n1p1u1", actualResult);
  }

  @Test
  public void hashMap_oneChar() {

    String input = "t ";

    String actualResult = main.hashMapTask(input);

    assertEquals("t1", actualResult);
  }

  @Test
  public void hashMap_0sizeString() {

    String input = "";

    String actualResult = main.hashMapTask(input);

    assertEquals("", actualResult);
  }


}



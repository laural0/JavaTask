import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

  private Main main;

  @Before
  public void setUp() {
    main = new Main();
  }

  @Test
  public void task_random() {
    String input = "test input";

    String actualResult = main.task(input);

    assertEquals("t3e1s1i1n1p1u1", actualResult);
  }

  @Test
  public void task_ok() {
    //    main = new Main();

    String input = "tttaax";

    String actualResult = main.task(input);

    assertEquals("t3a2x1", actualResult);
  }

  @Test
  public void task_0sizeString() {

    //    main = new Main();

    String input = "";

    String actualResult = main.task("");

    assertEquals(input, actualResult);
    //    assert "".equals(actualResult);
  }

  @Test
  public void task_oneLetter() {
    String input = "t";

    String actualResult = main.task(input);

    assertEquals("t1", actualResult);
  }

  @Test
  public void hashMaptask_contiguu() {
    String input = "tttaaapp";

    input = input.replaceAll("\\s", "");

    String actualResult = main.hashMaptask(input);

    assertEquals("t3a3p2", actualResult);
  }

  @Test
  public void hashMaptask_random() {
    String input = "testinput";

    String actualResult = main.hashMaptask(input);

    assertEquals("t3e1s1i1n1p1u1", actualResult);
  }

  @Test
  public void hashMaptask_oneChar() {

    String input = "t ";

    String actualResult = main.hashMaptask(input);

    assertEquals("t1", actualResult);
  }
}

  //  @Test
  //  public void task_randomCase(){
  ////    main new Main();
  //
  ////    String input = ""
  //  }
  // }

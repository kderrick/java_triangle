import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_getLengthOne() {
    Triangle testTriangle = new Triangle(2,4,4);
    assertEquals(2, testTriangle.getLength1());
  }



}

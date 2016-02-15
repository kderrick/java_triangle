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
    Triangle testTriangle = new Triangle(4,2,2);
    assertEquals(4, testTriangle.getLength1());
  }

  @Test
  public void newTriangle_getLengthThree() {
    Triangle testTriangle = new Triangle(4,4,2);
    assertEquals(2, testTriangle.getLength3());
  }

  @Test
  public void newTriangle_getLengthTwo() {
    Triangle testTriangle = new Triangle(2,4,4);
    assertEquals(4, testTriangle.getLength2());
  }

  @Test
  public void newTriangle_checkTriangleType_notATriangle() {
    Triangle testTriangle = new Triangle(2,2,4);
    assertEquals("Not a triangle", testTriangle.checkTriangle());
  }

  @Test
  public void newTriangle_checkTriangleType_equilateral() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals("Equilateral", testTriangle.checkTriangle());
  }
  @Test
  public void newTriangle_checkTriangleType_isosceles() {
    Triangle testTriangle = new Triangle(3,3,4);
    assertEquals("Isosceles", testTriangle.checkTriangle());
  }



}

import org.fluentlenium.adapter.FluentTest;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.*;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  // @Rule
  // public DatabaseRule database = new DatabaseRule();
  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }
  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Triangle finder");
    }

  @Test
  public void checkIfTriangleIsATriangle() {
    goTo("http://localhost:4567/");
    fill("#length1").with("2");
    fill("#length2").with("2");
    fill("#length3").with("8");
    submit(".btn");
    assertThat(pageSource()).contains("Not a triangle");
  }

  @Test
  public void checkIfTriangleIsEquilateral() {
    goTo("http://localhost:4567/");
    fill("#length1").with("3");
    fill("#length2").with("3");
    fill("#length3").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Equilateral");
  }

  @Test
  public void checkIfTriangleIsScalene() {
    goTo("http://localhost:4567/");
    fill("#length1").with("3");
    fill("#length2").with("4");
    fill("#length3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Scalene");
  }

  @Test
  public void checkIfTriangleIsIsosceles() {
    goTo("http://localhost:4567/");
    fill("#length1").with("3");
    fill("#length2").with("3");
    fill("#length3").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("Isosceles");
  }
}

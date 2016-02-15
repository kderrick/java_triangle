import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get ("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/home.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get ("/triangle", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/triangle.vtl");

          int side1 = Integer.parseInt(request.queryParams("length1"));
          int side2 = Integer.parseInt(request.queryParams("length2"));
          int side3 = Integer.parseInt(request.queryParams("length3"));

          Triangle myTriangle = new Triangle(side1, side2, side3);
          model.put("myTriangle", myTriangle);
          model.put("templates", "templates/triangle.vtl");
          String result = myTriangle.checkTriangle();
          model.put("result", result);


          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


    }

}

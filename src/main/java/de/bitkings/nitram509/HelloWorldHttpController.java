package de.bitkings.nitram509;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldHttpController {

  @RequestMapping(path = "hello")
  @ResponseBody
  public String get() {
    return "Hello World";
  }

}

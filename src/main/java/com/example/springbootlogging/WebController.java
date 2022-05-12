package com.example.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

  Logger log = LoggerFactory.getLogger(WebController.class);

  @GetMapping("/{name}")
  public String greeting (@PathVariable(name = "name") String name){

    // um strings Konkatenation zu vermeiden, sieht der Massage bei sl4j so.. ("Request {}", name)
    log.debug("Request {}", name);
    String response = "Helloss " + name + " :)";
    log.debug("Response {}", response);

    return response;
  }

}

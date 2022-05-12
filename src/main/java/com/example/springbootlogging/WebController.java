package com.example.springbootlogging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

  @GetMapping("/{name}")
  public String greeting (@PathVariable(name = "name") String name){
    return "Helloss " + name + " :)";
  }

}

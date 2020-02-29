package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 */

@RestController
public class IndexController {

  @GetMapping("/index")
  public String index() {
    return "this is gitdemo";
  }

  @GetMapping("/index2")
  public String index2() {
      return "this is  index2 method revert conflict cause this change";
  }


  @GetMapping("/index-master")
  public String indexMaster() {
    return "this is gitdemo indexMaster";
  }

  @GetMapping("/index3")
  public String index3() {
      return "this is  index3 method by king1";
  }

  @GetMapping("/index4")
  public String index4String() {
      return "this is  index4 method by king1";
  }

}
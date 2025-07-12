package ru.clever.antsattacks.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.clever.antsattacks.client.AntsClient;
import ru.clever.antsattacks.util.StaticStrings;

@Controller
@RequiredArgsConstructor
public class MainController {

  @Value("${app.services.ants.token}")
  private String token;

  private final AntsClient antsClient;

  @GetMapping("")
  public String getMap(Model model) {
    model.addAttribute("mapJson", antsClient.getArena(token).getBody());
    return "main";
  }

  @GetMapping("/test")
  public String getMapTest(Model model) {
    model.addAttribute("mapJson", StaticStrings.JSON_TEST);
    return "maintest";
  }
}

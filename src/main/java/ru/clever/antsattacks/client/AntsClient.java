package ru.clever.antsattacks.client;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import ru.clever.antsattacks.model.MapDto;

@FeignClient(value = "${app.services.ants.name:client}", url = "${app.services.ants.url:}")
public interface AntsClient {
  /**
   * Ants, enemies and map response
   */
  @GetMapping("/arena")
  ResponseEntity<String> getArena(@RequestHeader("X-Auth-Token") String token);

  /**
   * Player logs
   */
  @GetMapping("/logs")
  @Headers(value = {"X-Auth-Token: 4bc995f1-f59c-4a68-833e-647eaaf500a3"})
  ResponseEntity<Object> getLogs();

  /**
   * Ant orders and map response
   */
  @PostMapping("/move")
  @Headers(value = {"X-Auth-Token: 4bc995f1-f59c-4a68-833e-647eaaf500a3"})
  ResponseEntity<Object> move();

  /**
   * Player game registration
   */
  @PostMapping("/register")
  @Headers(value = {"X-Auth-Token: 4bc995f1-f59c-4a68-833e-647eaaf500a3"})
  ResponseEntity<Object> register();
}

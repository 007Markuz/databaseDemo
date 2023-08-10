package com.database.demo.controller;

import com.database.demo.repository.ConfigurationRepository;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("database")
@AllArgsConstructor
public class DatabaseControllers {

  ConfigurationRepository repository;
  /**
   * Save Accrual Registry .
   */
  @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> save() {
    ;
    return ResponseEntity.ok(repository.getElement().stream().findFirst().map(strings -> String.join(",", strings)).orElse("fail"));

  }
}

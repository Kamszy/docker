package com.tomtom.docker.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerRestService {

  private static final Path rootFileStorage = Paths.get("/files");

  @PostMapping("saveText")
  public ResponseEntity<String> saveText(@RequestBody final String text) throws IOException {

    final String randomFileName = UUID.randomUUID().toString();

    final File file = rootFileStorage.resolve(randomFileName).toFile();
    file.createNewFile();

    try(final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
      bufferedWriter.write(text);
    }

    return ResponseEntity.ok(String.format("Your text has been saved! FileName: %s", randomFileName));
  }

  @GetMapping("greet")
  public ResponseEntity<String> greet() {

    return ResponseEntity.ok("Hello User");
  }

}

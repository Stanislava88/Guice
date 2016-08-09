package com.clouway.bank.utils;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class HtmlHelper {
  private final String path;

  @Inject
  public HtmlHelper(String path) {
    this.path = path;
  }

  public String loadResource() {
    StringBuilder buffer = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
      String line;
      while ((line = reader.readLine()) != null) {
        buffer.append(line);
      }
      return buffer.toString();
    } catch (IOException e) {
      return "Error 404! Page not found";
    }
  }
}
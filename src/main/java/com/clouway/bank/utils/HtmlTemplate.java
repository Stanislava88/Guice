package com.clouway.bank.utils;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class HtmlTemplate {
  private final String html;
  public final Map<String, String> placeholders = new ConcurrentHashMap<String, String>();

  @Inject
  public HtmlTemplate(String html) {
    this.html = html;
  }

  public void put(String placeHolder, String value) {
    placeholders.put(placeHolder, value);
  }

  public String evaluate() {
    String evaluationResult = html;
    for (String placeHolder : placeholders.keySet()) {
      evaluationResult = evaluationResult.replace("{" + placeHolder + "}", placeholders.get(placeHolder));
    }
    return evaluationResult;
  }

}

package com.clouway.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SecurityBlocker implements MethodInterceptor {
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    Scanner scanner = new Scanner(System.in);

    String password = scanner.nextLine();

    if (password.length() < 4) {
      throw new IllegalStateException("Password is wrong. You cannot " + methodInvocation.getMethod().getName());
    }
    return methodInvocation.proceed();
  }
}

package interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class ValidatorMethodInterceptor implements MethodInterceptor {

  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("Hello, AOP! Invoked BEFORE the requested method.");
    return methodInvocation.proceed();
  }


}

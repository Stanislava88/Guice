package com.clouway.bank.adapter.http;

import com.google.inject.servlet.ServletModule;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class BankGuiceServletModule extends ServletModule {
  @Override
  protected void configureServlets() {
    filter("/*").through(SecurityFilter.class);

    serve("/register").with(RegisterServlet.class);
    serve("/login").with(LoginPageServlet.class);
    serve("/loginController").with(LoginControllerServlet.class);
    serve("/home").with(HomePageServlet.class);
    serve("/logout").with(LogoutServlet.class);
    serve("/transaction").with(TransactionHistoryPageServlet.class);
    serve("/account").with(AccountPageServlet.class);
    serve("/accountController").with(AccountOperationControllerServlet.class);
  }
}

package com.clouway.bank.adapter.http;

import com.clouway.bank.adapter.jdbc.ConnectionProvider;
import com.clouway.bank.adapter.jdbc.db.persistence.PersistentAccountRepository;
import com.clouway.bank.adapter.jdbc.db.persistence.PersistentGuiceModule;
import com.clouway.bank.adapter.jdbc.db.persistence.PersistentSessionRepository;
import com.clouway.bank.adapter.jdbc.db.persistence.PersistentTransactionRepository;
import com.clouway.bank.adapter.jdbc.db.persistence.PersistentUserRepository;
import com.clouway.bank.core.*;
import com.clouway.bank.utils.SessionIdFinder;
import com.clouway.bank.utils.SessionIdGenerator;
import com.clouway.bank.utils.Timeout;
import com.clouway.bank.validator.AmountValidator;
import com.clouway.bank.validator.UserValidator;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class BankGuiceModule extends AbstractModule {
  @Override
  protected void configure() {
    install(new PersistentGuiceModule());

    bind(CurrentDate.class).to(CurrentDateImplementation.class);

    bind(IdGenerator.class).to(SessionIdGenerator.class);

    bind(Integer.class)
            .annotatedWith(Names.named("pageSize"))
            .toInstance(5);

    bind(Validator.class)
            .annotatedWith(Names.named("amountValidator"))
            .toInstance(new AmountValidator());
  }

  @Provides
  Provider<java.sql.Connection> provideConnection() {
    return new ConnectionProvider("jdbc:postgresql://localhost/bank", "postgres", "clouway.com");
  }

  @Provides
  Validator<User> provideUserValidator() {
    return new UserValidator();
  }

  @Provides
  CurrentTime getCurrentTime() {
    return new Timeout(1);
  }

  @Provides
  SessionIdFinder findSession() {
    return new SessionIdFinder("sessionId");
  }
}

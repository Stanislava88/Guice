package com.clouway.bank.adapter.http;

import com.clouway.bank.adapter.jdbc.ConnectionProvider;
import com.clouway.bank.adapter.jdbc.db.persistence.PersistentAccountRepository;
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
    bind(AccountRepository.class).to(PersistentAccountRepository.class);
    bind(SessionRepository.class).to(PersistentSessionRepository.class);
    bind(TransactionRepository.class).to(PersistentTransactionRepository.class);
    bind(UserRepository.class).to(PersistentUserRepository.class);

    bind(CurrentDate.class).to(CurrentDateImplementation.class);

    bind(IdGenerator.class).to(SessionIdGenerator.class);

    bind(String.class)
            .annotatedWith(Names.named("db"))
            .toInstance("jdbc:postgresql://localhost/bank");
    bind(String.class)
            .annotatedWith(Names.named("user"))
            .toInstance("postgres");
    bind(String.class)
            .annotatedWith(Names.named("password"))
            .toInstance("clouway.com");

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
  Validator<User> provideValidator() {
    return new UserValidator();
  }

  @Provides
  CurrentTime getTime() {
    return new Timeout(1);
  }

  @Provides
  SessionIdFinder findSession() {
    return new SessionIdFinder("sessionId");
  }
}

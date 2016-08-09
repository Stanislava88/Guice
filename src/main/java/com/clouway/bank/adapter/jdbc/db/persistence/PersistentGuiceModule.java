package com.clouway.bank.adapter.jdbc.db.persistence;

import com.clouway.bank.adapter.jdbc.ConnectionProvider;
import com.clouway.bank.core.AccountRepository;
import com.clouway.bank.core.Provider;
import com.clouway.bank.core.SessionRepository;
import com.clouway.bank.core.TransactionRepository;
import com.clouway.bank.core.UserRepository;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.sql.Connection;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class PersistentGuiceModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(AccountRepository.class).to(PersistentAccountRepository.class);
    bind(SessionRepository.class).to(PersistentSessionRepository.class);
    bind(TransactionRepository.class).to(PersistentTransactionRepository.class);
    bind(UserRepository.class).to(PersistentUserRepository.class);
  }

  @Provides
  Provider<Connection> provideConnection() {
    return new ConnectionProvider("jdbc:postgresql://localhost/bank", "postgres", "clouway.com");
  }
}


package com.clouway.bank.adapter.jdbc.db.persistence;

import com.clouway.bank.core.AccountRepository;
import com.clouway.bank.core.ConnectionException;
import com.clouway.bank.core.SessionRepository;
import com.clouway.bank.core.TransactionRepository;
import com.clouway.bank.core.UserRepository;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
  Connection provideConnection() {
    try {
      return DriverManager.getConnection("jdbc:postgresql://localhost/bank", "postgres", "clouway.com");
    } catch (SQLException e) {
      throw new ConnectionException("Cannot connect to database");
    }
  }
}


import com.clouway.singleton.EagerSingletonScope;
import com.clouway.singleton.SingletonModule;
import com.clouway.singleton.SingletonScope;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SingletonModuleTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStream() throws Exception {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void cleanUpStream() throws Exception {
    System.setOut(null);

  }

  @Test
  public void oneInstanceIsCreatedOfSingleton() throws Exception {
    Injector injector = Guice.createInjector(new SingletonModule());

    SingletonScope scope1 = injector.getInstance(SingletonScope.class);

    SingletonScope scope2 = injector.getInstance(SingletonScope.class);

    assertThat(scope1, is(sameInstance(scope2)));
  }

  @Test
  public void oneInstanceIsCreatedOfEagerSingleton() throws Exception {
    Injector injector = Guice.createInjector(new SingletonModule());

    EagerSingletonScope scope1 = injector.getInstance(EagerSingletonScope.class);

    EagerSingletonScope scope2 = injector.getInstance(EagerSingletonScope.class);

    assertThat(scope1, is(sameInstance(scope2)));
  }

  @Test
  public void beforeInvokingObjectIsCreatedByEagerSingleton() throws Exception {
    Guice.createInjector(new SingletonModule());

    assertThat("Eager Singleton type is created before first invoking:\n", is(equalTo(outContent.toString())));
  }
}

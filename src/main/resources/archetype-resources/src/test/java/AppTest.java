package $package;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Template App
 */
public class AppTest {

  @Test
  @DisplayName("Example test")
  public void testApp() {
    @SuppressWarnings("unchecked")
    LinkedList<String> mockedList = mock(LinkedList.class);
    when(mockedList.getFirst()).thenReturn("Template App");
    assertThat(App.msg, equalTo(mockedList.get(0)));
  }
}

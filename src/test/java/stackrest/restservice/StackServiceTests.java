package stackrest.restservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import stackrest.restservice.stack.StackService;

@SpringBootTest
public class StackServiceTests {

  @Autowired
  private StackService stackService;

  @Test
  public void initializeTest(){
    int size = 5;
    String result = stackService.initializeStack(size);
    Assertions.assertEquals("Stack created with Size "+size, result);
  }

  @Test
  public void pushTest(){
    boolean res = stackService.push(1);
    Assertions.assertEquals(true, res);
  }

  @Test
  public void popTest(){
    int ex = stackService.peek();
    int res = stackService.pop();
    Assertions.assertEquals(ex, res);
  }
}

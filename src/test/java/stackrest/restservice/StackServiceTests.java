package stackrest.restservice;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import stackrest.restservice.stack.StackService;

@SpringBootTest
public class StackServiceTests {

  @Autowired
  private StackService stackService;

  @Test
  public void initializeTest(){
    String result = stackService.initializeStack(5);
//    Assert
  }

}

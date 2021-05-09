package stackrest.restservice.stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackController {

  @Autowired
  private StackService stackService;

  @RequestMapping(method = RequestMethod.POST, value = "/init/{size}")
  public String initialize(@PathVariable Integer size){
    return stackService.initializeStack(size);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/push/{element}")
  public void push(@PathVariable Integer ele){
    stackService.push(ele);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/pop")
  public int pop(){
    return stackService.pop();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/peek")
  public int peek(){
    return stackService.peek();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/isEmpty")
  public boolean isEmpty(){
    return stackService.isEmpty();
  }

}

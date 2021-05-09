package stackrest.restservice.stack;

import org.springframework.stereotype.Service;

@Service
public class StackService {

  private Integer size;
  private Integer top;
  private int st[] ;

  boolean isEmpty()
  {
    return (top < 0);
  }

  public String initializeStack(Integer size)
  {
    this.size = size;
    st = new int[size];
    top = -1;
   return "Stack created with Size "+size;
  }

  boolean push(int x)
  {
    if (top >= (size - 1)) {
      System.out.println("Stack Overflow");
      return false;
    }
    else {
      st[++top] = x;
      System.out.println(x + " pushed into stack");
      return true;
    }
  }

  int pop()
  {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;
    }
    else {
      int x = st[top--];
      return x;
    }
  }

  int peek()
  {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;
    }
    else {
      int x = st[top];
      return x;
    }
  }

}

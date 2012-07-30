package hour01;

import java.util.Arrays;
import java.util.List;

// by default, methods have "this" pointer
public class Goodbye {

  // by default, params are not final
  public static void main(final String[] args) {
    
    //args = null;
    
    System.out.println("Goodbye, Java");
    
    final int sum = sumOverListOfInts(Arrays.asList(13, 14, 15));
    System.out.println(sum);
  }
  
  public static int sumOverListOfInts(final List<Integer> ns) {
    int acc = 0;
    for (int n : ns) {
      acc = acc + n;
    }
    return acc;
  }

}

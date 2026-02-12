import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void q1Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q1();

     // assertion
     assertEquals(" * * * * * *\n* * * * * *\n * * * * * *\n* * * * * *\n * * * * * *\n* * * * * *\n\n* * * * *\n*       *\n*       *\n*       *\n* * * * *\n\n* * * * * *\n *       *\n  *     *\n   *   *\n    * *\n     *\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q2Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q2();

     // assertion
     assertEquals("          '__'\n          (oo)\n  /========//\n / || XX ||\n*  ||----||\n   VV    VV\n   ''    ''\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q3Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q3();

     // assertion
     assertEquals("Fortnite is awful\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   

   @Test
   public void q4Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q4();

     // assertion
     assertEquals("Don't @ me\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   

   
}

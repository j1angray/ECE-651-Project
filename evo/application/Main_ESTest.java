/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 01:25:35 GMT 2020
 */

package application;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import application.Main;
import javafx.stage.Stage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends application.Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Main main0 = new Main();
      Stage stage0 = mock(Stage.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        main0.start(stage0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class javafx.scene.layout.BorderPane
         //
         verifyException("application.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }
}

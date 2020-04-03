/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 01:26:50 GMT 2020
 */

package application;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import application.Utils;
import javafx.stage.Stage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stage stage0 = mock(Stage.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Utils.start(stage0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class javafx.scene.layout.BorderPane
         //
         verifyException("application.Utils", e);
      }
  }
}
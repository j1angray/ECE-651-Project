/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 03 19:31:17 GMT 2020
 */

package application;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import application.bidItemList;
import javafx.stage.Stage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class bidItemList_ESTest extends application.bidItemList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stage stage0 = mock(Stage.class, new ViolatedAssumptionAnswer());
      bidItemList bidItemList0 = null;
      try {
        bidItemList0 = new bidItemList(stage0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class javafx.scene.control.TableView
         //
         verifyException("application.bidItemList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      bidItemList bidItemList0 = null;
      try {
        bidItemList0 = new bidItemList();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class javafx.scene.control.TableView
         //
         verifyException("application.bidItemList", e);
      }
  }
}

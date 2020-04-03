/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 03 19:24:45 GMT 2020
 */

package application;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import application.BidDetailPage;
import application.share.entity.Lot;
import javafx.beans.property.IntegerProperty;
import javafx.stage.Stage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BidDetailPage_ESTest extends application.BidDetailPage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BidDetailPage bidDetailPage0 = new BidDetailPage();
      Integer integer0 = new Integer(4);
      bidDetailPage0.setIndex(integer0);
      double double0 = bidDetailPage0.getIndex();
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BidDetailPage bidDetailPage0 = new BidDetailPage();
      Integer integer0 = new Integer((-1));
      bidDetailPage0.setIndex(integer0);
      double double0 = bidDetailPage0.getIndex();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BidDetailPage bidDetailPage0 = null;
      try {
        bidDetailPage0 = new BidDetailPage((Stage) null, (Lot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("application.BidDetailPage", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BidDetailPage bidDetailPage0 = new BidDetailPage();
      double double0 = bidDetailPage0.getIndex();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BidDetailPage bidDetailPage0 = new BidDetailPage();
      IntegerProperty integerProperty0 = bidDetailPage0.indexProperty();
      assertNotNull(integerProperty0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BidDetailPage bidDetailPage0 = new BidDetailPage();
      // Undeclared exception!
      try { 
        bidDetailPage0.setIndex((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("application.BidDetailPage", e);
      }
  }
}

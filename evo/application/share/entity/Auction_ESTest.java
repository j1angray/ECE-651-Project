/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 03:42:45 GMT 2020
 */

package application.share.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import application.share.entity.Auction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Auction_ESTest extends Auction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Auction auction0 = new Auction("<6B8r", "<6B8r", "<6B8r");
      auction0.setPublicId((String) null);
      String string0 = auction0.getPublicId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Auction auction0 = new Auction("<6B8r", "<6B8r", "<6B8r");
      String string0 = auction0.getPublicId();
      assertEquals("<6B8r", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Auction auction0 = new Auction("<6B8r", "<6B8r", "<6B8r");
      auction0.setName((String) null);
      String string0 = auction0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Auction auction0 = new Auction("<6B8r", "<6B8r", "<6B8r");
      String string0 = auction0.getName();
      assertEquals("<6B8r", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Auction auction0 = new Auction("", "", "+$-Z;gb'");
      auction0.setKey((String) null);
      String string0 = auction0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Auction auction0 = new Auction("application.share.entity.Auction", "application.share.entity.Auction", (String) null);
      auction0.setKey("");
      String string0 = auction0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Auction auction0 = new Auction("", "", "+$-Z;gb'");
      String string0 = auction0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Auction auction0 = new Auction("", "", "+$-Z;gb'");
      String string0 = auction0.getKey();
      assertEquals("+$-Z;gb'", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Auction auction0 = new Auction("", "", "+$-Z;gb'");
      String string0 = auction0.getPublicId();
      assertEquals("", string0);
  }
}

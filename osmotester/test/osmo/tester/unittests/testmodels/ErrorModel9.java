package osmo.tester.unittests.testmodels;

import osmo.tester.annotation.*;
import osmo.tester.generator.testsuite.TestCase;
import osmo.tester.generator.testsuite.TestSuite;

/** @author Teemu Kanstren */
public class ErrorModel9 {
  private TestSuite suite;

  @BeforeTest
  public void start1() {
  }

  @AfterTest
  public void end() {
  }

  @BeforeSuite
  public void beforeAll() {
  }

  @AfterSuite
  public void endAll() {
  }

  @TestStep("hello")
  public void transition1() {
  }

  @Guard("hello")
  public boolean listCheck() {
    return true;
  }

  @Post("all")
  public void stateOracle() {
  }

  @Pre("all")
  public void beforeEpixx() {
  }

  @EndCondition
  public boolean end1() {
    throw new RuntimeException("@EndCondition fail");
  }

  @OnError
  public void error() {
    TestCase test = suite.getCurrentTest();
    test.setAttribute("error", test.getCurrentStep().getName());
  }
}

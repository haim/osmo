package osmo.tester.gui.jfx.configurationtab.generator;

import osmo.tester.generator.algorithm.FSMTraversalAlgorithm;
import osmo.tester.generator.algorithm.RandomAlgorithm;
import osmo.tester.generator.endcondition.EndCondition;
import osmo.tester.generator.endcondition.Probability;
import osmo.tester.gui.jfx.executiontab.greedy.IterationInfoListener;
import osmo.tester.optimizer.greedy.IterationListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Teemu Kanstren
 */
public class GreedyParameters {
  private int threshold = 1;
  private int maxTests = 0;
  private int population = 1000;
  private int timeout = 10;
  private TimeUnit timeUnit = TimeUnit.SECONDS;
  private IterationListener listener = null;
  private EndCondition testEndCondition = new Probability(0.2);
  private FSMTraversalAlgorithm algorithm = new RandomAlgorithm();

  public GreedyParameters() {
  }

  public void setThreshold(int threshold) {
    this.threshold = threshold;
  }

  public void setMaxTests(int maxTests) {
    this.maxTests = maxTests;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public void setTimeout(int timeout, TimeUnit timeUnit) {
    this.timeout = timeout;
    this.timeUnit = timeUnit;
  }

  public int getThreshold() {
    return threshold;
  }

  public long getTimeoutInSeconds() {
    return timeUnit.convert(timeout, TimeUnit.SECONDS);
  }

  public int getTimeout() {
    return timeout;
  }

  public void setTimeout(int timeout) {
    this.timeout = timeout;
  }

  public TimeUnit getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }

  public int getMaxTests() {
    return maxTests;
  }

  public int getPopulation() {
    return population;
  }

  public IterationListener getListener() {
    return listener;
  }

  public void setListener(IterationListener listener) {
    this.listener = listener;
  }

  public void setTestEndCondition(EndCondition testEndCondition) {
    this.testEndCondition = testEndCondition;
  }

  public EndCondition getTestEndCondition() {
    return testEndCondition;
  }

  public void setAlgorithm(FSMTraversalAlgorithm algorithm) {
    this.algorithm = algorithm;
  }

  public FSMTraversalAlgorithm getAlgorithm() {
    return algorithm;
  }
}
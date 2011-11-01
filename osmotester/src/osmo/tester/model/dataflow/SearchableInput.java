package osmo.tester.model.dataflow;

import java.util.Collection;

/** @author Teemu Kanstren */
public abstract class SearchableInput<T> implements Input<T> {
  private String name;
  private InputObserver<T> observer = null;
  protected boolean allSupported = false;

  protected SearchableInput() {
  }

  public boolean isAllSupported() {
    return allSupported;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setObserver(InputObserver<T> observer) {
    this.observer = observer;
  }

  public void observe(T value) {
    if (name == null) {
      return;
    }
    observer.value(name, value);
  }

  public Collection<? extends Object> getOptions() {
    return null;
  }
}

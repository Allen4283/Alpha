package sandbox;

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshRate;
  private int responseTime;

  Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshRate;
  }

  @Override
  public int getResponseTime() {
    return this.responseTime;
  }

  @Override
  public String toString() {
    return "Resolution : " + getResolution() + "\n" + "Refresh Rate : " + getRefreshRate() + "\n"
        + "Response Time : " + getResponseTime();
  }
}

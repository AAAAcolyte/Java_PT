import java.util.Arrays;
import java.util.Comparator;

public class SantasMap {

  public static final int MAX_STOPS = 36;

  MapEntry[][] map;
  Coordinate[] stops;

  public SantasMap(MapEntry[][] map) {
    this.map = map;
    this.stops = findStopsSorted();
  }

  public Coordinate[] getStops() {
    return stops;
  }

  public MapEntry[][] getMap() {
    return map;
  }

  private Coordinate[] findStops() {
    // TODO: Part II, a.
    return null;
  }

  private Coordinate[] findStopsSorted() {
    // calls findStops() and returns sorted results
    // sorts ascendingly first by y, then by x coordinate
    Coordinate[] stops = findStops();
    if (stops != null) {
      Arrays.sort(stops, new Comparator<Coordinate>() {
        public int compare(Coordinate c1, Coordinate c2) {
          if (c1 == null) return -1;
          if (c2 == null) return 1;
          return c1.getY() == c2.getY() ? c1.getX() - c2.getX() : c1.getY() - c2.getY();
        }
      });
    }
    return stops;
  }

  public int[][] getDistanceMatrix() {
    // TODO: Part II, b.
    return null;
  }

}

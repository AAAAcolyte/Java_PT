import java.util.ArrayList;
import java.util.List;

public class Route {

  private final List<Coordinate> stops = new ArrayList<Coordinate>();

  private final SantasMap map;

  public Route(SantasMap map) {
    this.map = map;
  }

  public List<Coordinate> getStops() {
    return stops;
  }

  public void add(Coordinate place) {
    // TODO: Part III, a.
  }

  public int totalLength() {
    // TODO: Part III, b.
    return 0;
  }

  public char[][] getAnnotatedMap() {
    // TODO: Part V.
    return null;
  }

  public void printAnnotatedMap() {
    char[][] annotatedMap = getAnnotatedMap();
    for (int y = 0; y < annotatedMap[0].length; y++) {
      for (int x = 0; x < annotatedMap.length; x++) {
        System.out.print(annotatedMap[x][y]);
      }
      System.out.println();
    }
  }

}

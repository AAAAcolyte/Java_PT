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
    stops.add(place);
  }

  public int totalLength() {
    // TODO: Part III, b.
    int length = 0;
    for(int i = 0; i < stops.size() - 1; i++){
      length += stops.get(i).distanceTo(stops.get(i+1));
    }
    return length;
  }

  public char[][] getAnnotatedMap() {
    // TODO: Part V.
    char[][] annotatedMap = map.toCharMap();
    Coordinate thisStop;
    for(int i = 0; i < stops.size(); i++){
      thisStop = stops.get(i);
      annotatedMap[thisStop.getX()][thisStop.getY()] = (char)(i+'0');
    }
    return annotatedMap;
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

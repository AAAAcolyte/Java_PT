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
    Coordinate[] stops = new Coordinate[MappingUtils.numberOfStops(map)];
    int tmp = 0;
    for(int i = 0; i < map.length; i++){
      for(int j = 0; j < map[0].length; j++){
        if(MappingUtils.isStop(map[i][j])){
          stops[tmp] = new Coordinate(i,j);
          tmp ++;
        }
      }
    }
    return stops;
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
    int[][] distanceMatrix = new int[stops.length][stops.length];
    for(int i = 0; i < stops.length; i++){
      for(int j = i; j < stops.length;j++){
        if(i == j){
          distanceMatrix[i][j] = 0;
        }
        else{
          distanceMatrix[i][j] = stops[i].distanceTo(stops[j]);
          distanceMatrix[j][i] = distanceMatrix[i][j];
        }
      }
    }
    return distanceMatrix;
  }
  public char[][] toCharMap(){
    char[][] charMap = new char[map.length][map[0].length];
    for(int i = 0; i < map.length; i++){
      for(int j = 0; j < map[0].length; j++){
        charMap[i][j] = MappingUtils.mapEntryToChar(map[i][j]);
      }
    }
    return charMap;
  }

}

public class MappingUtils {

  public static MapEntry charToMapEntry(char c) {
    // TODO: Part I, a, 1.
    switch(c){
        case ' ' : return MapEntry.EMPTY;
        case '*' : return MapEntry.FOREST;
        case '~' : return MapEntry.WATER;
        case '^' : return MapEntry.MOUNTAINS;
        case '#' : return MapEntry.LAND_BORDER;
        case '.' : return MapEntry.VILLAGE;
        case '@' : return MapEntry.TOWN;
        case '?' : return MapEntry.SANTAS_STARTING_LOCATION;
        default : return MapEntry.EMPTY;
    }
  }

  public static char mapEntryToChar(MapEntry e) {
    // TODO: Part I, a, 2.
      switch(e){
          case EMPTY : return ' ';
          case FOREST : return '*';
          case WATER : return '~';
          case MOUNTAINS : return '^';
          case LAND_BORDER : return '#';
          case VILLAGE : return '.';
          case TOWN : return '@';
          case SANTAS_STARTING_LOCATION : return '?';
          default : return ' ';
      }
  }

  public static MapEntry[][] parseMap(char[] description, int width, int height) {
    // TODO: Part I, a, 3.
    MapEntry[][] myMap = new MapEntry[width][height];
    for(int i = 0; i < height; i++){
        for(int j = 0; j < width; j++){
            myMap[j][i] = charToMapEntry(description[i*width+j]);
        }
    }
    return myMap;
  }

  public static boolean isStop(MapEntry place) {
    // TODO: Part I, a, 4.
    switch(place){
        case VILLAGE:return true;
        case TOWN:return true;
        case SANTAS_STARTING_LOCATION:return true;
        default : return false;
    }
  }
  public static int numberOfStops(MapEntry[][] places){
      int number = 0;
      for(int i = 0; i < places.length; i++){
          for(int j = 0; j < places[0].length; j++){
              if(isStop(places[i][j])){
                  number++;
              }
          }
      }
     return number;
  }
}

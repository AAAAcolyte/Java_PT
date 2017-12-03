

public class RouteUtils {

  public static long getNumRoutes(long stops) {
    // TODO: Part I, b.
    long num = fac(stops)/2;
    return num;
  }
  private static long fac(long n){
    long result = 1;
    while(n>0){
      result *= n;
      n--;
    }
    return result;
  }
  public static Route findNearestNeighbourRoute(SantasMap map) {
    // TODO: Part IV.
    Route myRoute = new Route(map);
    int[][] myDistanceMatrix = map.getDistanceMatrix();
    Coordinate[] santaStops = map.getStops();
    boolean[] checkList = new boolean[santaStops.length];
    myRoute.add(santaStops[0]);
    checkList[0] = true;
    int currPos = 0;
    int nextTarget;
    while(!isAllTrue(checkList)){
      nextTarget = 1;
      while(nextTarget == currPos || checkList[nextTarget]){
        nextTarget ++;
        }
      for(int i = nextTarget; i < santaStops.length; i++){
        if(i != currPos && checkList[i] == false && myDistanceMatrix[currPos][i]
                < myDistanceMatrix[currPos][nextTarget]){
          nextTarget = i;
        }
      }
      myRoute.add(santaStops[nextTarget]);
      currPos = nextTarget;
      checkList[nextTarget] = true;
    }
    return myRoute;
  }
  private static boolean isAllTrue(boolean[] boolArray){
    for(int i = 0; i < boolArray.length; i++){
      if(!boolArray[i])
        return false;
    }
    return true;
  }
}

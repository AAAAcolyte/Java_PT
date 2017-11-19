import java.util.ArrayList;
import java.util.List;

public class Tests {

  public static final int LARGE_MAP_WIDTH = 97;
  public static final int LARGE_MAP_HEIGHT = 57;
  public final static char[] LARGE_MAP = (
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~##########~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#        ##~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#          #~~~~~~~~~~~~~~~~~~~~~~~~~#####~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#          #~~~~~~## ~~~~~~~~~~~~###   ##~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~?~~~~~~##          @ ##### #~~~~~~~~~~####    #~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#                 #~~~~######         #####~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~###             #~~~~~#                   #~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#~~~~~             #####                    #~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~# ###  ~                                      ####          " +
    "~~~~~~~~~~~~~~~~~~~~~~~~~#########~ ~#       ~~  @            @                       #          " +
    "~~~~~~~~~~~~~~         ~#        #~~#          ~~                     ~~~              #         " +
    "~~~~~~~~~~~              ~#       ##                                     ~             #         " +
    "~~~~~~~~~~               #        @                                                    #         " +
    "~~~~~~~                  #              @                                             #          " +
    "~~~~                    #                                                             #          " +
    "~~~    ~~               #                                                              ###       " +
    "~~~    ~~~           #                                                         @          #      " +
    "~~   ~~~             ###                                                     @           #       " +
    "~                       #                      @       @                                  #      " +
    "                       #                                                                   #     " +
    "                     #              @                           @                          #     " +
    "               ######       @                      ********                               #      " +
    "              #                                  *************                             #     " +
    "               #                               **************                               ##   " +
    "                #    @  @  @                      *********                                   #  " +
    "               #                             @                         @                       # " +
    "              #      @                                                              @    ##     #" +
    "             #                  *******                                                 #  #  ## " +
    "              #       @        * ******                    @                 @         #    ##   " +
    "              #         @      ********                                            ####          " +
    "               #^               * ** *                  ******            ^^^^^^###              " +
    "               ##^^^                                  *********  ^     ^^^^#^###                 " +
    "                #^^^^       @                          ********  ^^  ^^^### #                    " +
    "              ##^^^^                                             ^^^^###                         " +
    "              #^^^^                   @                           ^^^^##                         " +
    "              ##^                @                                ^^^^^^##                       " +
    "                ##^^                           *****                ^^^^^#                       " +
    "                #^^^^                        *****                    ^^^#                       " +
    "                ## ^^^^      ***    @                                   ^^#                      " +
    "                 #^^^^      ****                            @            **###                   " +
    "                  ##  @  ## ***                                          *****##                 " +
    "                    #####  ###                                            ******##               " +
    "                              ###  @          ******                  @     ******###            " +
    "                               #****           *****                           ******#           " +
    "                              #****      @                                      ******#          " +
    "                             #*****                                              *####           " +
    "                            #*****                                                #              " +
    "                           #****                          @                   ####               " +
    "                          #******                               @           ##                   " +
    "                          #**@***                           ~               ^#                   " +
    "                          #******  ##                       ~ ~          ~~ ^^#                  " +
    "                          #****** #  ## ~~~~^^^^^^^^^^^^^^^   ^^^^^^^^ ##^^##^^#                 " +
    "                          ##########   ####~~~~##^^^^^####^^^^^^#######  ##  #^^#                " +
    "                                          #####  #^^^^#   #^^^##              ##                 " +
    "                                                  ####     ###                                   ").toCharArray();

  public static void main(String[] args) {

          if (args.length == 1) {

            switch (Integer.valueOf(args[0])) {
              case 0:
                System.out.println("Running charToPieceTests");
                charToPieceTests();               // Part I, a, 1
                break;

              case 1:
                System.out.println("Running mapEntryToCharTests");
                mapEntryToCharTests();            // Part I, a, 2
                break;

              case 2:
                System.out.println("Running parseMapTests");
                parseMapTests();                  // Part I, a, 3
                break;

              case 3:
                System.out.println("Running isStopTests");
                isStopTests();                    // Part I, a, 4
                break;

              case 41:
                System.out.println("Running getNumRoutesTests_OneStop");
                getNumRoutesTests_OneStop();              // Part I, b
                break;
              case 42:
                System.out.println("Running getNumRoutesTests_TwoStops");
                getNumRoutesTests_TwoStops();              // Part I, b
                break;
              case 43:
                System.out.println("Running getNumRoutesTests_ThreeStops");
                getNumRoutesTests_ThreeStops();              // Part I, b
                break;
              case 44:
                System.out.println("Running getNumRoutesTests_FourStops");
                getNumRoutesTests_FourStops();              // Part I, b
                break;
              case 45:
                System.out.println("Running getNumRoutesTests_FiveStops");
                getNumRoutesTests_FiveStops();              // Part I, b
                break;
              case 46:
                System.out.println("Running getNumRoutesTests_TenStops");
                getNumRoutesTests_TenStops();              // Part I, b
                break;
              case 47:
                System.out.println("Running getNumRoutesTests_TwentyStops");
                getNumRoutesTests_TwentyStops();              // Part I, b
                break;

              case 5:
                System.out.println("Running findStopsTests");
                findStopsTests();                 // Part II, a
                break;

              case 6:
                System.out.println("Running getDistanceMatrixTests");
                getDistanceMatrixTests();         // Part II, b
                break;

              case 7:
                System.out.println("Running routeAddTests");
                routeAddTests();                  // Part III, a
                break;

              case 8:
                System.out.println("Running routeTotalLengthTests");
                routeTotalLengthTests();          // Part III, b
                break;

              case 91:
                System.out.println("Running findNearestNeighbourRouteTests_SmallMap");
                findNearestNeighbourRouteTests_SmallMap(); // Part IV
                break;
              case 92:
                System.out.println("Running findNearestNeighbourRouteTests_LargeMap");
                findNearestNeighbourRouteTests_LargeMap(); // Part IV
                break;

              case 101:
                System.out.println("Running getAnnotatedMapTests_SmallMap");
                getAnnotatedMapTests_SmallMap();           // Part V
                break;
              case 102:
                System.out.println("Running getAnnotatedMapTests_LargeMap");
                getAnnotatedMapTests_LargeMap();           // Part V
                break;

              default:
                System.out.println("Unknown test number");
                break;
            }
          }
          else {
            System.out.println("Please define a valid test number as an argument.");
          }
        }


  private static void printCoordinates(Coordinate[] cs) {
    System.out.print("[");
    for (Coordinate c : cs) {
      System.out.print("(" + c.getX() + ", " + c.getY() + ") ");
    }
    System.out.println("]");
  }

  private static void printCoordinates(List<Coordinate> cs) {
    System.out.print("[");
    for (int i = 0; i < cs.size(); i++) {
      System.out.print("(" + cs.get(i).getX() + ", " + cs.get(i).getY() + ") ");
		}
    System.out.println("]");
  }


  public static void charToPieceTests() {
    System.out.println("Empty: ............  " + MappingUtils.charToMapEntry(' '));
    System.out.println("Forest: ...........  " + MappingUtils.charToMapEntry('*'));
    System.out.println("Water: ............  " + MappingUtils.charToMapEntry('~'));
    System.out.println("Mountains: ........  " + MappingUtils.charToMapEntry('^'));
    System.out.println("Land border: ......  " + MappingUtils.charToMapEntry('#'));
    System.out.println("Village: ..........  " + MappingUtils.charToMapEntry('.'));
    System.out.println("Town: .............  " + MappingUtils.charToMapEntry('@'));
    System.out.println("Santas starting loc: " + MappingUtils.charToMapEntry('?'));
  }


  public static void mapEntryToCharTests() {
    System.out.println("Empty: ............  " + MappingUtils.mapEntryToChar(MapEntry.EMPTY));
    System.out.println("Forest: ...........  " + MappingUtils.mapEntryToChar(MapEntry.FOREST));
    System.out.println("Water: ............  " + MappingUtils.mapEntryToChar(MapEntry.WATER));
    System.out.println("Mountains: ........  " + MappingUtils.mapEntryToChar(MapEntry.MOUNTAINS));
    System.out.println("Land border: ......  " + MappingUtils.mapEntryToChar(MapEntry.LAND_BORDER));
    System.out.println("Village: ..........  " + MappingUtils.mapEntryToChar(MapEntry.VILLAGE));
    System.out.println("Town: .............  " + MappingUtils.mapEntryToChar(MapEntry.TOWN));
    System.out.println("Santas starting loc: " + MappingUtils.mapEntryToChar(MapEntry.SANTAS_STARTING_LOCATION));
  }


  public static void parseMapTests() {
    System.out.println("Parsing map:\n" +
      "  * \n" +
      "~^# \n" +
      ".@? \n\n");
    MapEntry[][] map = MappingUtils.parseMap((
      "  * " +
      "~^# " +
      ".@? ").toCharArray(), 4, 3);

    System.out.println("Printing result using mapEntryToChar():");
    for (int y = 0; y < map[0].length; y++) {
      for (int x = 0; x < map.length; x++) {
        System.out.print(MappingUtils.mapEntryToChar(map[x][y]));
      }
      System.out.println();
    }

  }


  public static void isStopTests() {
    System.out.println("Empty: ............  " + MappingUtils.isStop(MapEntry.EMPTY));
    System.out.println("Forest: ...........  " + MappingUtils.isStop(MapEntry.FOREST));
    System.out.println("Water: ............  " + MappingUtils.isStop(MapEntry.WATER));
    System.out.println("Mountains: ........  " + MappingUtils.isStop(MapEntry.MOUNTAINS));
    System.out.println("Land border: ......  " + MappingUtils.isStop(MapEntry.LAND_BORDER));
    System.out.println("Village: ..........  " + MappingUtils.isStop(MapEntry.VILLAGE));
    System.out.println("Town: .............  " + MappingUtils.isStop(MapEntry.TOWN));
    System.out.println("Santas starting loc: " + MappingUtils.isStop(MapEntry.SANTAS_STARTING_LOCATION));
  }


  public static void findStopsTests() {
    MapEntry[][] map = MappingUtils.parseMap((
      " ?* " +
      "~^#@" +
      ".@  ").toCharArray(), 4, 3);

    System.out.println("Printing stops for map:\n" +
      " ?* \n" +
      "~^#@\n" +
      ".@  \n\n");
    Coordinate[] stops = new SantasMap(map).getStops();
    printCoordinates(stops);
  }


  public static void getDistanceMatrixTests() {
    MapEntry[][] map = MappingUtils.parseMap((
      "?  @ " +
      "     " +
      "     " +
      "@   @").toCharArray(), 5, 4);
    System.out.println("Printing distance matrix for map:\n" +
      "?  @ \n" +
      "     \n" +
      "     \n" +
      "@   @\n\n");

    SantasMap santasMap = new SantasMap(map);
    int[][] distances = santasMap.getDistanceMatrix();
    for (int y = 0; y < distances[0].length; y++) {
      for (int x = 0; x < distances.length; x++) {
        System.out.print((x > 0 ? "\t" : "") + distances[x][y]);
      }
      System.out.println();
    }
  }


  public static void getNumRoutesTests_OneStop() {
    System.out.println(RouteUtils.getNumRoutes(1));
  }


  public static void getNumRoutesTests_TwoStops() {
    System.out.println(RouteUtils.getNumRoutes(2));
  }


  public static void getNumRoutesTests_ThreeStops() {
    System.out.println(RouteUtils.getNumRoutes(3));
  }


  public static void getNumRoutesTests_FourStops() {
    System.out.println(RouteUtils.getNumRoutes(4));
  }


  public static void getNumRoutesTests_FiveStops() {
    System.out.println(RouteUtils.getNumRoutes(5));
  }


  public static void getNumRoutesTests_TenStops() {
    System.out.println(RouteUtils.getNumRoutes(10));
  }


  public static void getNumRoutesTests_TwentyStops() {
    System.out.println(RouteUtils.getNumRoutes(20));
  }


  public static void routeAddTests() {
    MapEntry[][] map = MappingUtils.parseMap((
      "?  @ " +
        "     " +
        "     " +
        "@   @").toCharArray(), 5, 4);
    SantasMap santasMap = new SantasMap(map);
    System.out.println("Creating route for map:\n" +
      "?  @ \n" +
      "     \n" +
      "     \n" +
      "@   @\n\n");
    Route route = new Route(santasMap);
    System.out.println("Route after initialisation:");
    printCoordinates(route.getStops());

    route.add(new Coordinate(0, 0));
    System.out.println("Route with first stop:");
    printCoordinates(route.getStops());

    route.add(new Coordinate(4, 3));
    route.add(new Coordinate(0, 3));
    route.add(new Coordinate(3, 0));
    route.add(new Coordinate(0, 0));
    System.out.println("Full route:");
    printCoordinates(route.getStops());

    System.out.println("Initialising new empty route:");
    printCoordinates(new Route(santasMap).getStops());
  }


  public static void routeTotalLengthTests() {
    MapEntry[][] map = MappingUtils.parseMap((
      "?  @ " +
      "     " +
      "     " +
      "@   @").toCharArray(), 5, 4);
    SantasMap santasMap = new SantasMap(map);
    System.out.println("Creating route for map:\n" +
      "?  @ \n" +
      "     \n" +
      "     \n" +
      "@   @\n\n");
    Route route = new Route(santasMap);
    System.out.println("Route after initialisation:");
    System.out.println(route.totalLength());

    route.add(new Coordinate(0, 0));

    System.out.println("Route with first stop:");
    System.out.println(route.totalLength());

    route.add(new Coordinate(4, 3));
    route.add(new Coordinate(0, 3));
    route.add(new Coordinate(3, 0));
    route.add(new Coordinate(0, 0));

    System.out.println("Full route:");
    System.out.println(20919);

    System.out.println("Initialising new empty route:");
    System.out.println(new Route(santasMap).totalLength());
  }


  public static void findNearestNeighbourRouteTests_SmallMap() {
    MapEntry[][] map = MappingUtils.parseMap((
      "?  @ " +
      "     " +
      "     " +
      "@   @").toCharArray(), 5, 4);
    SantasMap santasMap = new SantasMap(map);
    System.out.println("Finding shortest nn-path for map:\n" +
      "?  @ \n" +
      "     \n" +
      "     \n" +
      "@   @\n\n");

    Route route = RouteUtils.findNearestNeighbourRoute(santasMap);

    if (route == null) {
      System.out.println("Route is null!");
      return;
    }

    Coordinate[] coordinates = route.getStops().toArray(new Coordinate[0]);

    printCoordinates(coordinates);

    System.out.println("Total length: " + route.totalLength());
  }


  public static void findNearestNeighbourRouteTests_LargeMap() {
    // Test on the large map

    MapEntry[][] lme = MappingUtils.parseMap(LARGE_MAP, LARGE_MAP_WIDTH, LARGE_MAP_HEIGHT);
    SantasMap lm = new SantasMap(lme);

    Route largeRoute = RouteUtils.findNearestNeighbourRoute(lm);

    System.out.println("Route for large map (Germany):");
    Coordinate[] lrc = largeRoute.getStops().toArray(new Coordinate[0]);
    printCoordinates(lrc);

    System.out.println("Total length: " + largeRoute.totalLength());
  }


  public static void getAnnotatedMapTests_SmallMap() {
    MapEntry[][] map1 = MappingUtils.parseMap((
      "? *@*" +
      "~~~  " +
      " ^^# " +
      "@   @").toCharArray(), 5, 4);

    System.out.println("Annotating map:\n" +
      "? *@*\n" +
      "~~~  \n" +
      " ^^# \n" +
      "@   @\n\n");

    SantasMap santasMap1 = new SantasMap(map1);
    Route route1 = RouteUtils.findNearestNeighbourRoute(santasMap1);
    char[][] am1 = route1.getAnnotatedMap();

    for (int y = 0; y < am1[0].length; y++) {
      for (int x = 0; x < am1.length; x++) {
        System.out.print(am1[x][y]);
      }
      System.out.println();
    }
  }


  public static void getAnnotatedMapTests_LargeMap() {
    MapEntry[][] map2 = MappingUtils.parseMap(LARGE_MAP, LARGE_MAP_WIDTH, LARGE_MAP_HEIGHT);
    SantasMap santasMap2 = new SantasMap(map2);
    Route route2 = RouteUtils.findNearestNeighbourRoute(santasMap2);
    char[][] am2 = route2.getAnnotatedMap();

    System.out.println("Spot-checking various coordinates of stops for annotated large map (Germany):");
    System.out.print(am2[31][6]);
    System.out.print(am2[34][14]);
    System.out.print(am2[28][23]);
    System.out.print(am2[27][26]);
    System.out.print(am2[24][26]);
    System.out.print(am2[21][26]);
    System.out.print(am2[64][50]);
    System.out.println(am2[58][49]);
  }

}

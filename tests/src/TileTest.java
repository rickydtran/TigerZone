package src;

import org.junit.Assert;
import GameState.*;
import Utilities.*;

import java.awt.Point;
import java.util.*;

import static org.junit.Assert.*;

public class TileTest {

    @org.junit.Test(expected = RuntimeException.class)
    public void getValidTile() throws Exception {
      String name = "JJJJ-";
      Tile tile = new Tile(name);
    }

    @org.junit.Test()
    public void isNameTrue(){
      String name = "TTTT-";
      Tile tile = new Tile(name);
      assertEquals("JJJJX", tile.toString(name));
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void testFeatureMethodWithSubgrid() throws Exception {
      String name = "TJTJ-";
      Tile tile = new Tile(name);
      tile.getFeature(0, 2);
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void testFeatureMethodWithPoint() throws Exception {
      String name = "TJJT-";
      Tile tile = new Tile(name);
      tile.getFeature(new Point(0, 1));
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void testIntializerForSubgrid() throws Exception {
      String name = "TJJT-";
      Tile tile = new Tile(name);
      tile.initializeSubGrid(name);
    }

}

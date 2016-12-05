package src;

import org.junit.Assert;
import GameState.*;
import Utilities.*;

import java.awt.Point;
import java.util.*;

import static org.junit.Assert.*;

public class MeepleTest {

    @org.junit.Test()
    public void getValidTile() {
      Player p = new Player();
      Meeple m = new Meeple(p);
      assertEquals(m.getOwner(), p);
    }
}

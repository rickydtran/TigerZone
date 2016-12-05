package src;

import org.junit.Assert;
import GameState.*;
import Utilities.*;
import java.awt.Point;
import java.util.*;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EngineTest {

    @org.junit.Test(expected=RuntimeException.class)
    public void getDrawTile() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long seed = testNumber.nextLong();
       engine1.newGame(seed);
       engine1.drawTile();
    }

    @org.junit.Test(expected=RuntimeException.class)
    public void testAddTileToBoard() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long seed = testNumber.nextLong();
       engine1.newGame(seed);
       engine1.addTileToBoard(new Point(0, 1), new Tile('JJTJX'), engine1.board.Orientation.NORTH);
    }

    @org.junit.Test(expected=RuntimeException.class)
    public void testSetPlayer() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long seed = testNumber.nextLong();
       engine1.newGame(seed);
       engine1.setPlayers(new List<Player> players);
    }

    @org.junit.Test(expected=RuntimeException.class)
    public void testSetDeck() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long seed = testNumber.nextLong();
       engine1.newGame(seed);
       engine1.setDeck(new Deck);
    }

    @org.junit.Test(expected=RuntimeException.class)
    public void testSetBoard() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long seed = testNumber.nextLong();
       engine1.newGame(seed);
       engine1.setBoard(new Board);
    }
}

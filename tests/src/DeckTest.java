package src;

import org.junit.Assert;
import GameState.*;
import Utilities.*;
import java.awt.Point;
import java.util.*;

import static org.junit.Assert.*;

public class DeckTest {

    @org.junit.Test(expected=RuntimeException.class);
    public void testDrawTile() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       engine1.deck.drawTile();
    }

    @org.junit.Test(expected=RuntimeException.class);
    public void isHasTileToDraw() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       engine1.deck.hasTileToDraw();
    }

    @org.junit.Test(expected=RuntimeException.class);
    public void testAddTile() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       UniformPicker<Tile> tilePicker = new UniformPicker<>(seed);
       engine1.deck.addTilesToPicker(tilePicker, new Tile("TJTT-"), 4);
    }

    @org.junit.Test;
    public void isLoadingJson() {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       JsonObject json = new JsonObject();
       engine1.deck.fromJson(engine1, json);
    }

    @org.junit.Test;
    public void isSendingJson() {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       engine1.deck.fromJson(engine1.deck);
    }
}

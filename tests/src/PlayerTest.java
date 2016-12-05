package src;

import org.junit.Assert;
import GameState.*;
import Utilities.*;
import java.awt.Point;
import java.util.*;

import static org.junit.Assert.*;

public class DeckTest {

    @org.junit.Test(expected=RuntimeException.class);
    public void getNameDefault() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       engine1.player.Player();
    }

    @org.junit.Test(expected=RuntimeException.class);
    public void getNameOverLoadedConstructor() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       String name = "Jay";
       engine1.player.Player(name);
    }

    @org.junit.Test(expected=RuntimeException.class);
    public void isPlaceMeeple() throws Exception {
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       engine1.player.placeMeeple();
    }

    @org.junit.Test();
    public void validName(){
       Engine engine1 = new Engine();
       Random testNumber = new Random();
       long gameNumber = testNumber.nextLong();
       engine1.newGame(gameNumber);
       String name = "Jay";
       engine1.player.Player(name);
       assertEqual("Jay", engine1.player.toString());
    }
}

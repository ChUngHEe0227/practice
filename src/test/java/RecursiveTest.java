import Recursive.GridRobot;
import Recursive.Thripstep;

import org.junit.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RecursiveTest {
    Thripstep thripstep = new Thripstep();
    GridRobot gridRobot= new GridRobot();
    @Test
    public void 트리플스텝테스트(){
        assertThat(thripstep.countWay(4),is(7));
    }
    @Test
    public void 그리드로봇테스트(){
        Boolean[][] maze1 = {{true,true,false},{true,true,false},{true,true,true}};
        Boolean[][] maze2 = {{true,false,false},{false,false,false},{true,true,true}};
        ArrayList<Point> path = new ArrayList<Point>();
        HashSet<Point> failPoint = new HashSet<Point>();
        assertTrue(gridRobot.getPath(maze1,2,2,path,failPoint));
        assertFalse(gridRobot.getPath(maze2,2,2,path,failPoint));
    }
}

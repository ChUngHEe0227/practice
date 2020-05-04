import Recursive.GetSubset;
import Recursive.GridRobot;
import Recursive.Perms;
import Recursive.Thripstep;

import org.junit.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class RecursiveTest {
    Thripstep thripstep = new Thripstep();
    GridRobot gridRobot = new GridRobot();
    GetSubset getSubset = new GetSubset();
    Perms perms = new Perms();
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
    @Test
    public void 부분집합테스트(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
    }
    @Test
    public void 순열만들기(){
        ArrayList<String> testArray1 = new ArrayList<String>();
        ArrayList<String> testArray2 = new ArrayList<String>();
        testArray1.add("h");
        testArray2.add("he");
        testArray2.add("eh");
        //assertThat(perms.getPerms("h"),testArray1);
        //assertSame(perms.getPerms("he"),testArray2);

    }
}

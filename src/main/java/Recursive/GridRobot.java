package Recursive;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

public class GridRobot {
    public ArrayList<Point> getPath(Boolean[][] maze){
        if(maze==null||maze.length==0)return null;
        ArrayList<Point>path = new ArrayList<Point>();
        HashSet<Point> failPoint = new HashSet<Point>();
        if(getPath(maze,maze.length-1,maze[0].length-1,path,failPoint)){
            return path;
        }
        return null;
    }

    public boolean getPath(Boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failPoint) {
        if(col<0||row<0||!maze[row][col]){
            return false;
        }
        Point p =new Point(col,row);
        if(failPoint.contains(p))return false;

        Boolean isAtOrogin = (row==0)&&(col==0);
        if(isAtOrogin||getPath(maze,row,col-1,path,failPoint)||getPath(maze,row-1,col,path,failPoint)){
            path.add(p);
            return true;
        }
        failPoint.add(p);
        return false;
    }
}

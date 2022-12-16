package com.company;

import java.util.Arrays;

public class backtrackingbase {
    static void allPathPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allPathPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze.length-1){
            allPathPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathPrint(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}

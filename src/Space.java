/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naota Man
 */
public class Space {
    private int row;
    private int col;
    private boolean visited;
    private int numVisit;
    
    public Space(){
        row = 0;
        col = 0;
        visited = false;
        numVisit = 0;
    }
    
    public Space(int col, int row){
        this.row = row;
        this.col = col;
        this.visited = false;
        this.numVisit = 0;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getNumVisit() {
        return numVisit;
    }

    public void setNumVisit(int numVisit) {
        this.numVisit = numVisit;
    }

    public String toString() {
        return String.format("[ %02d ]", this.numVisit);
    }
    
    public String testString(){
        return "Space (" + this.col + ", " + this.row + "), Visited: " + this.visited +", at: " + this.numVisit;
    }
    
}

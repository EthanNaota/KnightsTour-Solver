
public class Board {
    final int col = 6;
    final int row = 6;
    public Space[][] board = new Space[col][row];
    
    public Board(){
        for (int i=0; i<this.col; i++){
            for(int j=0; j<this.row; j++){
                this.board[i][j] = new Space();
            }
        }
    
        
        for (int i=0; i<this.col; i++){
            for(int j=0; j<this.row; j++){
                this.board[i][j].setCol(i);
                this.board[i][j].setRow(j);
            }
        }
    }
    
    public Space getSpace(int col, int row){
        return this.board[col][row];
    }

    public void displayBoard() {
        for (int i=0; i<this.col; i++){
            for(int j=0; j<this.row;j++){
                System.out.print(this.board[i][j].toString());
            }
            System.out.println("");
        }
        System.out.println("");
    }    
}

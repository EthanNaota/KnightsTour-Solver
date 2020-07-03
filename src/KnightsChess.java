public class KnightsChess {

    public static void main(String[] args) {
        Board board = new Board();
        int col = 4;
        int row = 4;
        
        visited(board, col, row,1);
        board.displayBoard();
        System.out.println(solve(board, col, row, 1));
    }
    
    public static boolean solve(Board board, int col, int row, int numMoves){
        if(numMoves == board.col * board.row){
            board.displayBoard();
            return true;
        }

        
        // up 2 and right 1
        try{
            if(!board.getSpace(col+1, row-2).isVisited()){
                numMoves++;
                visited(board, col+1, row-2, numMoves);
                
                if(solve(board, col+1, row-2, numMoves)==true){
                    return true;
                } else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // up 1 and right 2
        try{
            if(!board.getSpace(col+2, row-1).isVisited()){
                numMoves++;
                visited(board, col+2, row-1, numMoves);
                
                if(solve(board, col+2, row-1, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // down 1 and right 2
        try{
            if(!board.getSpace(col+2, row+1).isVisited()){
                numMoves++;
                visited(board, col+2, row+1, numMoves);
                
                if(solve(board, col+2, row+1, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // down 2 and right 1
        try{
            if(!board.getSpace(col+1, row+2).isVisited()){
                numMoves++;
                visited(board, col+1, row+2, numMoves);
                
                if(solve(board, col+1, row+2, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // down 2 and left 1
        try{
            if(!board.getSpace(col-1, row+2).isVisited()){
                numMoves++;
                visited(board, col-1, row+2, numMoves);
                
                if(solve(board, col-1, row+2, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // down 1 and left 2
        try{
            if(!board.getSpace(col-2, row+1).isVisited()){
                numMoves++;
                visited(board, col-2, row+1, numMoves);
                
                if(solve(board, col-2, row+1, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // up 1 and left 2
        try{
            if(!board.getSpace(col-2, row-1).isVisited()){
                numMoves++;
                visited(board, col-2, row-1, numMoves);
                
                if(solve(board, col-2, row-1, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        // up 2 and left 1
        try{
            if(!board.getSpace(col-1, row-2).isVisited()){
                numMoves++;
                visited(board, col-1, row-2, numMoves);
                
                if(solve(board, col-1, row-2, numMoves)==true){
                    return true;
                }else {
                    numMoves--;
                }
            }
        } catch(IndexOutOfBoundsException e){
            
        }
        
        unvisited(board, col, row, numMoves);
        return false;
        
    }
    
    public static void visited(Board board, int col, int row, int numVisit){
        board.getSpace(col, row).setVisited(true);
        board.getSpace(col, row).setNumVisit(numVisit);
    }
    
    public static void unvisited(Board board, int col, int row, int numVisit){
        board.getSpace(col, row).setVisited(false);
        board.getSpace(col, row).setNumVisit(0);
    }
}

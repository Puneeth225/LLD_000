import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1",crossPiece);

        PlayingPieceO roundPiece = new PlayingPieceO();
        Player player2 = new Player("Player2",roundPiece);

        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);

    }

    public String startGame() {
        boolean noWin = true;
        while (noWin) {
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWin = false;
                continue;
            }
            System.out.print("Player: "+playerTurn.name +" Enter row,column: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] vals = s.split(",");
            int inputRow = Integer.valueOf(vals[0]);
            int inputCol = Integer.valueOf(vals[1]);
            boolean pieceAdded = gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
            if(!pieceAdded) {
                System.out.println("Incorrect Position Chosen, Try Again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isWinnerFound(inputRow,inputCol,playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }
        return "Tie";
    }

    public boolean isWinnerFound(int r,int c, PieceType pieceType) {
        boolean rMatch = true, cMatch = true, diagMatch = true, antiDiagMatch = true;
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[r][i] == null || gameBoard.board[r][i].pieceType != pieceType) {
                rMatch = false;
            }
        }
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][c] == null || gameBoard.board[i][c].pieceType != pieceType) {
                cMatch = false;
            }
        }
        for(int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagMatch = false;
            }
        }
        for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType!=pieceType){
                antiDiagMatch = false;
            }
        }
        return rMatch || cMatch || diagMatch || antiDiagMatch;
    }
}

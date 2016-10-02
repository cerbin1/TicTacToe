public class Game {
    void run() {
        Console console = new Console();
        Board board = new Board();
        Player player = new Player();

        board.setCharBoard();
        console.displayCharBoard(board.getCharBoard());

        board.setBooleanBoard();


        while(true) {
            if (player.getTurn() % 2 == 0) {
                console.circleMove();
                player.setMove();
                if(board.getBooleanBoardValueAtIndex(player.getMove())){
                    System.out.println("Tu juz ktos postawil znak. Sprobuj jeszcze raz");
                }
                else {
                    board.setCircle(player.getMove());
                    board.setBooleanBoardTrueAtIndex(player.getMove());

                    console.displayCharBoard(board.getCharBoard());
                    player.incrementTurn();
                }
            }
            else {
                console.crossMove();
                player.setMove();
                board.setCross(player.getMove());
                console.displayCharBoard(board.getCharBoard());
                player.incrementTurn();
            }
        }
    }
}

/*

class Border {
    boolean[] booleanBoard;

    public Border() {
    this.booleanBoard = new boolean[9];
    initalizeBooleanBoard();
}

    public boolean getValueAtIndex(int index) {
        if (index >= booleanBoard.lenght) // throw error nie wiem jak xD
            return booleanBoard[index];
    }

    public void setValueAtIndex(int index, boolean value) {
        if (index >= booleanBoard.lenght) // throw error nie wiem jak xD

            this.booleanBoard[index] = value;
    }

    private void initalizeBooleanBoard() {
        for (int i = 0; i < booleanBoard.length; i++) {
            booleanBoard[i] = false;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Border boerd = new Border();
        border.setValueAtIndex(5, true);
    }
}*/

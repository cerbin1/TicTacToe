public class Game {
    void run() {
        Console console = new Console();
        Board board = new Board();
        Player player = new Player();

        int number = 1;
        board.setCharBoard();
        console.displayCharBoard(board.getCharBoard());

        while(true) {
            if (number % 2 == 1) {
                console.circleMove();
                player.setMove();
                board.setCircle(player.getMove());
                console.displayCharBoard(board.getCharBoard());
                number ++;
            }
            else {
                console.crossMove();
                player.setMove();
                board.setCross(player.getMove());
                console.displayCharBoard(board.getCharBoard());
                number ++;
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

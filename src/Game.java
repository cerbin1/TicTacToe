public class Game {
    void run() {
        Console console = new Console();
        Board board = new Board();

        board.setCharBoard();
        console.displayCharBoard(board.getCharBoard());
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

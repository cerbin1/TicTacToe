class Board {
    private char[] charBoard;
    private boolean[] booleanBoard;

    Board() {
        initializeCharBoard();
        initializeBooleanBoard();
    }

    private void initializeCharBoard() {
        charBoard = new char[9];
    }

    void fillCharBoard() {
        for (int i = 0; i < charBoard.length; i++) {
            charBoard[i] = (char) (i + 49);
        }
    }

    char[] getCharBoard() {
        return charBoard;
    }

    private void initializeBooleanBoard() {
        booleanBoard = new boolean[9];
    }

    void fillBooleanBoard() {
        for (int i = 0; i < booleanBoard.length; i++) {
            booleanBoard[i] = false;
        }
    }

    boolean getBooleanBoardValueAtIndex(int index) {
        return booleanBoard[index - 1];
    }

    void setBooleanBoardTrueAtIndex(int index) {
        booleanBoard[index - 1] = true;
    }

    void setCircle(int index) {
        charBoard[index - 1] = 'o';
    }

    void setCross(int index) {
        charBoard[index - 1] = 'x';
    }

}
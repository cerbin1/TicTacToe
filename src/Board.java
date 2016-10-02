class Board {
    private char[] charBoard;
    private boolean[] booleanBoard;

    public Board() {
        initializeCharBoard();
        initializeBooleanBoard();
    }


    public void initializeCharBoard() {
        charBoard = new char[9];
    }

    public void fillCharBoard() {
        for (int i = 0; i < charBoard.length; i++) {
            charBoard[i] = (char) (i + 49);
        }
    }

    public char[] getCharBoard() {
        return charBoard;
    }

    public void initializeBooleanBoard() {
        booleanBoard = new boolean[9];
    }

    public void fillBooleanBoard() {
        for (int i = 0; i < booleanBoard.length; i++) {
            booleanBoard[i] = false;
        }
    }

    public boolean getBooleanBoardValueAtIndex(int index) {
        return booleanBoard[index - 1];
    }

    public void setBooleanBoardTrueAtIndex(int index) {
        booleanBoard[index - 1] = true;
    }

    public void setCircle(int index) {
        charBoard[index - 1] = 'o';
    }

    public void setCross(int index) {
        charBoard[index - 1] = 'x';
    }

}
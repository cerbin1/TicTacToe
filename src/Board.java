public class Board {
    private char[] charBoard;

    public Board() {
        initializeCharBoard();
    }


    public void initializeCharBoard() {
        charBoard = new char[9];
    }

    public void setCharBoard() {
        for (int i = 0; i < charBoard.length; i++) {
            charBoard[i] = (char) (i + 49);
        }
    }

    public char[] getCharBoard() {
        return charBoard;
    }

    public void setMove(int index) {
        charBoard[index - 1] = 'o';

    }




/*
    public char getCharBoard(int n) {
        return charBoard[n];
    }

    public char getCharBoardAtIndex(int numberOfIndex) {
        return charBoard[numberOfIndex];
    }



    void fillCharBoard() {
        charBoard = new char[9];
        for (int i = 0; i < this.charBoard.length; i++) {
            this.charBoard[i] = (char) i;
        }
    }

    void displayCharBoard() {
        System.out.println("[" + charBoard[0] + "]" + "[" + charBoard[1] + "]" + "[" + charBoard[2] + "]");
        System.out.println("[" + charBoard[3] + "]" + "[" + charBoard[4] + "]" + "[" + charBoard[5] + "]");
        System.out.println("[" + charBoard[6] + "]" + "[" + charBoard[7] + "]" + "[" + charBoard[8] + "]");
    }*/
}
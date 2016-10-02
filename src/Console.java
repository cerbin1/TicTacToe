class Console {
    void displayHelloMessage() {
        System.out.println("Welcome in the TicTacToe game");
    }

    void displayInstructions() {
        System.out.println("Enter the number of index where you want to put sign.");
    }

    public void displayCharBoard(char[] charBoard) {
        System.out.println("[" + charBoard[0] + "]" + "[" + charBoard[1] + "]" + "[" + charBoard[2] + "]");
        System.out.println("[" + charBoard[3] + "]" + "[" + charBoard[4] + "]" + "[" + charBoard[5] + "]");
        System.out.println("[" + charBoard[6] + "]" + "[" + charBoard[7] + "]" + "[" + charBoard[8] + "]");
    }

    public void circleMove() {
        System.out.println("Circle's move");
    }
    public void crossMove() {
        System.out.println("Cross's move");
    }
    public void playerWrongMove() {
        System.out.println("Tu juz ktos postawil znak. Sprobuj jeszcze raz");
    }
}

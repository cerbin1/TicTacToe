public class Console {
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
}

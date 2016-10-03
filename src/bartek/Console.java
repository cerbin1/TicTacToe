package bartek;

class Console {
    void displayHelloMessage() {
        System.out.println("Welcome in the TicTacToe game");
    }

    void displayInstructions() {
        System.out.println("Enter the number of index where you want to put sign.");
    }

    void displayCharBoard(char[] charBoard) {
        System.out.println("[" + charBoard[0] + "]" + "[" + charBoard[1] + "]" + "[" + charBoard[2] + "]");
        System.out.println("[" + charBoard[3] + "]" + "[" + charBoard[4] + "]" + "[" + charBoard[5] + "]");
        System.out.println("[" + charBoard[6] + "]" + "[" + charBoard[7] + "]" + "[" + charBoard[8] + "]");
    }

    void askForCircleMove() { // TODO metody ask powinny zrobić scanner.nextLine() i zwracać tekst
        System.out.println("Circle move");
    }

    void askForCrossMove() {
        System.out.println("Cross move");
    }

    void thisFieldIsNotEmpty() {
        System.out.println("This field is not empty. Try to choose another.");
    }

    void drawn() {
        System.out.println("Drawn! Nobody wins.");
    }

    void wrongMove() {
        System.out.println("You entered wrong move. Try do it again.");
    }
}

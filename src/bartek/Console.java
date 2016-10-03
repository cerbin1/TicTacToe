package bartek;

class Console {
    void displayHelloMessage() {
        System.out.println("Welcome in the TicTacToe game");
    }

    void displayInstructions() {
        System.out.println("Enter the number of index where you want to put sign.");
    }

    void displayCharBoard(Board b) {
        System.out.println("[" + b.getCharBoard()[0] + "]" + "[" + b.getCharBoard()[1] + "]" + "[" + b.getCharBoard()[2] + "]");
        System.out.println("[" + b.getCharBoard()[3] + "]" + "[" + b.getCharBoard()[4] + "]" + "[" + b.getCharBoard()[5] + "]");
        System.out.println("[" + b.getCharBoard()[6] + "]" + "[" + b.getCharBoard()[7] + "]" + "[" + b.getCharBoard()[8] + "]");
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

    void circleWins() {
        System.out.println("Circle wins!");
    }

    void crossWins() {
        System.out.println("Cross wins!");
    }
}

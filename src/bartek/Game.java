package bartek;

class Game {
    void run() {
        Console console = new Console();
        Board board = new Board();
        Player player = new Player();

        board.fillCharBoard();
        board.fillBooleanBoard();
        console.displayHelloMessage();
        console.displayInstructions();
        console.displayCharBoard(board);

        while (true) {
            if (player.getPlayersTurn() % 2 == 0) {
                console.askForCircleMove();
                while (true) {
                    if (player.setPlayersMove()) {
                        console.wrongMove();
                        console.askForCircleMove();
                        console.displayCharBoard(board);
                    } else {
                        break;
                    }
                }
                if (board.getBooleanBoardValueAtIndex(player.getPlayersMove())) {
                    console.thisFieldIsNotEmpty();
                } else {
                    board.setCircle(player.getPlayersMove());
                    board.setBooleanBoardTrueAtIndex(player.getPlayersMove());
                    if (player.checkIfPlayerWins(board)) {
                        console.displayCharBoard(board);
                        break;
                    }
                    player.incrementTurn();
                }
            } else {
                console.askForCrossMove();
                while (true) {
                    if (player.setPlayersMove()) {
                        console.wrongMove();
                        console.askForCrossMove();
                        console.displayCharBoard(board);
                    } else {
                        break;
                    }
                }
                if (board.getBooleanBoardValueAtIndex(player.getPlayersMove())) {
                    console.thisFieldIsNotEmpty();
                } else {
                    board.setCross(player.getPlayersMove());
                    board.setBooleanBoardTrueAtIndex(player.getPlayersMove());
                    if (player.checkIfPlayerWins(board)) {
                        console.displayCharBoard(board);
                        break;
                    }
                    player.incrementTurn();
                }
            }
            if (player.getPlayersTurn() == 9) {
                console.drawn();
                console.displayCharBoard(board);
                break;
            }
            console.displayCharBoard(board);
        }
    }
}

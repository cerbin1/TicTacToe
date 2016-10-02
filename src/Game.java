class Game {
    void run() {
        Console console = new Console();
        Board board = new Board();
        Player player = new Player();

        board.fillCharBoard();
        board.fillBooleanBoard();
        console.displayHelloMessage();
        console.displayInstructions();
        console.displayCharBoard(board.getCharBoard());

        while (true) {
            if (player.getPlayersTurn() % 2 == 0) {
                console.askForCircleMove();
                while (true) {
                    if (player.setPlayersMove()) {
                        console.wrongMove();
                        console.askForCircleMove();
                        console.displayCharBoard(board.getCharBoard());
                    } else {
                        break;
                    }
                }
                if (board.getBooleanBoardValueAtIndex(player.getPlayersMove())) {
                    console.thisFieldIsNotEmpty();
                } else {
                    board.setCircle(player.getPlayersMove());
                    board.setBooleanBoardTrueAtIndex(player.getPlayersMove());
                    if (player.checkIfPlayerWins(board.getCharBoard())) {
                        console.displayCharBoard(board.getCharBoard());
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
                        console.displayCharBoard(board.getCharBoard());
                    } else {
                        break;
                    }
                }
                if (board.getBooleanBoardValueAtIndex(player.getPlayersMove())) {
                    console.thisFieldIsNotEmpty();
                } else {
                    board.setCross(player.getPlayersMove());
                    board.setBooleanBoardTrueAtIndex(player.getPlayersMove());
                    if (player.checkIfPlayerWins(board.getCharBoard())) {
                        console.displayCharBoard(board.getCharBoard());
                        break;
                    }
                    player.incrementTurn();
                }
            }
            if (player.getPlayersTurn() == 9) {
                console.drawn();
                break;
            }
            console.displayCharBoard(board.getCharBoard());
        }
    }
}

class Game {
    void run() {
        Console console = new Console();
        Board board = new Board();
        Player player = new Player();

        board.setCharBoard();
        console.displayCharBoard(board.getCharBoard());

        board.setBooleanBoard();


        while (true) {
            if (player.getTurn() % 2 == 0) {
                console.circleMove();
                player.setMove();
                if (board.getBooleanBoardValueAtIndex(player.getMove())) {
                    console.playerWrongMove();
                } else {
                    board.setCircle(player.getMove());
                    board.setBooleanBoardTrueAtIndex(player.getMove());
                    console.displayCharBoard(board.getCharBoard());
                    player.incrementTurn();
                }
            } else {
                console.crossMove();
                player.setMove();
                if (board.getBooleanBoardValueAtIndex(player.getMove())) {
                    console.playerWrongMove();
                } else {
                    board.setCross(player.getMove());
                    board.setBooleanBoardTrueAtIndex(player.getMove());
                    console.displayCharBoard(board.getCharBoard());
                    player.incrementTurn();
                }
            }
        }
    }
}

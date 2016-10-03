package bartek;

import java.util.Scanner;

class Player {
    private final Scanner scanner = new Scanner(System.in);  // TODO to nie powinno być tu

    private Console console = new Console();

    private int playersMove;
    private int playersTurn = 0;
    private char playersCharacter; // TODO to powinien byc enum

    boolean setPlayersMove() {
        playersMove = Integer.parseInt(scanner.nextLine());
        return (playersMove < 1) || (playersMove > 10);
    }

    int getPlayersMove() {
        return playersMove;
    }

    void incrementTurn() {
        playersTurn++;
    }

    int getPlayersTurn() {
        return playersTurn;
    }

    boolean checkIfPlayerWins(Board b) {
        if (playersTurn % 2 == 0) { // TODO to do wydzielenia
            playersCharacter = 'o';
        } else {
            playersCharacter = 'x';
        }
        if (((b.getCharBoard()[0] == playersCharacter) && (b.getCharBoard()[1] == playersCharacter) && (b.getCharBoard()[2] == playersCharacter)) ||
                ((b.getCharBoard()[3] == playersCharacter) && (b.getCharBoard()[4] == playersCharacter) && (b.getCharBoard()[5] == playersCharacter)) ||
                ((b.getCharBoard()[6] == playersCharacter) && (b.getCharBoard()[7] == playersCharacter) && (b.getCharBoard()[8] == playersCharacter)) ||
                ((b.getCharBoard()[0] == playersCharacter) && (b.getCharBoard()[3] == playersCharacter) && (b.getCharBoard()[6] == playersCharacter)) ||
                ((b.getCharBoard()[1] == playersCharacter) && (b.getCharBoard()[4] == playersCharacter) && (b.getCharBoard()[7] == playersCharacter)) ||
                ((b.getCharBoard()[2] == playersCharacter) && (b.getCharBoard()[5] == playersCharacter) && (b.getCharBoard()[8] == playersCharacter)) ||
                ((b.getCharBoard()[0] == playersCharacter) && (b.getCharBoard()[4] == playersCharacter) && (b.getCharBoard()[8] == playersCharacter))) {
            checkWhoWins();
            return true;
        } else {
            return false;
        }
    }

    private void checkWhoWins() {
        if (playersCharacter == 'o') {
            console.circleWins();
        } else {
            console.crossWins();
        }
    }

}

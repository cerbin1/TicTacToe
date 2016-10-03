package bartek;

import java.util.Scanner;

class Player {
    private final Scanner scanner = new Scanner(System.in);  // TODO to nie powinno być tu

    private int playersMove;
    private int playersTurn = 0;

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
        char playersCharacter; // TODO to powinien byc enum
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
            if (playersCharacter == 'o') { // TODO ten cały if powinien być gdzieś indziej.
                System.out.println("Circle wins!");
            } else {
                System.out.println("Cross wins!");
            }
            return true;
        } else {
            return false;
        }
    }

}

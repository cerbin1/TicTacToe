import java.util.Scanner;

class Player {
    private final Scanner scanner = new Scanner(System.in);

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

    boolean checkIfPlayerWins(char[] charBoard) {
        char playersCharacter;
        if (playersTurn % 2 == 0) {
            playersCharacter = 'o';
        } else {
            playersCharacter = 'x';
        }
        if (((charBoard[0] == playersCharacter) && (charBoard[1] == playersCharacter) && (charBoard[2] == playersCharacter)) ||
                ((charBoard[3] == playersCharacter) && (charBoard[4] == playersCharacter) && (charBoard[5] == playersCharacter)) ||
                ((charBoard[6] == playersCharacter) && (charBoard[7] == playersCharacter) && (charBoard[8] == playersCharacter)) ||
                ((charBoard[0] == playersCharacter) && (charBoard[3] == playersCharacter) && (charBoard[6] == playersCharacter)) ||
                ((charBoard[1] == playersCharacter) && (charBoard[4] == playersCharacter) && (charBoard[7] == playersCharacter)) ||
                ((charBoard[2] == playersCharacter) && (charBoard[5] == playersCharacter) && (charBoard[8] == playersCharacter)) ||
                ((charBoard[0] == playersCharacter) && (charBoard[4] == playersCharacter) && (charBoard[8] == playersCharacter))) {
            if (playersCharacter == 'o') {
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

import java.util.Scanner;

class Player {
    public final Scanner scanner = new Scanner(System.in);

    private int playersMove;
    private int playersTurn = 0;

    void setPlayersMove() {
        playersMove = Integer.parseInt(scanner.nextLine());
    }

    public int getPlayersMove() {
        return playersMove;
    }

    public void incrementTurn() {
        playersTurn++;
    }

    public int getPlayersTurn() {
        return playersTurn;
    }

    public boolean checkIfPlayerWins(char[] charBoard) {
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

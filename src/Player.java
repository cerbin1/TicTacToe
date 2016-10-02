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
        char znak;
        if (playersTurn % 2 == 0) {
            znak = 'o';
        } else {
            znak = 'x';
        }
        if (((charBoard[0] == znak) && (charBoard[1] == znak) && (charBoard[2] == znak)) ||
                ((charBoard[3] == znak) && (charBoard[4] == znak) && (charBoard[5] == znak)) ||
                ((charBoard[6] == znak) && (charBoard[7] == znak) && (charBoard[8] == znak)) ||
                ((charBoard[0] == znak) && (charBoard[3] == znak) && (charBoard[6] == znak)) ||
                ((charBoard[1] == znak) && (charBoard[4] == znak) && (charBoard[7] == znak)) ||
                ((charBoard[2] == znak) && (charBoard[5] == znak) && (charBoard[8] == znak)) ||
                ((charBoard[0] == znak) && (charBoard[4] == znak) && (charBoard[8] == znak))) {
            if (znak == 'o') {
                System.out.println("kolko wygralo");
            } else {
                System.out.println("krzyzyk wygral");
            }
            return true;
        } else {
            return false;
        }
    }

}

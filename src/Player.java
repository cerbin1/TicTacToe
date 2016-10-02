import java.util.Scanner;

class Player {
    public final Scanner scanner = new Scanner(System.in);

    private int move;
    private int turn = 0;

    void setMove() {
        move = Integer.parseInt(scanner.nextLine());
    }

    public int getMove() {
        return move;
    }

    public void incrementTurn() {
        turn++;
    }

    public int getTurn() {
        return turn;
    }

    public boolean checkIfPlayerWins(char[] charBoard) {
        char znak;
        if (turn % 2 == 0) {
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

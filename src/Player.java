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

}

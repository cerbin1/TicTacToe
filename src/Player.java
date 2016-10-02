import java.util.Scanner;

public class Player {
    public final Scanner scanner = new Scanner(System.in);

    private int move;

    void setMove() {
        move = Integer.parseInt(scanner.nextLine());
    }

    public int getMove() {
        return move;
    }

}

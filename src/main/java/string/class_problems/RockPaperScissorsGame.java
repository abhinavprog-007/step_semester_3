import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return "Draw";
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) return "Player Wins";
        return "Computer Wins";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 5;
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = new String[rounds], computerMoves = new String[rounds], results = new String[rounds];
        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = scanner.nextLine();
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);
            playerMoves[i] = playerMove; computerMoves[i] = computerMove; results[i] = result;
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            System.out.println("Computer Move: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println();
        }
        System.out.println("------------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < rounds; i++)
            System.out.printf("%-8d %-15s %-15s %-15s%n", i + 1, playerMoves[i], computerMoves[i], results[i]);
        System.out.println("------------------------------------------------");
        System.out.println("Wins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win %%  : %.1f%%%n", (wins * 100.0) / rounds);
        scanner.close();
    }
}
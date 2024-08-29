package src.ColletionsHTs;
import java.util.*;
public class Player {

        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            if (a.score == b.score) {
                return a.name.compareTo(b.name);
            } else {
                return b.score - a.score;
            }
        }
    }

    class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            Player[] players = new Player[n];
            Checker checker = new Checker();

            for (int i = 0; i < n; i++) {
                String name = scan.next();
                int score = scan.nextInt();
                players[i] = new Player(name, score);
            }
            scan.close();

            Arrays.sort(players, checker);

            for (int i = 0; i < players.length; i++) {
                System.out.println(players[i].name + " " + players[i].score);
            }
        }
    }


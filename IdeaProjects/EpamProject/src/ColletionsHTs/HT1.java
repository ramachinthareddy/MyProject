package src.ColletionsHTs;
import java.util.ArrayList;
import java.util.Scanner;
public class HT1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numLines = scanner.nextInt();
            ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

            for (int i = 0; i < numLines; i++) {
                int numIntegers = scanner.nextInt();
                ArrayList<Integer> line = new ArrayList<>();

                for (int j = 0; j < numIntegers; j++) {
                    line.add(scanner.nextInt());
                }

                lines.add(line);
            }

            int numQueries = scanner.nextInt();

            for (int i = 0; i < numQueries; i++) {
                int lineIndex = scanner.nextInt();
                int position = scanner.nextInt();

                if (lineIndex >= 1 && lineIndex <= numLines) {
                    ArrayList<Integer> line = lines.get(lineIndex - 1);

                    if (position >= 1 && position <= line.size()) {
                        System.out.println(line.get(position - 1));
                    } else {
                        System.out.println("ERROR!");
                    }
                } else {
                    System.out.println("ERROR!");
                }
            }

            scanner.close();
        }
    }


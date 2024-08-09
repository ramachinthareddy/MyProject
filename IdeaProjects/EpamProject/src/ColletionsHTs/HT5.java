package ColletionsHTs;
import java.util.*;
public class HT5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                int q = scanner.nextInt();
                TreeMap<Integer, Integer> map = new TreeMap<>();

                while (q-- > 0) {
                    char operation = scanner.next().charAt(0);

                    switch (operation) {
                        case 'a':
                            int key = scanner.nextInt();
                            int value = scanner.nextInt();
                            map.put(key, value);
                            break;
                        case 'b':
                            int queryKey = scanner.nextInt();
                            int queryValue = map.getOrDefault(queryKey, -1);
                            System.out.print(queryValue + " ");
                            break;
                        case 'c':
                            System.out.print(map.size() + " ");
                            break;
                        case 'd':
                            int removeKey = scanner.nextInt();
                            map.remove(removeKey);
                            break;
                        case 'e':
                            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                                System.out.print(entry.getKey() + " ");
                            }
                            break;
                    }
                }

                System.out.println();
            }

            scanner.close();
        }
    }


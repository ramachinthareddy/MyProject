package ColletionsHTs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneBook {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine(); // consume the newline character after the integer

            Map<String, String> phoneBook = new HashMap<>();

            // Read the phone book entries
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                String phoneNumber = scanner.nextLine();
                phoneBook.put(name, phoneNumber);
            }

            // Read the queries
            while (scanner.hasNextLine()) {
                String query = scanner.nextLine();
                String phoneNumber = phoneBook.get(query);
                if (phoneNumber != null) {
                    System.out.println(query + "=" + phoneNumber);
                } else {
                    System.out.println("Not found");
                }
            }

            scanner.close();
        }
    }


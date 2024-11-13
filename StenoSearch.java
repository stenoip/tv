import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StenoSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        
        // Sample data
        data.add("apple pie recipe");
        data.add("banana smoothie recipe");
        data.add("cherry pie recipe");
        data.add("date and walnut cake recipe");
        data.add("elderberry syrup recipe");

        System.out.println("Welcome to StenoSearch!");
        System.out.print("Enter your search query: ");
        String query = scanner.nextLine().toLowerCase();

        List<String> results = search(data, query);

        if (results.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Search results:");
            for (String result : results) {
                System.out.println(result);
            }
        }

        scanner.close();
    }

    public static List<String> search(List<String> data, String query) {
        List<String> results = new ArrayList<>();
        for (String item : data) {
            if (item.toLowerCase().contains(query)) {
                results.add(item);
            }
        }
        return results;
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter table size: ");
        int tableSize = scanner.nextInt();

        System.out.print("Enter initial hash value: ");
        int initialHashValue = scanner.nextInt();

        System.out.print("Enter hash multiplier: ");
        int hashMultiplier = scanner.nextInt();

        System.out.print("Enter relative prime value: ");
        int relativePrime = scanner.nextInt();

        StringHash hashTable = new StringHash(tableSize, initialHashValue, hashMultiplier, relativePrime);

        String input;
        while (true) {
            System.out.println("1. Search String");
            System.out.println("2. Add String");
            System.out.println("3. Remove String");
            System.out.println("4. Display Table");
            System.out.println("5. Resize Table");
            System.out.println("Q. Quit");
            System.out.print("Choice: ");

            String choice = scanner.next();
            if (choice.equals("Q")) break;
            switch (choice) {
                case "1" : {
                    System.out.print("String to search for: ");
                    input = scanner.next();
                    hashTable.contains(input);
                    break;
                }
                case "2" : {
                    System.out.print("String to add: ");
                    input = scanner.next();
                    hashTable.add(input);
                    break;
                }
                case "3" : {
                    System.out.print("String to remove: ");
                    input = scanner.next();
                    hashTable.remove(input);
                    break;
                }
                case "4" : {
                    hashTable.displayTable();
                    break;
                }
                case "5" : {
                    hashTable.resize();
                    break;
                }
                default : {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }
    }
}
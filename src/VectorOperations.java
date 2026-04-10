import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        
        while (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                break;
            }
            
            switch (choice) {
                case 1:
                    String name1 = scanner.next();
                    students.add(name1);
                    System.out.println("Added");
                    break;
                    
                case 2:
                    String name2 = scanner.next();
                    int index = scanner.nextInt();
                    students.add(index - 1, name2);
                    System.out.println("Inserted");
                    break;
                    
                case 3:
                    String name3 = scanner.next();
                    students.remove(name3);
                    System.out.println("Removed");
                    break;
                    
                case 4:
                    System.out.println(students);
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeList {
    static ArrayList<Integer> tree = new ArrayList<>();

    // Insert element into the tree
    public static void insert(int value) {
        tree.add(value);
        System.out.println("Inserted: " + value);
    }

    // Search for an element in the tree
    public static boolean search(int value) {
        return tree.contains(value);
    }

    // Delete an element from the tree
    public static void delete(int value) {
        int index = tree.indexOf(value);
        if (index == -1) {
            System.out.println("Element not found.");
            return;
        }

        int lastIndex = tree.size() - 1;
        // Replace the element to be deleted with the last element
        tree.set(index, tree.get(lastIndex));
        tree.remove(lastIndex);
        System.out.println("Deleted: " + value);
    }

    // Inorder Traversal (Left, Root, Right)
    public static void inorderTraversal(int index) {
        if (index >= tree.size()) return;

        inorderTraversal(2 * index + 1);       // left
        System.out.print(tree.get(index) + " ");  // root
        inorderTraversal(2 * index + 2);       // right
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\nBinary Tree Operations Using List");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    insert(value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    delete(value);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    if (search(value))
                        System.out.println("Element found.");
                    else
                        System.out.println("Element not found.");
                    break;
                case 4:
                    System.out.print("Inorder Traversal: ");
                    inorderTraversal(0);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
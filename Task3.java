import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        int size = numbers.length;

        System.out.print("Original: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();
        while (index < 0 || index >= size) {
            System.out.print("Invalid index. Enter 0-" + (size - 1) + ": ");
            index = sc.nextInt();
        }

        for (int i = index; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        size--;

        System.out.print("Updated: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

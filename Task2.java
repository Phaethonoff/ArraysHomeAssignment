public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 25, 8, 30, 15, 30};
        int[] arr2 = {5, 5, 5, 5, 5, 5};

        findSecondLargest(arr1);
        findSecondLargest(arr2);
    }

    static void findSecondLargest(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        boolean found = false;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest && (!found || arr[i] > second)) {
                second = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest distinct number.");
        }
        System.out.println();
    }
}

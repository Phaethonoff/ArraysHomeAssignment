public class Task4 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        boolean hasDuplicates = false;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) {
                continue;
            }

            boolean repeatsLater = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    repeatsLater = true;
                    break;
                }
            }

            if (repeatsLater) {
                if (!hasDuplicates) {
                    System.out.print("Duplicate numbers: ");
                    hasDuplicates = true;
                }
                System.out.print(arr[i] + " ");
            }
        }

        if (hasDuplicates) {
            System.out.println();
        } else {
            System.out.println("No duplicate numbers.");
        }
    }
}

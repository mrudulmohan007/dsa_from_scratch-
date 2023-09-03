package Arrays;

public class countduplicateitems {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 5, 6, 7, 7 };

        int totalDuplicates = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    totalDuplicates++;
                    break;
                    // Once a duplicate is found, break inner loop
                }
            }
        }

        System.out.println("Total number of duplicate elements: " + totalDuplicates);

    }


}

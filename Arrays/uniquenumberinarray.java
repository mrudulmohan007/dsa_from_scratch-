package Arrays;

public class uniquenumberinarray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 7};

        System.out.println("Unique elements in the array:=> ");

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
           int flag=0;

            // Check if the current element is a duplicate
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                     flag=1;
                    break;
                }
            }

            // If the element is unique, print it
            if (flag==0) {
                System.out.println(array[i]);
            }
        }
    }
}

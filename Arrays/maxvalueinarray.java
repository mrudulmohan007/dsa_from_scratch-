package Arrays;

public class maxvalueinarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(max(arr));
    }

    static int max(int[]arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}

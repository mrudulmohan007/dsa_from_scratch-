
//our task is to  arrange or sort the same elements of an array to the last
public class Sample {
    public static int[] SwaptoEnd(int array[],int target) {
        for(int j=array.length-1;j>0;j--) {
            if(array[j]!=target) {
                for(int i=0;i<j;i++) {
                    if(array[i]==target) {
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;

                    }

                }

            }

        }

        return array;




    }
    public static void main(String ar[]) {
        int []array= {6,1,6,8,10,4,15,6,3,9,6};
        int target=6;
        int []result=SwaptoEnd(array,target);
        for(int i=0;i<array.length;i++) {
            System.out.println(result[i]);

        }

    }

}
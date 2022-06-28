import java.util.Arrays;

public class Main
{
    public static int[] maxset(int[] A) {
        int start_index = -1, end_index = -1, maxSubArray = -1, currSum = 0, temp_start_index=-1, temp_end_index=-1, sum=0;
        int n = A.length;
        for(int i=0;i<n;i++){
            if(A[i] >= 0){
                if(temp_end_index == (i-1)){
                    if(temp_start_index == -1){
                        temp_start_index = i;
                    }
                    temp_end_index = i;
                    currSum += A[i];
                }
                else{
                    temp_start_index = i;
                    temp_end_index = i;
                    currSum = A[i];
                }
                if(currSum > sum){
                    start_index = temp_start_index;
                    end_index = temp_end_index;
                }
            }

        }
        int[] result = new int[end_index-start_index+1];
        if(start_index == -1){
            return new int[]{};
        }
        else{
            for(int i=start_index;i<(end_index+1);i++){
                result[i-start_index] = A[i];
            }
            return result;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, -7, 2, 5};
        int[] result = maxset(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + ", ");

        }
    }
}



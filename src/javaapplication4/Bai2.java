
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int i, sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float) sum / arr.length;
        float minDiff = Math.abs(arr[0] - avg);

        System.out.print("Numbers closest to the average:\n ");
        for (i = 0; i < arr.length; i++) {
            float diff = Math.abs(arr[i] - avg);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        for (i = 0; i < arr.length; i++) {
            float diff = Math.abs(arr[i] - avg);
            if (diff == minDiff) {
                System.out.print(arr[i] + "\n");
            }
        }
    }
}
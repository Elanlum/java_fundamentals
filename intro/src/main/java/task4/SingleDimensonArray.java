package task4;

public class SingleDimensonArray {
    static int arr[] = new int [10];
    private static int max = 0;
    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) Math.round((Math.random() * 10));
            System.out.println(arr[j]);
        }

        for (int i = 1; i < arr.length; ++i) {
            if (arr [i] > max)
                max = arr[i];
        }
        System.out.println("Maximum value is: " + max);
    }
}

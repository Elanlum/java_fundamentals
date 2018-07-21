package task5;

public class DoubleDimensionArray {
    static int arr[][] = new int[10][10];
    private static int ind = 1;
    private static int revind = arr.length - ind;

    public static void main(String[] args) {
        for (int i = 1; i <= arr.length; ++i) {
            arr[i - 1][i - 1] = 1;
            arr[i - 1][arr.length - i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

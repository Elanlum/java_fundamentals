package task2;

public class Math {
    static float n = 10;
    static float E = 0.1f;
    static float [] arr = new float [10];
    static int j = 0;

    public static void main(String[] args) {
        int count = 1;
        M:
        for (float i = 0; i <= n-1; ++i) {
            float an = 1/((i+1)*(i+1));
            ++count;
            for (int j = 0; j < 1; ++j) {
                arr [j] = an;
                System.out.print(arr[j]+ " --> ");
                if (arr [j] < E) {
                    System.out.println("Thе value has found: ");
                    System.out.println("an = " + an);
                    break M;
                }
                else {
                    System.out.println("The goal value is not reached yet");
                }
            }
        }
    }
}

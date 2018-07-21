package task3;

public class Cycles {
        static int graph [][] = new int [2][10];
        public static void main(String[] args) {
            for (int i = 0; i < 2; ++i) {
                System.out.println(" ");
                for (int j = 0; j < 10; ++j) {
                    graph [0][j] = j;
                    int Res = (int) Math.round(Math.tan(2 * j) - 3);
                    graph [1][j] = Res;
                    String x = String.valueOf(graph[i][j]);
                    System.out.print(x + "     ");
                }
            }
        }

    }

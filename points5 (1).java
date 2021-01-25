import java.util.Scanner;

public class points5 {
    public static void main(String[] args) {
        System.out.println("array [n][m]. we need [n] ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(" we need [m] ");
        int m = scan.nextInt();
        int[][] array = new int[n][m]; // n rows m columns
        System.out.println("write first min thn max ");
        int min = scan.nextInt();
        int max = scan.nextInt();
        int[] max_values = new int[n];
        int[] min_values = new int[m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int random_number = (int) (Math.random() * max);
                if (random_number < min) {
                    random_number = +min;
                    if (random_number > max) {
                        random_number = random_number - (random_number - max - 1);
                    }
                }

                    //random number that for sure more than min and less than max
                    array[i][j] = random_number;
                    System.out.print(array[i][j] + "\t");
                }
                System.out.print("\n");
            }//filling the array with values between the range [min, max] + printing it


            //EACH ROW(maximum)
            for (int k = 0; k < n; k++) {
                int maxcurrent = min - 1;
                for (int j = 0; j < m; j++) {
                    if (array[k][j] > maxcurrent) {
                        maxcurrent = array[k][j];
                    }
                }
                max_values[k] = maxcurrent;
            }
            //EACH COLUMN(min)
            for (int k = 0; k < m; k++) {
                int mincurrent = max + 1;
                for (int j = 0; j < n; j++) {
                    if (array[j][k] < mincurrent) {
                        mincurrent = array[j][k];
                    }
                }
                min_values[k] = mincurrent;
            }
            System.out.println();
            System.out.print("Maxs: ");
            for (int l = 0; l < n; l++) {
                System.out.println("row " + l + " max is " + max_values[l]);
            }

            System.out.println();
            System.out.print("Mins: ");
            for (int o = 0; o < m; o++) {
                System.out.println("column " + o + " min is " + min_values[o]);
            }
        }
    }
